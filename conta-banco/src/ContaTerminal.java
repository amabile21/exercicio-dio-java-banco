import java.util.Scanner;

public class ContaTerminal {
    int agencia;
    String nomeCliente;
    String numeroConta;
    double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        conta.agencia = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha restante

        System.out.print("Digite o nome do cliente: ");
        conta.nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        conta.numeroConta = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        conta.saldo = scanner.nextDouble();

        System.out.println("Obrigado por criar uma conta em nosso banco! Bem vindo.");
    }
}