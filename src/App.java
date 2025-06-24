import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nomeCliente = scan.nextLine(); 
        System.out.println("Qual o número da conta?");
        Integer numeroConta = Integer.parseInt(scan.next());
        System.out.println("Qual o número da Agencia?");
        String agencia = scan.next(); 

        Conta conta = new Conta(numeroConta, agencia, nomeCliente); 
        System.out.println(conta.getConta());
        
        System.out.println(conta.getSaldo());
        
        conta.Depositar(5.50);
        System.out.println(conta.getSaldo());
    }
}
