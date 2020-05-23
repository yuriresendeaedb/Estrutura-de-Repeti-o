/*
Yuri Resende Corrêa - 20157082
 */
package ExRepetcao;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        
        float alt, sal, cont = 1, medsal = 0, altmax = 0, altmin = 3;
        String sx;
        int contm = 0;
        
        Scanner scan = new Scanner (System.in);
        Scanner scans = new Scanner (System.in);
        
        while (cont <= 3){
            System.out.print("Digite a altura do funcionário: ");
            alt = scan.nextFloat();
            System.out.print("Digite o Salário do funcionário: R$");
            sal = scan.nextFloat();
            System.out.print("Digite o sexo do funcionário [M?F]: ");
            sx = scans.nextLine();
            System.out.println("");
            cont++;
        
            medsal += sal;
            if (alt > altmax){
                altmax = alt;
            }
            if (alt < altmin){
                altmin = alt;
            }
            if (sx.equals("f") && sal <= 1000){
                contm++;
                System.out.println(contm);
            }
        }
        System.out.println("A média do salário do grupo é: R$"+medsal / 3);
        System.out.println(altmax+" é a maior altura e a menor é "+altmin);
        System.out.printf("Há %d mulheres que recebe, até R$1000,00.", contm);
    }
}
