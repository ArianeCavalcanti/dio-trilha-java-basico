import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        // Configura o scanner para aceitar ponto como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Solicita o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        
        // Solicita a agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        // Solicita o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        scanner.nextLine(); // Limpa o buffer do scanner
        String nomeCliente = scanner.nextLine();
        
        // Solicita o saldo inicial
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        // Exibe a mensagem final formatada com os dados informados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. "
                + "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
