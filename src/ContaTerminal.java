import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor digite o número da Agência!");
        agencia = scanner.next();

        System.out.println("Por favor digite o nome do Cliente!");
        nomeCliente = scanner.next();

        System.out.println("Por favor digite o Saldo da conta!");
        saldo = scanner.nextDouble();

        System.out.printf(Locale.GERMAN, "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nomeCliente, agencia, numero, saldo );
    }
}