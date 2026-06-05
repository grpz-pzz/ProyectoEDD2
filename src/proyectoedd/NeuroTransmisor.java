package proyectoedd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gianc
 */
public class NeuroTransmisor {
    public String ID;
    public String nombre;
    public Efecto efecto;
    public float velocidad;
    public String desc;
    
    public NeuroTransmisor(String ID, String nombre, Efecto efecto, float velocidad, String desc)
    {
        this.ID = ID;
        this.nombre = nombre;
        this.efecto = efecto;
        this.velocidad = velocidad;
        this.desc = desc;
    }
    
    public static enum Efecto {
        EXCITATORIO,
        INHIBITORIO,
        MODULADOR
    }
}
