package application;

import converte.coins.entities.Converter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            String menu = "--- Menu --- \n" +
                    "1 - Converter dólar para reais\n" +
                    "2 - Converter reais para dólar\n" +
                    "3 - Converter dólar para euro\n" +
                    "4 - Converter euro para dólar\n" +
                    "5 - Converter euro para reais\n" +
                    "6 - Converter reais para euro\n" +
                    "0 - Sair\n" +
                    "Escolha sua opção: ";
            System.out.println(menu);
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade de dólares para converter: ");
                    double qtdDolaresDR = in.nextDouble();
                    Converter converterDR = new Converter("USD", "BRL");
                    double valueDR = converterDR.ConverterValue(qtdDolaresDR);
                    System.out.println("Valor em reais: R$ " + valueDR);
                    break;
                case 2:
                    System.out.print("Quantidade de reais para converter: ");
                    double qtdReaisRD = in.nextDouble();
                    Converter converterRD = new Converter("BRL", "USD");
                    double valueRD = converterRD.ConverterValue(qtdReaisRD);
                    System.out.println("Valor em dólares: $ " + valueRD);
                    break;
                case 3:
                    System.out.print("Quantidade de dólares para converter: ");
                    double qtdDolaresDE = in.nextDouble();
                    Converter converterDE = new Converter("USD", "EUR");
                    double valueDE = converterDE.ConverterValue(qtdDolaresDE);
                    System.out.println("Valor em euros: € " + valueDE);
                    break;
                case 4:
                    System.out.print("Quantidade de euros para converter: ");
                    double qtdDolaresED = in.nextDouble();
                    Converter converterED = new Converter("EUR", "USD");
                    double valueED = converterED.ConverterValue(qtdDolaresED);
                    System.out.println("Valor em dólares: $ " + valueED);
                    break;
                case 5:
                    System.out.print("Quantidade de euros para converter: ");
                    double qtdDolaresER = in.nextDouble();
                    Converter converterER = new Converter("EUR", "BRL");
                    double valueER = converterER.ConverterValue(qtdDolaresER);
                    System.out.println("Valor em reais: R$ " + valueER);
                    break;
                case 6:
                    System.out.print("Quantidade de reais para converter: ");
                    double qtdDolaresRE = in.nextDouble();
                    Converter converterRE = new Converter("BRL","EUR");
                    double valueRE = converterRE.ConverterValue(qtdDolaresRE);
                    System.out.println("Valor em euros: € " + valueRE);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        in.close();
    }
}
