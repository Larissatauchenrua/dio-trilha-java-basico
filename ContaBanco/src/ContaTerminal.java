import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       Scanner scanner=new
    Scanner(System.in);
  
       System.out.print("Por favor, digite o número da conta:");
       int numero = scanner.nextInt();
       scanner.nextLine();//limpa o buffer

       System.out.print("Por favor, digite o número da agência:");
       String agencia = scanner.nextLine();

       System.out.print("Por favor, digite o nome do cliente:");
       String nomeCliente = scanner.nextLine();

       System.out.print("Por favor, digite o saldo da conta:");
       double saldo = scanner.nextDouble();

       System.out.println("\nOlá "+ nomeCliente +",obrigado por criar uma conta em nosso banco.");
       System.out.println("Sua agência é " + agencia + " ,conta " + numero + " e seu saldo R$ " + saldo + " ja esttá disponível para saque. ");

       scanner.close();
    }
} 
