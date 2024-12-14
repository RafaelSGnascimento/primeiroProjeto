package estrturasDeRepetição;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class tryCatch {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.nextLine();
            
            System.out.println("Digite seu idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite seu altura");
            double altura = scanner.nextDouble();
            
            System.out.println("Ola, me chamo " + nome + " " + sobrenome +" tenho " + idade + " minha altura é " + altura);
            scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }

    }
}
