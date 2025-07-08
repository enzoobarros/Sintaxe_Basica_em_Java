import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        // Solicita o número da agência ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente ao usuário
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo inicial ao usuário
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibe mensagem final com os dados informados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
            "sua agência é " + agencia + ", conta " + numero +
            " e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}
