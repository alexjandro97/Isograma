/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isograma;

/**
 *
 * @author alexj
 */
public class Isograma {

    static String palabra = "murcielago";
    static int isograma;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comprobarIsograma(palabra);
    }
    
    static private void comprobarIsograma(String palabra) {
        //escaneo con dos bucles for la palabra, por cada letra escaneo el resto 
        //de letras.
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = i+1; j < palabra.length(); j++) {
                //si la letra del primer for es distinta a las letras que se escanean
                //en el segundo for no pasa nada, sigue escaneando, sino +1 a la 
                //variable isograma(int)
                if (palabra.charAt(i) == palabra.charAt(j)) {
                    isograma++;
                } 
            }
        }
        //si isograma es igual a 0 (que no se repiten letras) imprime que es un isograma
        //sino, que no lo es.
        if (isograma == 0) {
            System.out.println("Es un Isograma");
        } else {
            System.out.println("No es un Isograma");
        }
    }
}
