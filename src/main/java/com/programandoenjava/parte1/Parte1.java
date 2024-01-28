package com.programandoenjava.parte1;

import java.util.Arrays;
import java.util.stream.*;

public class Parte1 {

    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo",
     * la salida debería ser "aloH odluM".
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {

//StringBuilder crea objetos que representa secuncia mutable de caracteres, es decir que un objeto que puede ser modificado.
        //A diferencia de String que no crea una secuecia mutable. Cundo concatenamos un string se crea otro ovjeto nuevo con esa concatenacion.

        StringBuilder res= new StringBuilder();

        int posicion = 0;

        if(cadena==null) {return "";};
        char[] arrayChart = cadena.toCharArray();
        //System.out.println("let "+arrayChart.toString());


        for (char letter : arrayChart) {
            System.out.println("letras "+Arrays.toString(arrayChart)+ " letra :"+letter);
            System.out.println("psocion "+posicion);

            if(!Character.isLetter(letter)) {
                res.append(letter);
                System.out.println("carac "+letter + " res: "+res );
                posicion = res.lastIndexOf(Character.toString(letter)) + 1;
                continue;
            }

            res.insert(posicion, letter);

        }
        return res.toString();

    }
}
