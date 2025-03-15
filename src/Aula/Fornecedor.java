package Aula;

public class Fornecedor extends Pessoa{

    private String cnpj;
    private float valorProduto, imposto;

    public Fornecedor() {}

    public Fornecedor (String nome, String idade, String endereco, String contato, String email, String cnpj, float valorProduto, float imposto) {
        super(nome, idade, endereco, contato, email);
        this.cnpj = cnpj;
        this.valorProduto = valorProduto;
        this.imposto = imposto;}

    public String getCnpj() {
        return cnpj;}

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;}

    public float getValorProduto() {
        return valorProduto;}

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;}

    public float getImposto() {
        return imposto;}

    public void setImposto(float imposto) {
        this.imposto = imposto;}

    public float calcularValorTotal(float valorProduto, float imposto) {
         return valorProduto + imposto;}

    public void imprimirFornecedor(){
        System.out.println("\n --------------------------------- \n");
        System.out.println(" - CNPJ do fornecedor: " + this.getCnpj());
        System.out.println(" - Nome do fornecedor: " + this.getNome());
        System.out.println(" - Idade do fornecedor: " + this.getIdade());
        System.out.println(" - Endereço do fornecedor: " + this.getEndereco());
        System.out.println("\n --------------------------------- \n");
        System.out.printf(" - Valor do produto: %.2f", this.getValorProduto());
        System.out.printf(" - Valor do imposto: %.2f", this.getImposto());
        System.out.printf("\n - Valor do total do produto: %.2f", this.calcularValorTotal(this.getValorProduto(), this.getImposto()));}
}
