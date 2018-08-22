import java.util.Scanner;
public class insertionsort {
     public static void main(String[] args) {
          Scanner cm = new Scanner(System.in);
        System.out.print("Numero de posições que seu vetor tera: ");
        int t = cm.nextInt();
        int vetor[] = new int[t];
        System.out.println("");
        System.out.println("Digite as posicoes do vetor");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = cm.nextInt();
        }
        System.out.println("");
        System.out.println("Vetor ordenado");
        System.out.println("");
        int aux, x;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];                         
            x = i - 1;                             
            while (x >= 0 && vetor[x] > aux) {
                vetor[x + 1] = vetor[x];
                x--;
            }
            vetor[x + 1] = aux;                      
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
