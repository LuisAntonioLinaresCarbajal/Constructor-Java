/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Tony
 */

import javax.swing.JOptionPane; //importar la clase JOptionPane

public class Constructor {
    
    int pasajeros; // numero de pasajeros
    int capasidad_combustible ;// capacidad del combustible
    int combustible_consumido; //combustible consumido
    
    //constructor 
    
    Constructor(int p, int c, int m){
      //nombre = JOptionPane.showInputDialog(null,"Escribe tu nombre"); //pdeir indormacion al usuario
        
        pasajeros=p;
        capasidad_combustible= c;
        combustible_consumido=m;
    }
    
    //retorno del rango
    int rango(){
        return combustible_consumido*capasidad_combustible;
    }
    // calcula el combustible necesario para la distancia proporcionada
    double capacidad_nueva(int miles){
        return(double)miles/combustible_consumido;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Constructor bochito = new Constructor(9,15,20);
        Constructor renault = new Constructor(10,25,30);
      
        double galones;
        int distancia=250;
        
         galones=bochito.capacidad_nueva(distancia);
        System.out.println("Para ir a "+distancia+" en un bochito, se necesita "+galones+" galones");

        galones=renault.capacidad_nueva(distancia);
        System.out.println("Para ir a "+distancia+" en renault, se necesita "+galones+" galones");
                
                
    }
    
    
}
