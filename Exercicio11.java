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

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha: 1 - Pedra, 2 - Papel, 3 - Tesoura");
        int escolhaUsuario = entrada.nextInt();

        int escolhaComputador = (int) (Math.random() * 3) + 1;

        if (escolhaUsuario < 1 || escolhaUsuario > 3) {
            System.out.println("Escolha inválida.");
        } else {
            System.out.println("Escolha do computador: " + escolhaComputador);
            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
                    (escolhaUsuario == 2 && escolhaComputador == 1) ||
                    (escolhaUsuario == 3 && escolhaComputador == 2)) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }
        }

        entrada.close();
    }
}
