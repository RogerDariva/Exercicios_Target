import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        
        String aux; // Declarando varíavel para receber string de usuário

        aux = JOptionPane.showInputDialog(null, "Entre com a palavra desejada:"); //Abrindo caixa para usuário inserir palavra
        System.out.println("A palavra informada foi : " + aux); 
        
        char[] inverso = aux.toCharArray(); // Convertendo a string em um vetor.

        System.out.println("O inverso da palavra informada é: " + inverso);

        for(int i = inverso.length -1; i>=0; i--){ //invertendo o vetor, imprimindo as letras de trás para frente
            System.out.print(inverso[i]);
        }

    }
    
}
