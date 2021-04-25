import java.util.Scanner;

public class ErroSemTratamento {
    public static void main(String[] args) {

        //Como o erro ocorre em tempo de execução é um erro do tipo NÃO checado.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double b = scanner.nextDouble();

        double resultado = a / b;
        System.out.println("a / b = " + resultado);


    }
}
