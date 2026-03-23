import java.util.*;

public class Aula_Luiz {

    public static void main(String[] args) throws IllegalAccessException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String destino;
        String mensagem;
        int tipo;

        System.out.println("Sistema de envio de mensagens");

        System.out.print("Entrada de dados, Digite a mensagem: ");
        mensagem = sc.nextLine();

        System.out.println("CPU solicitando a leitura dos dados (READ)...");


        System.out.print("Para quem você quer enviar a mensagem? ");
        destino = sc.nextLine();

        System.out.println("CPU está definindo posição na memória/barramento de endereço...");

        do {
            System.out.println();
            System.out.println("Escolha: \n(1) para enviar \n(2) para ler a mensagem \n(3) para sair do programa");
            tipo = sc.nextInt();

            if(tipo == 1){
                System.out.println("Enviando mensagem:");
                System.out.println("Sinal de controle: WRITE (escrita)");
                System.out.println("Dados estão sendo enviados para a memória pelo barramento de dados");
                System.out.println("Destino: " + destino);
                System.out.println("CPU irá mostrar os resultados na tela:");
                System.out.println("Mensagem enviada: " + mensagem);
            }
            else if(tipo == 2){
                System.out.println("Lendo mensagem...");
                System.out.println("Sinal de controle: READ (leitura)");
                System.out.println("Dados sendo recuperados da memória....");
                System.out.println("Origem: " + destino);
                System.out.println("CPU irá mostrar os resultados na tela:");
                System.out.println("Mensagem recebida: "+ mensagem);
            }
            else if (tipo != 3){
                System.out.println("Opção inválida");
            }

        }while(tipo != 3);




        sc.close();
    }
}