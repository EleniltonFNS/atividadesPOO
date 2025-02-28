package IndiceMassaCorporal;

public class Usuario {
    private String cpf;
    private String nome;
    private float peso;
    private float altura;

    public void setCpf(String cpf) {
        this.cpf = cpf;}

    public void setNome(String nome) {
        this.nome = nome;}

    public void setPeso(float peso) {
        this.peso = peso;}

    public void setAltura(float altura) {
        this.altura = altura;}

    public String getCpf() {
        return cpf;}

    public String getNome() {
        return nome;}

    public float getPeso() {
        return peso;}

    public float getAltura() {
        return altura;}
}
