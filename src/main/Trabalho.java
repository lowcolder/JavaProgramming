package main;

/*
===============================================================================
alunos: Davi Henrique Garcia Araujo                              data(04/04/2025)
        Layla Pimenta de Melo
        Robson Ribeiro Filho
        Rafael Albino Ferreira

Professor: Alessandro
Desc:
===============================================================================
*/

//Importações de bibliotecas e classes
import vehicle.*;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        String nome, entrada;
        Calendar dataAtual = Calendar.getInstance();
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        int d = dataAtual.get(Calendar.DAY_OF_MONTH);
        int m = dataAtual.get(Calendar.MONTH) + 1;
        int a = dataAtual.get(Calendar.YEAR);
        String senha = nome + (d < 10 ? "0" : "") + d + (m < 10 ? "0" : "") + m + a;

        do {
            entrada = JOptionPane.showInputDialog("Digite a sua senha:");
            if (!senha.equals(entrada)) {
                int erroContinuar = Integer.parseInt(JOptionPane.showInputDialog(
                    "Senha incorreta.\nDeseja tentar novamente?\n[1] Sim | [0] Não"));
                if (erroContinuar == 0) {
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    System.exit(0);
                }
            }
        } while (!senha.equals(entrada));

        JOptionPane.showMessageDialog(null, "Bem-vindo(a), " + nome + "!");

        // Início do menu de operações CRUD
        VeiculoManager manager = new VeiculoManager();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n====== MENU VEÍCULO ======");
            System.out.println("1 - Adicionar veículo de passeio");
            System.out.println("2 - Adicionar SUV");
            System.out.println("3 - Adicionar carreta de carga");
            System.out.println("4 - Listar veículos");
            System.out.println("5 - Atualizar preço de um veículo");
            System.out.println("6 - Remover veículo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    // Adicionar VeiculoPasseio
                    System.out.println("Cadastro de veículo de passeio:");
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Dia fabricação: ");
                    int dia = sc.nextInt();
                    System.out.print("Mês fabricação: ");
                    int mes = sc.nextInt();
                    System.out.print("Ano fabricação: ");
                    int ano = sc.nextInt();
                    sc.nextLine(); // consumir quebra de linha
                    System.out.print("Cor: ");
                    String cor = sc.nextLine();
                    System.out.print("Preço: ");
                    float preco = sc.nextFloat();
                    System.out.print("Quantidade de portas: ");
                    int qtdPortas = sc.nextInt();
                    System.out.print("Tem ar condicionado? (true/false): ");
                    boolean arCondicionado = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Tipo de câmbio: ");
                    String tipoCambio = sc.nextLine();
                    System.out.print("Tipo de direção: ");
                    String tipoDirecao = sc.nextLine();

                    VeiculoPasseio vp = new VeiculoPasseio(
                        qtdPortas, arCondicionado, tipoCambio, tipoDirecao,
                        marca, modelo, dia, mes, ano, cor, preco
                    );
                    manager.adicionarVeiculo(vp);
                    break;

                case 2:
                    // Adicionar VeiculoPasseioSUV
                    System.out.println("Cadastro de SUV:");
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo = sc.nextLine();
                    System.out.print("Dia fabricação: ");
                    dia = sc.nextInt();
                    System.out.print("Mês fabricação: ");
                    mes = sc.nextInt();
                    System.out.print("Ano fabricação: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cor: ");
                    cor = sc.nextLine();
                    System.out.print("Preço: ");
                    preco = sc.nextFloat();
                    System.out.print("Quantidade de portas: ");
                    qtdPortas = sc.nextInt();
                    System.out.print("Tem ar condicionado? (true/false): ");
                    arCondicionado = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Tipo de câmbio: ");
                    tipoCambio = sc.nextLine();
                    System.out.print("Tipo de direção: ");
                    tipoDirecao = sc.nextLine();
                    System.out.print("Freio ABS? (true/false): ");
                    boolean freioABS = sc.nextBoolean();
                    System.out.print("Tração 4x4? (true/false): ");
                    boolean tracao4x4 = sc.nextBoolean();
                    System.out.print("Altura do solo (em cm): ");
                    int alturaSolo = sc.nextInt();
                    System.out.print("Quantidade de airbags: ");
                    int qtdAirbags = sc.nextInt();
                    System.out.print("Capacidade de passageiros: ");
                    int capacidade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo de combustível: ");
                    String tipoCombustivel = sc.nextLine();

                    VeiculoPasseioSUV suv = new VeiculoPasseioSUV(
                        freioABS, tracao4x4, alturaSolo, qtdAirbags, capacidade, tipoCombustivel,
                        qtdPortas, arCondicionado, tipoCambio, tipoDirecao,
                        marca, modelo, dia, mes, ano, cor, preco
                    );
                    manager.adicionarVeiculo(suv);
                    break;

                case 3:
                    // Adicionar VeiculoCargaCarreta
                    System.out.println("Cadastro de carreta de carga:");
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    modelo = sc.nextLine();
                    System.out.print("Dia fabricação: ");
                    dia = sc.nextInt();
                    System.out.print("Mês fabricação: ");
                    mes = sc.nextInt();
                    System.out.print("Ano fabricação: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cor: ");
                    cor = sc.nextLine();
                    System.out.print("Preço: ");
                    preco = sc.nextFloat();
                    System.out.print("Número de eixos: ");
                    int numEixos = sc.nextInt();
                    System.out.print("Capacidade de carga (em toneladas): ");
                    double carga = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Tipo de carroceria: ");
                    String tipoCarroceria = sc.nextLine();
                    System.out.print("É articulada? (true/false): ");
                    boolean articulada = sc.nextBoolean();
                    System.out.print("Tem rastreamento GPS? (true/false): ");
                    boolean gps = sc.nextBoolean();
                    System.out.print("É refrigerada? (true/false): ");
                    boolean refrigerada = sc.nextBoolean();
                    System.out.print("Comprimento total (em metros): ");
                    double comprimento = sc.nextDouble();
                    System.out.print("Quantidade de compartimentos: ");
                    int compartimentos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo de carga: ");
                    String tipoCarga = sc.nextLine();

                    VeiculoCargaCarreta carreta = new VeiculoCargaCarreta(
                        articulada, gps, refrigerada, comprimento, compartimentos, tipoCarga,
                        numEixos, carga, tipoCarroceria,
                        marca, modelo, dia, mes, ano, cor, preco
                    );
                    manager.adicionarVeiculo(carreta);
                    break;

                case 4:
                    manager.listarVeiculos();
                    break;

                case 5:
                    System.out.print("Índice do veículo a atualizar: ");
                    int indexAtualizar = sc.nextInt();
                    System.out.print("Novo preço: ");
                    float novoPreco = sc.nextFloat();
                    manager.atualizarPreco(indexAtualizar, novoPreco);
                    break;

                case 6:
                    System.out.print("Índice do veículo a remover: ");
                    int indexRemover = sc.nextInt();
                    manager.removerVeiculo(indexRemover);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
