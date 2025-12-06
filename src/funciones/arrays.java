package funciones;

import java.io.StringReader;

public class arrays {

    /**
     * Imprime un array de int
     * 
     * @param numero
     */
    public static void imprimirArrayInt(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
        System.out.println();
    }

    /**
     * Imprime el array de int al revés.
     * 
     * @param numero
     */
    public static void imprimirArrayIntAlReves(int[] numero) {
        for (int i = (numero.length - 1); i >= 0; i--) {
            System.out.print(numero[i] + " ");
        }
    }

    /**
     * Imprime un array de carácteres
     * 
     * @param caracter
     */
    public static void imprimirArrayChar(Character[] caracter) {
        for (int i = 0; i < caracter.length; i++) {
            System.out.print(caracter[i] + " ");
        }
        System.out.println();
    }

    /**
     * Coger el mayor número según el array
     * 
     * @param array
     * @param numero
     * @return
     */
    public static int mayorArray(int[] array) {
        int numero = 0;
        for (int i = 0; i < array.length; i++) {
            numero = (numero < array[i]) ? array[i] : numero;
        }
        return numero;
    }

    /**
     * Cuenta cuantos números hay en un dígito
     * 
     * @param numero
     * @return
     */
    public static int contarNumeros(int numero) {
        int contador = 0;
        while (numero != 0) {
            contador++;
            numero /= 10;
        }
        return contador;
    }

    /**
     * Elevando un array a un número indicado
     * 
     * @param array
     * @param numero
     * @return
     */
    public static int[] arrayElevadoA(int[] array, int numero) {
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int numero2 = 1;
            for (int j = 0; j < numero; j++) {
                numero2 = numero2 * array[i];
            }
            newarray[i] = numero2;
        }
        return newarray;
    }

    /**
     * Declara cual es el menor número del array
     * 
     * @param array
     * @param numero
     * @return
     */
    public static int menorArray(int[] array) {
        int numero = array[0];
        for (int i = 0; i < array.length; i++) {
            numero = (numero > array[i]) ? array[i] : numero;
        }
        return numero;
    }

    public static int[] crearArrayRandom(int longitud, int desde, int hasta) {
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (desde + hasta) + 1);
        }
        return array;
    }

    /**
     * Mueve un array a la derecha por posición
     * @param array
     * @return
     */
    public static int[] moverDerecha(int[] array) {
        int aux = array[array.length - 1];
        int aux2 = 0;

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                aux2 = array[i];
                array[i] = aux;
            } else if (i % 2 != 0) {
                aux = array[i];
                array[i] = aux2;
            } else {
                aux2 = array[i];
                array[i] = aux;
            }
        }
        return array;
    }

    public static String imprimirMes(int n){
        switch (n) {
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "";
        }
    }

}
