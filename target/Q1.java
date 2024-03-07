public class Q1 {

    public static void main(String[] args) {
        int k = 0, soma = 0, indice = 13; // Declarando variáveis

        for (k=0; k<indice; k++){ // loop para soma receber o valor anterior + o contador
            soma = soma + k;
            System.err.println(soma);
        }
    }
}