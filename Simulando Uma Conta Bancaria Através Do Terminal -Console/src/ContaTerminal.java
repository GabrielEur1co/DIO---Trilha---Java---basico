import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu número de conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeUsuario = scanner.next();


        System.out.println("Digite seu sobrenome: ");
        String sobrenomeUsuario = scanner.next();


        System.out.println("Informe seu saldo: ");
        Double saldo = scanner.nextDouble();

        String nomeCompleto = nomeUsuario.concat(" ").concat(sobrenomeUsuario);


        System.out.println("Olá " + nomeCompleto + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo é " + saldo + " já esta disponivel para saque." );



    }
}
