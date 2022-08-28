/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.*;

/**
 *
 * @author ivanf
 */
public class reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            digitarTamanoDeV();
            addCuerpo();
            hallarNivel();
            hallarMedioOinferior();
            hallarMedioNombre();
            ircaMenor(); 
        }catch(NumberFormatException ex){
            System.out.println("Datos mal digitados");
        }catch(NegativeArraySizeException ex){
            System.out.println("No se puede darle valor negativo al tamaño del vector");
        }
        
        
    }
    
    public static CuerpoDeAgua[] V;
    public static float[] ircaMBajo;
    public static Scanner leer = new Scanner(System.in);
    
     public static void digitarTamanoDeV (){
        int n = Integer.parseInt(leer.nextLine());
        V = new CuerpoDeAgua[n];
        ircaMBajo = new float[n];
    }
    
    public static void addCuerpo(){
        String nombre, municipio;
        int id;
        float irca;
        for (int i = 0; i < reto2.V.length; i++) {
            String[] parte = leer.nextLine().split(" ");
            nombre = parte[0];
            id = Integer.parseInt(parte[1]);
            municipio = parte[2];
            irca = Float.parseFloat(parte[3]);
            V[i] = new CuerpoDeAgua(nombre, id, municipio, irca);
            ircaMBajo[i] = irca;
        }
        
    }
    
    
   public static void hallarNivel(){
       for (int i = 0; i < reto2.V.length; i++) {
           System.out.println(V[i].nivel());
       }
   }
   
   public static void hallarMedioOinferior(){
       int c = 0;
       for (int i = 0; i < reto2.V.length; i++) {
           if(V[i].nivel().equals("MEDIO") || V[i].nivel().equals("BAJO") || V[i].nivel().equals("SIN RIESGO")){
               c++;
           }
       }
       System.out.println(c);
   }
   
    public static void hallarMedioNombre(){
       boolean validacion = true;
       for (int i = 0; i < reto2.V.length; i++) {
           if(V[i].nivel().equals("MEDIO")){
                System.out.print(V[i].getNombre()+" ");
           }else{
               validacion = false;
           }
       }
       
       if(validacion){
           System.out.print("NA");
       }
   }
    
    public static void ircaMenor(){
         Arrays.sort(ircaMBajo);
         for (int i = 0; i < reto2.V.length; i++) {
           if(V[i].getIrca()==ircaMBajo[0]){
               System.out.println("\n"+V[i].getNombre()+" "+V[i].getId());
           }
       }
    }

    
}
