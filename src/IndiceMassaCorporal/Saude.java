package IndiceMassaCorporal;

public class Saude {

    public float calcularIMC(Usuario usuario) {
        return usuario.getPeso()/(usuario.getAltura()*usuario.getAltura());}

    public String classificarIMC(float imc) {
        if (imc <= 18.49){
            return "Abaixo do peso";
        }else if(imc >= 18.50 && imc <= 24.99){
            return "Peso Normal";
        } else if (imc >= 25 && imc <= 29.99){
            return "Pré-Obesidade";
        } else if (imc >= 30 && imc <= 34.99){
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.99){
            return "Obesidade Grau II";
        } else if (imc >= 40){
            return "Obesidade Grau III";
        } else{
            return "Valor inválido";
        }
    }
}
