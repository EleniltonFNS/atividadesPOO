package Fauna;

import java.util.Locale;
import java.util.Scanner;

public class SafariFazenda {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        String animalCacado, localFuga, comidaCavalo, comidaLeao;

        System.out.println("\n -=-=-=- Safari-Fazenda -=-=-=-=-=-=- \n");

        System.out.println(" - Informar Cavalo    ");
        System.out.print("\n - Tamanho do cavalo (metros): ");
        float tamanhoCavalo = entrada.nextFloat();
        entrada.nextLine();
        System.out.print(" - Cor do cavalo: ");
        String corCavalo = entrada.next();
        System.out.print(" - Raça do cavalo: ");
        String raCavalo = entrada.nextLine();
        entrada.nextLine();
        System.out.print(" - O que o cavalo comeu: ");
        comidaCavalo = entrada.nextLine();
        System.out.print(" - Local para onde fugiu: ");
        localFuga = entrada.nextLine();

        Cavalo oCavalo = new Cavalo(tamanhoCavalo, corCavalo, raCavalo);

        System.out.println("\n ------------------------------------ ");

        System.out.println(" - Informar Leão    ");
        System.out.print("\n - Tamanho do leão (metros): ");
        float tamanhoLeao = entrada.nextFloat();
        entrada.nextLine();
        System.out.print(" - Cor do leão: ");
        String corLeao = entrada.nextLine();
        System.out.print(" - Leão tem Juba (sim ou não): ");
        String temJuba = entrada.next();
        String tEMJUBA = temJuba.toUpperCase();
        Boolean juba;
        if (tEMJUBA.equals("SIM") || tEMJUBA.equals("S") || tEMJUBA.equals("TEM") || tEMJUBA.equals("T")) {
            juba = true;
        } else {
            juba = false;
        }
        entrada.nextLine();
        System.out.print(" - Leão caçou: ");
        animalCacado = entrada.nextLine();
        System.out.print(" - O que o leão comeu: ");
        comidaLeao = entrada.nextLine();

        Leao oLeao = new Leao(tamanhoLeao, corLeao, juba);

        System.out.println("\n ------------------------------------ ");

        oCavalo.imprimirCavalo(comidaCavalo, localFuga);

        System.out.println("\n ------------------------------------ ");

        oLeao.imprimirLeao(comidaLeao, animalCacado);

        entrada.close();
    }
}
