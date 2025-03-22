package Fauna;

public class Animal {
    private float tamanho;
    private String cor;

    public Animal(float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Animal() {}

    public void comer(String alimento){
        System.out.println(" - O animal comeu " + alimento);
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public float getTamanho() {
        return tamanho;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
}
