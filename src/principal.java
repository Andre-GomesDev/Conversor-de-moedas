import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        consultarMoedas consulta = new consultarMoedas();

        int opcao = 0;
        while(opcao != 8){
            System.out.println("""
                    **************************************
                    BEM-VINDO AO CONVERSOR DE MOEDAS
                    Digite a opção que você deseja:\s
                    1. Dolar para Peso Argentino.\s
                    2. Peso Argentino para Dolar.\s
                    3. Dolar para Real Brasileiro.\s
                    4. Real Brasileiro para Dolar.\s
                    5. Dolar para Peso Colombiano.\s
                    6. Peso Colombiano para Dolar.\s
                    7. Converter em outra moeda.\s
                    8. Sair.\s
                    """);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao){
                case 1:
                    ConversorDeMoeda.conversor("USD", "ARG", consulta, leitura);
                    break;
                case 2:
                    ConversorDeMoeda.conversor("ARG", "USD", consulta, leitura);
                    break;
                case 3:
                    ConversorDeMoeda.conversor("USD", "BRL", consulta, leitura);
                    break;
                case 4:
                    ConversorDeMoeda.conversor("BRL", "USD", consulta, leitura);
                    break;
                case 5:
                    ConversorDeMoeda.conversor("USD", "COL", consulta, leitura);
                    break;
                case 6:
                    ConversorDeMoeda.conversor("COL", "USD", consulta, leitura);
                    break;
                case 7:
                    ConversorDeMoeda.converterOutraMoeda(consulta, leitura);
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }
    }

}