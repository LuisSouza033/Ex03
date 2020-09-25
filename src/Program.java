import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para a conta: ");
        int number = sc.nextInt();
        System.out.println("Digite o nome do títular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Digite o limite de saque para esta conta: ");
        double limite = sc.nextDouble();

        Conta conta = new Conta(number,titular,saldo,limite);
        try{
            System.out.println("Digite quanto deseja sacar: ");
            double vsaque = sc.nextDouble();
            conta.saque(vsaque);
        }
        catch(ContaExceptions exc){
            System.out.println("Erro no saque!\n"+ exc.getMessage());
        }
    }
}
