package IndiceMassaCorporal;

import java.util.Locale;
import java.util.Scanner;

public class IMC {

    public static void menu() {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        int opcMenu;

        Usuario usuario = new Usuario();
        Saude saude = new Saude();

        System.out.println("\n -=-=- Calculadora de IMC -=-=-=-=-\n");

        do {
            System.out.println(" ------------------------------");
            System.out.println(" 1 - Calcular IMC");
            System.out.println(" 0 - Sair");
            System.out.println(" ------------------------------");

            System.out.print(" -> ");
            opcMenu = entrada.nextInt();

            switch (opcMenu) {
                case 1:
                    System.out.println("\n -=-=- Calcular IMC -=-=-=-=-\n");
                    System.out.print(" Nome: ");
                    entrada.nextLine();
                    usuario.setNome(entrada.nextLine());
                    System.out.print(" CPF: ");
                    usuario.setCpf(entrada.nextLine());
                    System.out.print(" Altura: ");
                    usuario.setAltura(entrada.nextFloat());
                    System.out.print(" Peso: ");
                    usuario.setPeso(entrada.nextFloat());

                    System.out.println(" ------------------------------");
                    System.out.println(" Nome: " + usuario.getNome());
                    System.out.println(" Altura: " + usuario.getAltura() + " - Peso: " + usuario.getPeso());
                    System.out.printf("\n IMC: %.2f - %s", saude.calcularIMC(usuario), saude.classificarIMC(saude.calcularIMC(usuario)));
                    System.out.println("\n ------------------------------");

                    System.out.println("\n - Deseja calcular novamente? ");
                    break;

                case 0:
                    System.out.println("\n\n -=-=- Saindo -=-=-=-=- \n");
                    System.out.println(" - Obrigado por usar nosso sistema!");
                    break;
                default:
                    System.out.println("\n - Opção inválida. Tente novamente");
            }

        } while (opcMenu != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}