import java.util.Locale;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        String produto1 = "computador";
        String produto2 = "diaEscritorio";

        int idade = 25;
        int code = 1234;
        char genero = 'M';

        double preco1 = 2000;
        double preco2 = 600.50;
        double medir = 53.234567;

        System.out.println("Os produtos escolhidos são: ");
        System.out.printf("O valor do %s é %.2f reais%n ", produto1, preco1);
        System.out.printf("O valor do %s é %.1f reais%n", produto2, preco2);
        System.out.printf("No Registro tem: %d anos , %d e Gênero: %s", idade, code, genero);
        System.out.printf(" A medição em decimais é  %f metros%n", medir);
        System.out.printf("medição com 3 decimais é: %.3f metros%n", medir);
        Locale.setDefault(Locale.US);
        System.out.printf("medição com 3 decimais é: %.3f metros%n", medir);

    }
}
