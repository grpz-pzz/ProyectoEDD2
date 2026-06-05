/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import proyectoedd.Grafo.Neurona;
import proyectoedd.Grafo.Sinapsis;
import proyectoedd.lista.Lista;

/**
 *
 * @author gianc
 */
public class Controlador {
    
    public static Controlador controlador;
    
    public static HashTable neuroTransmisores;
    
    public Lista<Neurona> neuronas = new Lista<>();
    
    public Controlador()
    {
        controlador = this;
        neuroTransmisores = new HashTable(300);
    }
    
    public static void AddNeuro(String key, NeuroTransmisor n)
    {
        neuroTransmisores.put(key, n);
    }
    
    public void CrearGrafo()
    {
        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Grafo");
        
        for (int i = 0; i < neuronas.size(); i++) {
            Neurona actual = neuronas.obtener(i);
            graph.addNode(actual.id);
        }
        
        
        for (int i = 0; i < neuronas.size(); i++) {     
            Neurona actual = neuronas.obtener(i);
            
            for (int y = 0; y < actual.conexionesSalientes.size(); y++) {   
                Sinapsis sinapsis = actual.conexionesSalientes.obtener(y);
                 
                graph.addEdge(sinapsis.idOrigen.id + sinapsis.idDestino.id, sinapsis.idOrigen.id, sinapsis.idDestino.id);
            }
        }
        
        graph.display();
    }
}
