/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd.Grafo;

/**
 *
 * @author gianc
 */
public class Sinapsis {
    public Neurona idOrigen;
    public Neurona idDestino;
    public float distancia;
    public String idNeurotransmisor;
    public float factorK;

    public Sinapsis(Neurona idOrigen, Neurona idDestino, float distancia, String idNeurotransmisor, float factorK) {
        this.idOrigen = idOrigen;
        this.idDestino = idDestino;
        this.distancia = distancia;
        this.idNeurotransmisor = idNeurotransmisor;
        this.factorK = factorK;
    }
}
