/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoedd;

import proyectoedd.Grafo.Neurona;

/**
 *
 * @author gianc
 */
public class Utilidades {
    
    public static Neurona GetNeurona(String id)
    {
        for (int i = 0; i < Controlador.controlador.neuronas.size(); i++) {
            
            Neurona actual = Controlador.controlador.neuronas.obtener(i);
            
            if (actual.id.equals(id)) {
                return actual;
            }
        }
        
        Neurona n = new Neurona(id);
        Controlador.controlador.neuronas.agregar(n);
        
        return n;
    }
}
