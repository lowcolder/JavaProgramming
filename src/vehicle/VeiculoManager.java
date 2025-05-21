package vehicle;
/*
===============================================================================
alunos: Davi Henrique Garcia Araujo                              data(04/04/2025)
        Layla Pimenta de Melo
        Robson Ribeiro Filho
        Rafael Albino Ferreira

Professor: Alessandro
Desc: A classe VeiculoManager gerencia os veiculos cadastrados, permitindo adicionar, listar,
      atualizar e remover veiculos. Ela utiliza um ArrayList para armazenar os veiculos e fornece
      metodos para manipular esses veiculos. A classe possui metodos para adicionar um veiculo,
      listar todos os veiculos, atualizar o preco de um veiculo especifico e remover um veiculo
      de um indice especifico.
===============================================================================
*/
import java.util.ArrayList;

public class VeiculoManager {
    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
        System.out.println("Veículo adicionado com sucesso.");
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println("Índice: " + i);
            System.out.println(veiculos.get(i));
            System.out.println("-----------------------------");
        }
    }

    public void atualizarCaracteristicas(int index, float novoPreco) {
        if (index >= 0 && index < veiculos.size()) {
            veiculos.get(index).setPreco(novoPreco);
            System.out.println("Preço atualizado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void atualizarCaracteristicas(int index, String novaCor) {
        if (index >= 0 && index < veiculos.size()) {
            veiculos.get(index).setCor(novaCor);
            System.out.println("Cor atualizada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removerVeiculo(int index) {
        if (index >= 0 && index < veiculos.size()) {
            veiculos.remove(index);
            System.out.println("Veículo removido.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

}
