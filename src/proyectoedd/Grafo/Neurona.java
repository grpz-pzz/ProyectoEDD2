/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd.Grafo;

import proyectoedd.lista.Lista;

/**
 *
 * @author gianc
 */
public class Neurona {
    public String id;
    public Lista<Sinapsis> conexionesSalientes;

    public Neurona(String id) {
        this.id = id;
        this.conexionesSalientes = new Lista<>();
    }

    public void agregarConexion(Sinapsis nuevaSinapsis) {
        conexionesSalientes.agregar(nuevaSinapsis);
    }
}
