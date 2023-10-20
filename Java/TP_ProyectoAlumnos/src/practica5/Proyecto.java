/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Usuario
 */
public class Proyecto {
    private String nombreProyecto;
    private int codigo;
    private String nombreDirector;
    private int diml=0;
    private  Investigador [] equipo ;//maximo 50;

    public Investigador[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Investigador[] equipo) {
        this.equipo = equipo;
    }

    public Proyecto(String nombreProyecto, int codigo, String nombreDirector) {
        this.nombreProyecto = nombreProyecto;
        this.codigo = codigo;
        this.nombreDirector = nombreDirector;
        this.equipo = new Investigador[50];//se inicializan las posiciones en null
    }

    public int getDiml() {
        return diml;
    }

    public void setDiml(int diml) {
        this.diml = diml;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

   
    
    
}
