import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTratamentoExcecoes {
    public static void main(String[] args) {
        
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase().concat(" ").concat(sobrenome.toUpperCase()));

            System.out.println("TENHO : " + idade + " Anos ");
            System.out.println("MINHA ALURA E " + altura + "ALTURA ");

        } catch (InputMismatchException e) {
            System.out.println("Os Campos Idade e altura tem que ser numericos");
        }
    }
}
