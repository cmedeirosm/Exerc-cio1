import java.util.Scanner;
public class BuscaBinaria {
     public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[8];
        System.out.println("Insira os numeros do vetor");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        int aux;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (vetor[i] < vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
            System.out.println(" ");
            System.out.println("Vetor ordenado");
            for (int k = 0; k < 8; k++) {
            System.out.print(vetor[k]+"\t");
            }
            int fim = vetor[7];
            int metade = vetor[4];
            int começo= vetor[0];
            System.out.println(fim);
            System.out.println("Digite o valor que deseja ser encontrado");
                int encontrar = tcl.nextInt();
                if (encontrar > metade) {
                    System.out.println("O valor está depois do meio do vetor"); 
                }else{
                    System.out.println("O valor está antes do meio do vetor");    
                }

    } 
}
