/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p10;
import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion
        int n;
        //procedimiento
        n = pedir();
        mostrar (n);
    }
    public static int pedir (){
        int n;
        Scanner teclado = new Scanner (System.in);
        do{
        System.out.println("*****   Fibbonachi   *****");
        System.out.println("Introduce los numeros que deseas conocer");
        n = teclado.nextInt();
        }while (n < 1);
        return n;
    }
    public static void mostrar (int n){
        int i = 0;
        int j = 1;
        //se imprimen los primeros numeros de fibonachi
        System.out.println("Los primeros "+n+" numeros de la serie de Fibbonachi son");
        System.out.print("0 ");
        //se imprimen los restantes
        if (n > 1){
            System.out.print("1 ");
        }
        if (n > 2){
            for ( int k = n - 2; k > 0; --k){
                j = i + j;
                i = j - i;
                System.out.print(j+" ");
            } 
        }
    }
    
}
