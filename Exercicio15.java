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

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();

        double imposto;
        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto = salario * 0.075 - 142.80;
        } else if (salario <= 3751.05) {
            imposto = salario * 0.15 - 354.80;
        } else if (salario <= 4664.68) {
            imposto = salario * 0.225 - 636.13;
        } else {
            imposto = salario * 0.275 - 869.36;
        }

        System.out.println("Imposto de renda a ser pago: R$" + imposto);

        entrada.close();
    }
}
