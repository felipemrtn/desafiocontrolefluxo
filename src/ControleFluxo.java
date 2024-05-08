import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Informe o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar (parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) 
            throw new ParametrosInvalidosException();

            for (int num = parametroUm; num <= parametroDois; num++)
                System.out.println("Imprimindo o número " + num);
    }
}
