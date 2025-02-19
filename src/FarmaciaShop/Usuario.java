package FarmaciaShop;
/**
 * Classe que representa um usuário do sistema farmaceutico.
 * @version 1.0
 * @since 2025-02-14
 */
public class Usuario {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private byte receita;

    // Métodos

    public float calcularImposto(float valor) {
        return (float) (valor > 100 ? valor * 0.15: valor * 0.10);
    }

    public void consultaMedicamento() {
        System.out.println("Consulta de medicamento");
    }

    public void comprarMedicamento() {
        System.out.println("Compra de medicamento");
    }

    public void efetuarPagamento() {
        System.out.println("Pagamento efetuado");
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setReceita(byte receita) {
        this.receita = receita;
    }

    public byte getReceita() {
        return receita;
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        System.out.println("Imposto: R$" + usuario.calcularImposto(200));
    }
}
