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

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor original do produto: ");
        double valorOriginal = entrada.nextDouble();
        System.out.print("Digite a porcentagem de desconto (0-100): ");
        double porcentagemDesconto = entrada.nextDouble();

        double valorDesconto = valorOriginal * (porcentagemDesconto / 100);
        double valorFinal = valorOriginal - valorDesconto;

        System.out.println("O desconto é de $" + valorDesconto);
        System.out.println("O valor final do produto com desconto é $" + valorFinal);

        entrada.close();
    }
}
