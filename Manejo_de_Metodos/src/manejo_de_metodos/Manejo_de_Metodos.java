/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_de_metodos;

/**
 *
 * @author INSPIRON
 */
public class Manejo_de_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion.metodoUno();
        Operacion.metodoTres("52");
        Operacion.metodoUno();
        String m = Operacion.metodoDos();
        System.out.printf(m);
        Operacion.metodoTres("20","51");
        System.out.printf(m);
        Operacion.metodoUno();
    }
}

 
