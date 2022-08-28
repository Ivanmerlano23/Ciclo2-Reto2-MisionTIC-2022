/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author ivanf
 */
public class CuerpoDeAgua {
    private String nombre;
    private int id;
    private String municipio;
    private float irca;

    public CuerpoDeAgua(String nombre, int id, String municipio, float irca) {
        this.nombre = nombre;
        this.id = id;
        this.municipio = municipio;
        this.irca = irca;
    }

    @Override
    public String toString() {
        return "CuerpoDeAgua{" + "nombre=" + nombre + ", id=" + id + ", municipio=" + municipio + ", irca=" + irca + '}';
    }
    
     public String nivel(){
        String nivel = "";
        if(getIrca() >= 0 && getIrca() <= 5){
             nivel = "SIN RIESGO";
        }else{
            if(getIrca() > 5 && getIrca() <= 14){
                nivel = "BAJO";
            }else{
                if(getIrca() > 14 && getIrca() <= 35){
                    nivel = "MEDIO";
                }else{
                    if(getIrca() > 35 && getIrca() <= 80){
                        nivel = "ALTO";
                    }else{
                        if(getIrca() > 80 && getIrca() <= 100){
                           nivel = "INVIABLE SANITARIAMENTE"; 
                        }
                    }
                }
            }
        }
        return nivel;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the irca
     */
    public float getIrca() {
        return irca;
    }

    /**
     * @param irca the irca to set
     */
    public void setIrca(float irca) {
        this.irca = irca;
    }
    
}
