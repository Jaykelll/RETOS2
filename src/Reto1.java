import java.util.Scanner;
//crear clase
public class Reto1 {
    //crear metodo
    public static void main(String[] args) {
        //crear array
                String[]palabras={"gato","perro","elefante","león","tigre","mono","jirafa","rinoceronte","hipopótamo","cocodrilo"};
                String palabraAdivinar=palabras[(int)(Math.random()*palabras.length)];
                char[]palabraAdivinarArray=palabraAdivinar.toCharArray();
                //declarar variables
                int intentos=7;
                boolean juegoTerminado=false;
                boolean[] letrasAdivinadas = new boolean[palabraAdivinarArray.length];
                //instaciar clases
                Scanner input = new Scanner(System.in);
                //solicitar datos
                System.out.print("Ingrese la cantidad de dinero que desea apostar: ");
                //capturar datos
                double apuesta = input.nextDouble();
                input.nextLine();
                int ganados = 0;
                int perdidos = 0;
                //crear bucle
                while (!juegoTerminado) {
                    System.out.print("Palabra: ");
                    for (int i=0;i<palabraAdivinarArray.length;i++) {
                        //crear condicion
                        if (letrasAdivinadas[i]) {
                            System.out.print(palabraAdivinarArray[i]);
                        } else {
                            System.out.print("_");
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                    System.out.println("Intentos restantes:" +intentos);
                    System.out.print("Ingrese una letra:");
                    char letra = input.nextLine().charAt(0);
                    boolean acierto=false;
                    for (int i=0;i<palabraAdivinarArray.length;i++) {
                        if (palabraAdivinarArray[i]==letra){
                            letrasAdivinadas[i]=true;
                            acierto=true;
                        }
                    }
                    if (!acierto){
                        intentos--;
                        System.out.println("Letra incorrecta");
                    }
                    boolean todasAdivinadas= true;
                    for (int i = 0; i < letrasAdivinadas.length; i++) {
                        if (!letrasAdivinadas[i]) {
                            todasAdivinadas = false;
                        }
                    }
                    if (todasAdivinadas) {
                        System.out.println("¡Ganaste!");
                        juegoTerminado = true;
                        ganados++;
                    } else if (intentos == 0) {
                        System.out.println("¡Perdiste! La palabra era " + palabraAdivinar);
                        juegoTerminado = true;
                        perdidos++;
                    }
                }
                double ganancias = (ganados - perdidos) * apuesta;
                System.out.println("Ganados: " + ganados);
                System.out.println("Perdidos: " + perdidos);
                System.out.println("Ganancias: " + ganancias);
                //limpiar buffer
                input.close();
            }
}
