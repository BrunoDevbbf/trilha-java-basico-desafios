import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Por favor digite o seu nome: ");
        String nome = s.nextLine();

        System.out.println("Por favor digite a sua agencia: ");
        String agencia = s.nextLine();

        System.out.println("Agora digite o numero da sua conta: ");
        int conta = s.nextInt();

        conta conta2 = new conta();

        System.out.println("Olá " + nome + " ,Obrigado por criar uma conta em nosso banco,sua agencia é: " + agencia + " ,conta: " + conta + " e seu saldo $" + conta2.saldo + " já está disponivel para saque.");
    }
    
}
