/*
Yuri Resende Corrêa - 20157082
 */
package ExRepetcao;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        
        int num, m = 0, cont = 1;
        Scanner scan = new Scanner (System.in);
        
        while (cont <= 15){
            System.out.printf("Digite o %dº número: ", cont);
            num = scan.nextInt();
            cont++;
            
            if (num > m){
                m = num;
            }
            
        }
        System.out.println("O maior número digitado é o: "+m);
    }
}
