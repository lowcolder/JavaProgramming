package vehicle;

import java.util.Calendar;

// Superclasse auxiliar de Veiculo
public class VeiculoUtilitarias {
    // Gerar resumo do veiculo
    public void gerarResumoVeiculo(Veiculo v) {
        System.out.println(v.toString());
    }

    // Calcula a idade do veiculo
    public int calcularIdadeVeiculo(Calendar dataFabricacao) {
        return Calendar.getInstance().get(Calendar.YEAR) - dataFabricacao.get(Calendar.YEAR);
    }

    // Calcula a depreciacao do veiculo
    public float calcularDepreciacaoVeiculo(Calendar dataFabricacao, float preco) {
        int idade = calcularIdadeVeiculo(dataFabricacao);
        float taxaAnual = 0.1f; // 10% ao ano
        float valorDepreciado = preco;

        // Calcula a depreciacao anual
        for (int i = 0; i < idade; i++) {
            valorDepreciado -= valorDepreciado * taxaAnual;
        }

        return valorDepreciado;
    }
}
