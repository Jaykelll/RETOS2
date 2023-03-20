import java.util.Scanner;
//crear clase
public class Reto2 {
     //crear metodo
     public static void main(String[]agrs) {
        //declatrar variables
        String palabra;
        int derecha;
        int izquierda=0;
        //crear array
        char[]polindromo;
//intanciar clases
Scanner lectura=new Scanner(System.in);
//solicitar datos
System.out.println("ingrse la palbra que desea ");
//capturar datos
palabra=lectura.nextLine();
palabra=palabra.toLowerCase();      //convertir a minusculas
palabra=palabra.replace(" ", "");   //remplasar espacios en blanco
polindromo=palabra.toCharArray();
derecha=polindromo.length-1;
//crear bucle
while (izquierda<derecha) {
    //crear condicion
    if (polindromo[izquierda]==polindromo[derecha]) {
        derecha--;
        izquierda++;
        
    }else{
        System.out.println("La palabra no es un palindromo");
        break;
    }
}
        if (izquierda==derecha) {
            System.out.println("La palabra es un palindromo");
            
        }
        //limpiar buffer
        lectura.close();
    }
}
