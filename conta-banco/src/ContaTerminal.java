import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String agencia, nomeCliente = "Mario Andrade";
        int numeroConta;
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        //entrada de dados agencia
        do { 
            System.out.println("Por favor, digite o número da Agência! ");
            agencia = sc.nextLine();
        } while (!agencia.equals("067-8"));

        //entrada de dados usuario
        do { 
            System.out.println("Agora digite um número de conta válido! ");
            numeroConta = sc.nextInt();
            System.out.println("");
        } while (numeroConta != 1021);
        
        // Exibir mensagem 
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

        sc.close();
    }
}
