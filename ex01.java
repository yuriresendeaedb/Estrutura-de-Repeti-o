/*
Yuri Resende Corrêa - 20157082
 */
package ExRepetcao;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        int num, cont = 1;
        
        Scanner scan = new Scanner (System.in);     
        
        while (cont != 11){
            System.out.printf("Digite o %dº número: ", cont);
            num = scan.nextInt();
            cont++;
            if (num >= 0){
                System.out.println("POSITIVO");
            
            }else{
                System.out.println("NEGATIVO");
            }
        }
    }
}
