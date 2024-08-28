import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String cliente;
        Double saldo;

        System.out.print("Digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        cliente = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        saldo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.\n");

        sc.close();
    }
}
