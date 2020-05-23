/*
Yuri Resende Corrêa - 20157082
 */
package ExRepetcao;

import java.util.Scanner;

public class ez03 {
    public static void main(String[] args) {
        
        int num, cont = 1, soma = 0;
        
        Scanner scan = new Scanner (System.in);
        
        while (cont <= 20){
            System.out.printf("Digite o %dº número: ", cont);
            num = scan.nextInt();
            cont++;
            soma += num;
        }    
            
        System.out.println("\n"+soma);
        
    }
}
