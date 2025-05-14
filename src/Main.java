import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        double valor = 0;
        int escolha = 0;
        String moedaBase;
        String moedaAlvo;

        String menu = """
                Seja Bem Vindo ao conversor de Moedas!!
                
                Escolha a opção desejada:
                
                1 - Dolar Americano >>> Real Brasileiro
                2 - Real Brasileiro >>> Dolar Americano
                3 - Dolar Americano >>> Peso Argentino
                4 - Peso Argentino >>> Dolar Americano
                5 - Real Brasileiro >>> Guarani Paraguai
                6 - Guarani Paraguai >>> Real Brasileiro
                7 - Outras cotações
                8 - Ver lista de Códigos de Moedas
                9 - Sair
                """;

        while (escolha != 9) {
            System.out.println(menu);
            escolha = leitura.nextInt();

            ConsultarMoeda consulta = new ConsultarMoeda();
            Moeda novaMoeda;

            switch (escolha){
                case 1: // 1 - Dolar Americano >>> Real Brasileiro
                    moedaBase = "USD";
                    moedaAlvo = "BRL";
                    System.out.println("Digite o valor que deseja consultar");
                    valor = leitura.nextDouble();
                    novaMoeda = consulta.consultaMoeda(moedaBase, moedaAlvo, valor);
                    System.out.println(novaMoeda);
                    break;

                case 2: // 2 - Real Brasileiro >>> Dolar Americano
                    moedaBase = "BRL";
                    moedaAlvo = "USD";
                    System.out.println("Digite o valor que deseja consultar");
                    valor = leitura.nextDouble();
                    novaMoeda = consulta.consultaMoeda(moedaBase, moedaAlvo, valor);
                    System.out.println(novaMoeda);
                    break;

                case 3: // 3 - Dolar Americano >>> Peso Argentino
                    moedaBase = "USD";
                    moedaAlvo = "ARS";
                    System.out.println("Digite o valor que deseja consultar");
                    valor = leitura.nextDouble();
                    novaMoeda = consulta.consultaMoeda(moedaBase, moedaAlvo, valor);
                    System.out.println(novaMoeda);
                    break;

                case 4: // 4 - Peso Argentino >>> Dolar Americano
                    moedaBase = "ARS";
                    moedaAlvo = "USD";
                    System.out.println("Digite o valor que deseja consultar");
                    valor = leitura.nextDouble();
                    novaMoeda = consulta.consultaMoeda(moedaBase, moedaAlvo, valor);
                    System.out.println(novaMoeda);
                    break;
                case 5: // 5 - Real Brasileiro >>> Guarani Paraguai
                    moedaBase = "BRL";
                    moedaAlvo = "PYG";
                    System.out.println("Digite o valor que deseja consultar");
                    valor = leitura.nextDouble();
                    novaMoeda = consulta.consultaMoeda(moedaBase, moedaAlvo, valor);
                    System.out.println(novaMoeda);
                    break;
                case 6: // 6 - Guarani Paraguai >>> Real Brasileiro
                    moedaBase = "PYG";
                    moedaAlvo = "BRL";
                    System.out.println("Digite o valor que deseja consultar");
                    valor = leitura.nextDouble();
                    novaMoeda = consulta.consultaMoeda(moedaBase, moedaAlvo, valor);
                    System.out.println(novaMoeda);
                    break;
                case 7: // 7 - Outras cotações
                    System.out.println("Digite a moeda Base");
                    moedaBase = leitura.next();
                    System.out.println("Digite a moeda Alvo");
                    moedaAlvo = leitura.next();
                    System.out.println("Digite o valor que deseja consultar");
                    valor = leitura.nextDouble();
                    novaMoeda = consulta.consultaMoeda(moedaBase, moedaAlvo, valor);
                    System.out.println(novaMoeda);
                    break;
                case 8: // 8 - Ver lista de Códigos de Moedas
                    System.out.println(consulta.consultaCodigos());
                    break;
            }



        }


    }
}