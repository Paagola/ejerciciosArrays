package funciones;

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
     * 
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

    /**
     * Según el número de mes que introduzcas devuelve el nombre del mes.
     * 
     * @param n
     * @return
     */
    public static String imprimirMes(int n) {
        switch (n) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "";
        }
    }

    /**
     * Verificar si un número es primo o no
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1) {
            return false;
        }

        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Crear una tabla de dos filas y las columnas según la longitud del array
     * indicando el indice y el valor por índice.
     * 
     * @param array
     */
    public static void imprimirTabla(int[] array) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= array.length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("╔════════");
                } else if (i == 0 && j == array.length) {
                    System.out.println("╦══════╗");
                } else if (i == 0) {
                    System.out.print("╦══════");
                } else if (i == 1 && j == 0) {
                    System.out.printf("║%7s ║", "Indice");
                } else if (i == 1) {
                    System.out.printf("%5s ║", j - 1);
                } else if (i == 2 && j == 0) {
                    System.out.print("\n╠════════");
                } else if (i == 2 && j == array.length) {
                    System.out.print("╬══════╣\n");
                } else if (i == 2) {
                    System.out.print("╬══════");
                } else if (i == 3 && j == 0) {
                    System.out.printf("║%7s ║", "Valor");
                } else if (i == 3) {
                    System.out.printf("%5d ║", array[j - 1]);
                } else if (i == 4 && j == 0) {
                    System.out.print("\n╚════════");
                } else if (i == 4 && j == array.length) {
                    System.out.println("╩══════╝");
                } else {
                    System.out.print("╩══════");
                }
            }
        }
    }

    public static int[] arraysConPrimos(int[] array) {

        boolean correcto = true;
        while (correcto) {
            correcto = false;
            for (int i = 1; i < array.length; i++) {
                if (arrays.esPrimo(array[i]) && !arrays.esPrimo(array[i - 1])) {
                    int aux = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = aux;
                    correcto = true;
                }
            }
        }
        return array;

    }

    /**
     * Imprimer un array de strings teniendo en cuenta que las palabras no son demasiado grades.
     * @param array
     */
     public static void imprimirTablaString(String[] array) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= array.length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("╔════════");
                } else if (i == 0 && j == array.length) {
                    System.out.println("╦════════╗");
                } else if (i == 0) {
                    System.out.print("╦════════");
                } else if (i == 1 && j == 0) {
                    System.out.printf("║%7s ║", "Indice");
                } else if (i == 1) {
                    System.out.printf("%6s  ║", j - 1);
                } else if (i == 2 && j == 0) {
                    System.out.print("\n╠════════");
                } else if (i == 2 && j == array.length) {
                    System.out.print("╬════════╣\n");
                } else if (i == 2) {
                    System.out.print("╬════════");
                } else if (i == 3 && j == 0) {
                    System.out.printf("║%7s ║", "Valor");
                } else if (i == 3) {
                    System.out.printf("%7s ║", array[j - 1]);
                } else if (i == 4 && j == 0) {
                    System.out.print("\n╚════════");
                } else if (i == 4 && j == array.length) {
                    System.out.println("╩════════╝");
                } else {
                    System.out.print("╩════════");
                }
            }
        }
    }

    /**
     * Detecta si una palabra es un color o es una plabra normal
     * @param palabra
     * @return
     */
    public static boolean esColor(String palabra){
        switch(palabra.toLowerCase()){
            case "morado": return true;
            case "rojo": return true;
            case "amarillo": return true;
            case "blanco": return true;
            case "negro": return true;
            case "naranja": return true;
            case "salmón", "salmon": return true;
            case "azul": return true;
            case "gris": return true;
            case "marron": return true;
            case "rosa": return true;
            default: return false;
        }
    }
}
