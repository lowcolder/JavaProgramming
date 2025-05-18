package vehicle;

// Subclasse de nivel 2 da superclasse Veiculo
// Subclasse de nivel 1 da subclasse VeiculoPasseio
public class VeiculoPasseioSUV extends VeiculoPasseio {
    boolean freioABS;
    int qtdAirbags;
    int capacidadePassageiros;
    String tipoCombustivel;

    // Metodo construtor de VeiculoPasseioSUV
    public VeiculoPasseioSUV(boolean freioABS, int qtdAirbags, int capacidadePassageiros, String tipoCombustivel, int qtdPortas, boolean arCondicionado, String tipoCambio, String tipoDirecao, String marca, String modelo, int dia, int mes, int ano, String cor, float preco) {
        // Chama o metodo construtor da subclasse VeiculoPasseio
        super(qtdPortas, arCondicionado, tipoCambio, tipoDirecao, marca, modelo, dia, mes, ano, cor, preco);
        this.freioABS = freioABS;
        this.qtdAirbags = qtdAirbags;
        this.capacidadePassageiros = capacidadePassageiros;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Getters
    public boolean getFreioABS() {
        return this.freioABS;
    }

    public int getQtdAirbags() {
        return this.qtdAirbags;
    }

    public int getCapacidadePassageiros() {
        return this.capacidadePassageiros;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    // Setters
    public void setFreioABS(boolean freioABS) {
        this.freioABS = freioABS;
    }

    public void setQtdAirbags(int qtdAirbags) {
        this.qtdAirbags = qtdAirbags;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFreios ABS: " + this.freioABS + "\nQuantidade de Airbags: " + this.qtdAirbags + "\nCapacidade de Passageiros: " + this.capacidadePassageiros + "\nTipo de Combustivel: " + this.tipoCombustivel;
    }
}

