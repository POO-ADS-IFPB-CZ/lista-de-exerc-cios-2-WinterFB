import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o nome do titular da conta: ");
        String titular = sc.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular, 0);

        int opcao = 0;

        do {
            System.out.println("\n\n----- MENU -----");
            System.out.println("Digite e envie o número com a opção que preferir: \n");
            System.out.println("1 - Sacar um valor");
            System.out.println("2 - Depositar um valor");
            System.out.println("3 - Consultar o saldo");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            if (opcao < 1 || opcao > 4){
                System.out.println("\nDigite um valor válido. \n\n");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para sacar: ");
                    float saque = sc.nextFloat();
                    conta.sacar(saque);
                    break;
                case 2:
                    System.out.println("Digite o valor para depositar: ");
                    float deposito = sc.nextFloat();
                    conta.depositar(deposito);
                    break;

                case 3:
                    float saldoAtual = conta.consultarSaldo();
                    System.out.println("Saldo atual: \n" + saldoAtual);
                    break;

                case 4:
                    System.out.println("Saindo.\n\n");
                    break;
            }

        } while (opcao != 4);
    }
}
