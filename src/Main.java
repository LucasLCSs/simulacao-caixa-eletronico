import java.util.Scanner;

public class Main {

    public static double saldo = 1000.0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1 - Mostrar saldo | 2 - Depositar | 3 - Sacar | 4 - Sair");
            String pergunta = scanner.nextLine();

            switch (pergunta) {

                case "1" -> System.out.println("Saldo atual: R$ " + saldo);

                case "2" -> {
                    System.out.print("Valor a ser depositado: R$ ");
                    double deposito = scanner.nextDouble();

                    saldo += deposito;
                    System.out.println("Deposito efetuado com sucesso.");

                    System.out.println("Novo saldo: R$ " + saldo);
                }

                case "3" -> {

                    System.out.print("Valor a ser sacado: R$ ");
                    double sacar = scanner.nextDouble();

                    if (saldo < sacar) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= sacar;
                        System.out.println("Saque efetuado com sucesso.");

                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                }

                case "4" -> {
                    System.out.println("Tenha um ótimo dia, volte sempre!");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Número inválido!");
            }
            scanner.nextLine();
        }
    }
}
