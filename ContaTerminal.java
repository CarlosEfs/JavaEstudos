import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in);
        //Eibindo as mensagens para o usuário e  obtendo os valores digitadas no Terminal

        System.out.println("Digite o número da sua conta: ");
        int numero = sc.nextInt();
        
        System.out.println("Digite o número da sua Agencia");
        String agencia = sc.next();
        
        System.out.println("Digite o saldo: ");
        Double saldo = sc.nextDouble();
       
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine( );
            // Exibindo a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + " Conta " + 
        numero  + " e seu saldo " + saldo + " já está disponível para saque." );



    }
}