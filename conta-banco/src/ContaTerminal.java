import java.util.Scanner;

public class ContaTerminal {
    String nomeCliente;
    String agencia;
    int numero;   
    double saldo;

    public static void main(String[] args) throws Exception {
        //TO DO: usar scanner
        //Exibir as menssagens para o usuario
        //Obter pela classe escaner os valores digitados no terminal
        //Exibir a menssagem conta criada

        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in, "UTF-8");

        
        System.out.println("\nPor favor, digite seu Nome !\n");
        contaTerminal.nomeCliente = scanner.next();

        System.out.println("\nPor favor, digite o número da Agência !\n");
        contaTerminal.agencia = scanner.next();

        System.out.println("\nPor favor, digite o número da Conta !\n");
        contaTerminal.numero = scanner.nextInt();

        System.out.println("\nPor favor, informe seu saldo !\n");
        contaTerminal.saldo = scanner.nextDouble();

        System.out.println("\nOlá " + contaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia + ", conta " + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo + " já está disponível para saque.");


        
        scanner.close();
    }
}
