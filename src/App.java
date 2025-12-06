import funciones.arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("""
                            EJERCICIOS ARRAYS
                ==========================================
                EJERCICIO 1 | EJERCICIO 8  |
                EJERCICIO 2 | EJERCICIO 9  |
                EJERCICIO 3 | EJERCICIO 10 |
                EJERCICIO 4 | EJERCICIO 11 |
                EJERCICIO 5 | EJERCICIO 12 |
                EJERCICIO 6 | 
                EJERCICIO 7 | 
                """);

            int eleccion = Integer.parseInt(System.console().readLine("Introduce el número del ejercicio: "));

            switch (eleccion) {
                case 1: //EJERCICIO 1
                    int[] num = new int[12];
                    num[0] = 39;
                    num[1] = -2;
                    num[4] = 0;
                    num[6] = 14;
                    num[8] = 5;
                    num[9] = 120;

                    arrays.imprimirArrayInt(num);
                    
                
                case 2: //EJERCICIO 2 
                    Character[] simbolo = new Character[10];
                    simbolo[0] = 'a';
                    simbolo[1] = 'x';
                    simbolo[4] = '@';
                    simbolo[6] = ' ';
                    simbolo[7] = '+';
                    simbolo[8] = 'Q';

                arrays.imprimirArrayChar(simbolo);

                break;

                case 3: //EJERCICIO 3
                    int[] num3 = new int [10];
                    System.out.println("Por favor introduzca 10 enteros: ");

                    for (int i = 0; i < num3.length; i++){
                        num3[i] = Integer.parseInt(System.console().readLine((i+1) + "-> "));
                    }
                    arrays.imprimirArrayIntAlReves(num3);
                break;

                case 4: //EJERCICIO 4
                    int[] num4 = new int[12];

                    for (int i = 0; i < num4.length; i++ ){
                        num4[i] = (int)(Math.random()*13);
                    }
                    int[] num42 = arrays.arrayElevadoA(num4, 2);
                    int[] num43 = arrays.arrayElevadoA(num4, 3);

                    int espacios1 = num4[0]; 
                    espacios1 = arrays.contarNumeros(arrays.mayorArray(num4));

                    int espacios2 = num42[0];
                    espacios2 = arrays.contarNumeros(arrays.mayorArray(num42));

                    System.out.printf("n%"+espacios1+"s| n2%"+(espacios2-1)+"s| n3%n", " ", " ");
                    for (int i = 0; i < num4.length; i++ ){
                        System.out.printf(num4[i]+"%"+((arrays.contarNumeros(num4[i])==espacios1)?1:espacios1)+"s| ", " ");
                        System.out.printf(num42[i]+"%"+((arrays.contarNumeros(num42[i])!=espacios2)?(arrays.contarNumeros(num42[i])==2)?
                        2:3
                        :espacios2-2)+"s| ", " ");
                        System.out.print(num43[i]);
                        System.out.println("");
                    }
                    break;

                case 5: //EJERCICIO 5
                    int[] num5 = new int[8];
                    for (int i = 0; i < num5.length; i++){
                        num5[i] = Integer.parseInt(System.console().readLine((i+1) + "-> "));
                    }

                    int maximo = arrays.mayorArray(num5);
                    System.out.println(maximo);
                    int minimo = arrays.menorArray(num5);
                    System.out.println(minimo);
                break;

                case 6: //EJERCICIO 6 
                    int[] num6 = arrays.crearArrayRandom(12,0, 100);

                    arrays.imprimirArrayInt(num6);
                    num6 = arrays.moverDerecha(num6);
                    arrays.imprimirArrayInt(num6);
                break; 
                
                case 7: 
                    int[] num7 = arrays.crearArrayRandom(100, 0, 20);

                    arrays.imprimirArrayInt(num7);
                    int numero = Integer.parseInt(System.console().readLine("Introduce un número a sustituir: "));
                    int numero2 = Integer.parseInt(System.console().readLine("Intrudce el sustituto: "));

                    for (int i = 0; i < num7.length; i++) {
                        if (num7[i] == numero){
                            System.out.print("\""+numero2+"\" ");
                        }
                        else System.out.print(num7[i]+" ");
                            
                    }
                break;

                case 8: //EJERCICIO 8
                    int[] tempMeses = arrays.crearArrayRandom(12, 0, 40);

                    for (int i = 1; i <= tempMeses.length; i++){
                        System.out.printf("%10s | ", arrays.imprimirMes(i));
                        for (int j = 0; j < tempMeses[i-1]; j++ ){
                            System.out.print("*");
                        } System.out.println(tempMeses[i-1]+"ºC");
                    }
                break;

                case 9: //EJERCICIO 9
                    int[] num9 = arrays.crearArrayRandom(8, 0, 350);

                    arrays.imprimirArrayInt(num9);
                    System.out.println("");

                    for (int i = 0; i < num9.length; i++){
                        if (num9[i]%2 == 0){
                            System.out.println(num9[i]+" par");
                        } else {
                             System.out.println(num9[i]+" impar");
                        }
                    }

                case 10: 

                    int[] num10 = arrays.crearArrayRandom(20, 0, 100);

                    boolean correcto = true;
                    int aux = 0;

                    while(correcto){
                        correcto = false;
                        for (int i = 1; i < num10.length; i++){
                            if (num10[i]%2 == 0 && num10[i-1]%2 != 0){
                                aux = num10[i-1];
                                num10[i-1] = num10[i];
                                num10[i] = aux;
                                correcto = true;
                            }
                        }
                    }
                    arrays.imprimirArrayInt(num10);
                break;

                case 11: //EJERICIO 11
                    int[] num11 = arrays.crearArrayRandom(10, 0, 350);

                    arrays.imprimirTabla(num11);

                    arrays.arraysConPrimos(num11);

                    arrays.imprimirTabla(num11);

                break;

                case 12: //EJERCICIO 12
                    int[] num12 = arrays.crearArrayRandom(10, 0, 50);
                    arrays.imprimirTabla(num12);

                    int posicion1 = Integer.parseInt(System.console().readLine("Introduzca la posición inicial (0-9): "));
                    int posicion2 = Integer.parseInt(System.console().readLine("Introduzca la posición final (0-9): "));

                    int aux2 = 0;
                    aux = num12[num12.length-1];
                    for (int i = 0; i < num12.length; i++){
                        
                        if (posicion1 > i){
                            aux2 = num12[i];
                            num12[i] = aux;
                            aux = aux2;
                        } else if (posicion1 == i){
                            aux2 = num12[i];
                            num12[i] = aux;
                            aux = aux2;
                        } else if (posicion2 <= i){
                            aux2 = num12[i];
                            num12[i] = aux;
                            aux = aux2;
                        }
                    }

                    arrays.imprimirTabla(num12);

                case 13: //EJERCICIO 13
                    int[] num13 = arrays.crearArrayRandom(100, 0, 500);
                    arrays.imprimirArrayInt(num13);

                    int min_max = Integer.parseInt(System.console().readLine("\n¿Que quiere destacar? (1-minimo, 2-máximo): "));
                    
                    
                    switch(min_max){
                        case 1: 
                        for (int i = 0; i < num13.length; i++ ){
                            if (num13[i] == arrays.menorArray(num13))
                                System.out.print("**"+num13[i]+"** ");
                            else
                                System.out.print(num13[i]+" ");
                        }
                            break;

                        case 2: 
                            for (int i = 0; i < num13.length; i++ ){
                            if (num13[i] == arrays.mayorArray(num13))
                                System.out.print("**"+num13[i]+"** ");
                            else
                                System.out.print(num13[i]+" ");
                        }
                            break;

                        default: System.out.println("Elección no perimitada, lo sentimos.");
                        break;

                    }
                break;

                case 14: //EJERCICIO 14
                    String[] palabras14 = new String[8];

                    for (int i = 0; i < palabras14.length; i++){
                        palabras14[i] = System.console().readLine("-> ");
                    }

                    System.out.println("Array Original: ");
                    arrays.imprimirTablaString(palabras14);
                    
                    String auxStr = "";
                    correcto = true;
                    while(correcto){
                         correcto = false;
                        for (int i = 1; i < palabras14.length; i++){
                        if (arrays.esColor(palabras14[i]) && !arrays.esColor(palabras14[i-1])){
                            auxStr = palabras14[i-1];
                            palabras14[i-1] = palabras14[i];
                            palabras14[i] = auxStr;
                            correcto = true;
                        }
                    }
                    }
                    
                    arrays.imprimirTablaString(palabras14);
                    break;


                default:
                    break;
            }
    }
}
