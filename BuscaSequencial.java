import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[]args){
        Scanner tcl = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int vetor[] = new int[9];
        boolean ganhou = false;
        for (int i = 0; i < 9; i++){
            vetor[i] = aleatorio.nextInt(45);
        }
        for (int i = 0; i < 9; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("Digite seu número da sorte");
        int valor = tc.nextInt();
        for (int i = 0; i < 9; i++){
            if (valor == vetor[i]){
                System.out.println("Número sorteado");
                ganhou = true;
                break;
            }
        }
        if (ganhou == false){
            System.out.println("Errou");
        }                           
    }    
}
