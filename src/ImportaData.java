import java.util.Date;

public class ImportaData {

    public static void imprimirData(Date data) {
        System.out.println("A data de hoje em milissegundos é: " + data.getTime());
    }
    public static void main(String[] args) {
        Date objDate = new Date();
        imprimirData(objDate);
    }
}