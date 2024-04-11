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

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a idade do usuário: ");
        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("O usuário é maior de idade.");
        } else {
            System.out.println("O usuário é menor de idade.");
        }

        entrada.close();
    }
}
