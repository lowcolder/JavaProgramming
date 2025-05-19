package vehicle;

import java.util.ArrayList;


public class VeiculoManager {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

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

    public void atualizarPreco(int index, float novoPreco) {
        if (index >= 0 && index < veiculos.size()) {
            veiculos.get(index).setPreco(novoPreco);
            System.out.println("Preço atualizado.");
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

    // Método de teste
    public static void main(String[] args) {
        VeiculoManager manager = new VeiculoManager();

        VeiculoPasseio vp = new VeiculoPasseio(
            4, true, "Automático", "Hidráulica",
            "Toyota", "Corolla", 10, 4, 2020, "Preto", 90000f
        );

        manager.adicionarVeiculo(vp);
        manager.listarVeiculos();
        manager.atualizarPreco(0, 85000f);
        manager.listarVeiculos();
        manager.removerVeiculo(0);
        manager.listarVeiculos();
    }
}
