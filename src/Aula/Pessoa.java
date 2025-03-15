package Aula;

public class Pessoa {
    private String nome, idade, endereco, contato, email;

    public Pessoa() {}

    public Pessoa(String nome, String idade, String endereco, String contato, String email) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.contato = contato;
        this.email = email;}

    public String getNome() {
        return nome;}

    public void setNome(String nome) {
        this.nome = nome;}

    public void setIdade(String idade) {
        this.idade = idade;}

    public String getIdade() {
        return idade;}

    public void setEndereco(String endereco) {
        this.endereco = endereco;}

    public String getEndereco() {
        return endereco;}

    public void setContato(String contato) {
        this.contato = contato;}

    public String getContato() {
        return contato;}

    public void setEmail(String email) {
        this.email = email;}

    public String getEmail() {
        return email;}
}
