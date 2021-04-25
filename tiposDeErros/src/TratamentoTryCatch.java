import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoTryCatch {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o primeiro valor: ");
            double a = scanner.nextDouble();

            System.out.println("Informe o segundo valor: ");
            double b = scanner.nextDouble();

            double resultado = a / b;
            System.out.println("a / b = " + resultado);

        } catch (InputMismatchException e) {

            System.out.println("Informe apenas números!");

        } catch (Exception e) {

            System.out.println("Erro inesperado!");

        } finally {

            System.out.println("Programa encerrado!");

        }


    }
}
