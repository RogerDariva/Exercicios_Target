import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1=0 , n2 = 1, n3=0; //Declarando variáveis de apoio    
        int x = 10; // Definindo quantidade de termos de fibonacci.

        for(int i =0; i < x; i++){ //criando a sequência de fibonacci.

            System.out.println(n1);

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;            

        }



    }
}