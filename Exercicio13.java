/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listarevisao2;

/**
 *
 * @author Vitor Hugo
 */

 import java.util.Scanner;
 
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = entrada.nextDouble();

        double maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);

        entrada.close();
    }
}
