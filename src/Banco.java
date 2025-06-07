import java.util.Random;
import java.util.Scanner;

public class Banco{
    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);

        double valorEnviar = 0;
        double valorReceber = 0;

        System.out.println("\nCrie sua conta bancária:");
        System.out.println("\nDigite seu nome:");
        String nome = digitar.nextLine();
        System.out.println("Tipo de conta:");
        String conta = digitar.nextLine();
        System.out.println("Valor sendo analisado pelo score do seu nome...");
        int numeroAleatorio2 =new Random().nextInt(100, 2000);
        double saldoDaconta = numeroAleatorio2;


        String mensagem = String.format("""
                *************************************************
                
                Dados iniciais do cliente:
                
                Nome: %S
                Tipo da conta: %S
                Saldo da conta: R$ %.2f
                
                *************************************************
                """,nome, conta,  saldoDaconta);

        System.out.println(mensagem);
        String mensagem2 = """
                
                Operações
                
                1- Consultar Saldos
                2- Receber Valor
                3- Tranferir valor
                4- Sair
                
                Escolha uma opção""";



        for (int i = 1; i > 0; i++){
            System.out.println(mensagem2);
            int opcao = digitar.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: R$" + saldoDaconta);

            }else if (opcao == 2) {
                System.out.println("Qual o Valor deseja receber: ");
                valorReceber = digitar.nextDouble();
                saldoDaconta = valorReceber + saldoDaconta;
                System.out.println("Valor atualizado: "+ saldoDaconta);

            }else if (opcao == 3){
                System.out.println("Qual o Valor deseja enviar: ");
                valorEnviar = digitar.nextDouble();
                if(valorEnviar < saldoDaconta) {
                    saldoDaconta = saldoDaconta - valorEnviar;
                    System.out.println("Valor atualizado: " + saldoDaconta + " vc transferiu " + valorEnviar);

                }else {
                    System.out.println("Saldo insuficiente cabaço");

                }
            }else if(opcao == 4){
                System.out.println("Obridado por utilizar a nosso aplicativo "+ nome +", tenha um ótimo dia!!");
                break;

            }else{
                System.out.println("Opção inválida");
            }
        }
    }
}