package Fauna;

public class Leao extends Animal{
    private boolean juba;

    public Leao(){}

    public Leao(float tamanho, String cor, Boolean juba) {
        super(tamanho, cor);
        this.juba = juba;
    }

    public void cacar(String nomeAnimal){
        System.out.println(" - Leão caçou " + nomeAnimal);
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }
    public String getJuba() {
        if(juba){
            return "Tem";
        } else {
            return "Não tem";
        }
    }

    public void imprimirLeao(String alimento, String nomeAnimal){
        System.out.println("\n -=- Leão -=-=-=- " );
        System.out.println(" - Tamanho: " + this.getTamanho());
        System.out.println(" - Cor: " + this.getCor());
        System.out.println(" - Juba: " + this.getJuba());
        this.cacar(nomeAnimal);
        this.comer(alimento);
    }
}
