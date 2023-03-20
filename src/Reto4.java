import java.util.Scanner;
//crear clase
public class Reto4{
    //crear metodo
    public static void main(String[] args) {
        //crear matriz
    char[][]pantalla=new char[5][4];
    pantalla[0]=new char[]{'_','_','_','_'};
    pantalla[1]=new char[]{'7','8','9','/'};
    pantalla[2]=new char[]{'4','5','6','x'};
    pantalla[3]=new char[]{'1','2','3','-'};
    pantalla[4]=new char[]{'C','0','=','+'};
    //instanciar clases
    Scanner lectura=new Scanner(System.in);
//crear bucle
    for(int m=0;m<pantalla.length;m++) {
        for(int k=0;k<pantalla[m].length;k++) {
            System.out.print(pantalla[m][k] + " ");
        }
        System.out.println();
        }
        //limpiar buffer
        lectura.close();
    }
}