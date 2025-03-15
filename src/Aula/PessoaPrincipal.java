package Aula;

import java.util.Scanner;

public class PessoaPrincipal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("\n --------------------------------- ");

        System.out.print("\n - Nome do cliente: ");
        cliente.setNome(entrada.nextLine());
        System.out.print(" - CPF do cliente: ");
        cliente.setCpf(entrada.nextLine());
        System.out.print(" - Idade do cliente: ");
        cliente.setIdade(entrada.nextLine());
        System.out.print(" - Endereço do cliente: ");
        cliente.setEndereco(entrada.nextLine());
        System.out.print(" - Contato do cliente: ");
        cliente.setContato(entrada.nextLine());
        System.out.print(" - Email do cliente: ");
        cliente.setEmail(entrada.nextLine());

        System.out.println("\n --------------------------------- ");

        System.out.print("\n - Sálario Bruto: ");
        cliente.setSalarioBruto(entrada.nextFloat());
        System.out.print(" - Imposto de Renda: ");
        cliente.setImpostoRenda(entrada.nextFloat());
        entrada.nextLine();

        System.out.println("\n --------------------------------- ");

        cliente.imprimirCliente();

        Fornecedor fornecedor = new Fornecedor();

        System.out.println("\n --------------------------------- ");

        System.out.print("\n - Nome do fornecedor: ");
        fornecedor.setNome(entrada.nextLine());
        System.out.print(" - CNPJ do fornecedor: ");
        fornecedor.setCnpj(entrada.nextLine());
        System.out.print(" - Idade do fornecedor: ");
        fornecedor.setIdade(entrada.nextLine());
        System.out.print(" - Endereço do fornecedor: ");
        fornecedor.setEndereco(entrada.nextLine());
        System.out.print(" - Contato do fornecedor: ");
        fornecedor.setContato(entrada.nextLine());
        System.out.print(" - Email do fornecedor: ");
        fornecedor.setEmail(entrada.nextLine());

        System.out.println("\n --------------------------------- ");

        System.out.print("\n - Valor do produto: ");
        fornecedor.setValorProduto(entrada.nextFloat());
        System.out.print(" - Imposto sobre o produto: ");
        fornecedor.setImposto(entrada.nextFloat());

        System.out.println("\n --------------------------------- ");

        fornecedor.imprimirFornecedor();

    }
}
