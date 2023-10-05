import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, informe o número da sua conta:");
        int conta = sc.nextInt();

        System.out.println("Por favor, informe o número da sua agência bancária:");
        String agencia = sc.next();

        System.out.println("Por favor, agora informe o seu nome:");
        String nome = sc.next();

        System.out.println("Por último, informe o seu saldo atual:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.\n" +
                "Sua agência é: " + agencia + "\nConta: " + conta + "\nO seu saldo de: " + saldo +
                " já está disponível para saque.");

    }
}
