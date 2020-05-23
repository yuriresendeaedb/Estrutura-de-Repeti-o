/*
Yuri Resende Corrêa - 20157082
 */
package ExRepetcao;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
        int num, cont = 0;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite um número (positivo) quer contar: ");
        num = scan.nextInt();
        
        while (cont <= num){
            System.out.print(cont+" ");
            cont++;
            
        }
    }
}
