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

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = entrada.nextLine();

        texto = texto.replaceAll("\\s+", "").toLowerCase();

        String invertido = new StringBuilder(texto).reverse().toString();
        if (texto.equals(invertido)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        entrada.close();
    }
}
