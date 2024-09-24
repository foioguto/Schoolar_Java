import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro("Toyota", "Corolla", 2021, 4);
        Moto moto = new Moto("Honda", "CB500", 2020, 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2019, 20);

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Veículos");
            System.out.println("1. Alugar veículo");
            System.out.println("2. Devolver veículo");
            System.out.println("3. Calcular valor do aluguel");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                break;
            }

            System.out.println("\nEscolha o tipo de veículo:");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Caminhão");
            System.out.print("Escolha uma opção: ");
            int tipoVeiculo = scanner.nextInt();

            Veiculo veiculoEscolhido = null;
            switch (tipoVeiculo) {
                case 1:
                    veiculoEscolhido = carro;
                    break;
                case 2:
                    veiculoEscolhido = moto;
                    break;
                case 3:
                    veiculoEscolhido = caminhao;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            switch (opcao) {
                case 1:
                    veiculoEscolhido.alugar();
                    break;
                case 2:
                    veiculoEscolhido.devolver();
                    break;
                case 3:
                    System.out.println("Valor do aluguel: R$ " + veiculoEscolhido.calcularValorAluguel());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
