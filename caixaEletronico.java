import java.util.Scanner;
public class caixaEletronico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Saldo atual");
        int saldo = tcl.nextInt();
            System.out.println("Caixa Eletrônico");
            System.out.println(" 1 - Ver Saldo");
            System.out.println(" 2 -  Saquar");
            System.out.println(" 3 -  Depositar");
            System.out.println(" 4 -  Sair");  
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual ação você deseja executar? ");
        int acao = tec.nextInt();
        if(acao == 0){
            System.out.println("Qual opção você deseja?");
            System.out.println(" 1 - Ver Saldo");
            System.out.println(" 2 -  Saquar");
            System.out.println(" 3 -  Depositar");
            System.out.println(" 4 -  Sair");
            }else{
                switch (acao) {
                    case 1: {
                        System.out.println("**Caixa Eletronico**");
                        System.out.println(" 1 -  Ver Saldo");
                        System.out.println(" 2 -  Saquar");
                        System.out.println(" 3 - Depositar");
                        System.out.println(" 4 - Sair");
                        break;
                    }
                    case 2: {
                        Scanner saq = new Scanner(System.in);
                        System.out.println("Digite o valor que deseja saquar!");
                        int valor = saq.nextInt();
                        saldo = saldo - valor;
                        System.out.println(saldo);
                        break;
                    }
                    case 3: {
                        Scanner dep = new Scanner(System.in);
                        System.out.println("Digite o quanto quer depositar!");
                        int deposito = dep.nextInt();
                        break;
                    }
                    case 4: {
                        System.exit(1);
                        break;
                    }
                }
            }
        }
    }

    
}
    
    
    

