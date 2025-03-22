package Fauna;

public class Cavalo extends Animal{
    private String raca;

    public Cavalo(){}

    public Cavalo(float tamanho, String cor, String raca) {
        super(tamanho, cor);
        this.raca = raca;
    }

    public void fugir(String localFuga){
        System.out.println(" - Cavalo fugiu para " + localFuga);
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }

    public void imprimirCavalo(String alimento, String localFuga){
        System.out.println("\n -=- Cavalo -=-=-=- " );
        System.out.println(" - Tamanho: " + this.getTamanho());
        System.out.println(" - Cor: " + this.getCor());
        System.out.println(" - Raça: " + this.getRaca());
        this.comer(alimento);
        this.fugir(localFuga);
    }
}
