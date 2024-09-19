import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o número da agência: ");
        int numero = scanner.nextInt();

        
        System.out.print("Digite o nome da agência: ");
        String nomeAgencia = scanner.next();

        
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, nomeAgencia, numero, saldo);

    }
}
