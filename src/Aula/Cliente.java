package Aula;

public class Cliente extends Pessoa{

    private String cpf;
    private float salario, impostoRenda;

    public Cliente() {}

    public Cliente(String nome, String idade, String endereco, String contato, String email, String cpf, float salario, float impostoRenda) {
        super(nome, idade, endereco, contato, email);
        this.cpf = cpf;
        this.salario = salario;
        this.impostoRenda = impostoRenda;}

    public String getCpf() {
        return cpf;}

    public void setCpf(String cpf) {
        this.cpf = cpf;}

    public float getSalarioBruto() {
        return salario;}

    public void setSalarioBruto(float salario) {
        this.salario = salario;}

    public float getImpostoRenda() {
        return impostoRenda;}

    public void setImpostoRenda(float impostoRenda) {
        this.impostoRenda = impostoRenda;}

    public float calcularSalarioLiquido(float salarioBruto,float impostoRenda) {
        return salarioBruto - impostoRenda;}

    public void imprimirCliente(){
        System.out.println("\n --------------------------------- \n");
        System.out.println(" - CPF do cliente: " + this.getCpf());
        System.out.println(" - Nome do cliente: " + this.getNome());
        System.out.println(" - Idade do cliente: " + this.getIdade());
        System.out.println(" - Endereço do cliente: " + this.getEndereco());
        System.out.println("\n --------------------------------- \n");
        System.out.printf(" - Sálario Bruto: %.2f", this.getSalarioBruto());
        System.out.printf(" - Imposto de Renda: %.2f", this.getImpostoRenda());
        System.out.printf("\n - Sálario Liquido: %.2f", this.calcularSalarioLiquido(this.getSalarioBruto(),this.getImpostoRenda()));
        }
}
