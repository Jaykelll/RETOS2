import java.util.Scanner;
//crear clase
public class Reto3 {
    //crear metodo
    public static void main(String[] args) {
        //intanciar clase
        Scanner lectura=new Scanner(System.in);
        //crear matriz
        String[][]alimentos=new String[16][2];
        //crear bucle
        for (int i=0;i<alimentos.length;i++) {
            //solicitar datos
            System.out.println("Por favor ingresa el nombre del producto en la posición_"+(i+1)+":");
            //capturar datos
            alimentos[i][0] = lectura.nextLine();
            System.out.println("Por favor ingresa el precio del producto en la posición_"+(i+1)+":");
            alimentos[i][1] = lectura.nextLine();
        }
        System.out.println("Código del producto | Nombre del producto | Precio del producto");
        for (int i=0;i<alimentos.length;i++) {
            System.out.println(i+" | "+alimentos[i][0]+" | $"+alimentos[i][1]);
        }
        //limpiar el bufffer
        lectura.close();
    }
}

