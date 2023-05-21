import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        sc.close();
    }
}
