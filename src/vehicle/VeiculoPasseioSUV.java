package vehicle;
/*
===============================================================================
alunos: Davi Henrique Garcia Araujo                              data(04/04/2025)
        Layla Pimenta de Melo
        Robson Ribeiro Filho
        Rafael Albino Ferreira

Professor: Alessandro
Desc: A classe VeiculoPasseioSUV representa um veiculo de passeio do tipo SUV, com
      atributos adicionais como se possui freio ABS, tracao 4x4, altura do solo,
      quantidade de airbags, capacidade de passageiros e tipo de combustivel.
      Ela herda as implementacoes da classe VeiculoPasseio, possui getters e setters
      para receber e modificar informacoes na classe e possui o metodo toString()
      que disponibiliza as informacoes da classe em forma de texto.
===============================================================================
*/
// Subclasse de nivel 2 da superclasse Veiculo
// Subclasse de nivel 1 da subclasse VeiculoPasseio
public class VeiculoPasseioSUV extends VeiculoPasseio {
    boolean freioABS;
    boolean tracao4X4;
    int alturaSolo;
    int qtdAirbags;
    int capacidadePassageiros;
    String tipoCombustivel;

    // Metodo construtor de VeiculoPasseioSUV
    public VeiculoPasseioSUV(boolean freioABS, boolean tracao4X4, int alturaSolo, int qtdAirbags, int capacidadePassageiros, String tipoCombustivel, int qtdPortas, boolean arCondicionado, String tipoCambio, String tipoDirecao, String marca, String modelo, int dia, int mes, int ano, String cor, float preco) {
        // Chama o metodo construtor da subclasse VeiculoPasseio
        super(qtdPortas, arCondicionado, tipoCambio, tipoDirecao, marca, modelo, dia, mes, ano, cor, preco);
        this.freioABS = freioABS;
        this.tracao4X4 = tracao4X4;
        this.alturaSolo = alturaSolo;
        this.qtdAirbags = qtdAirbags;
        this.capacidadePassageiros = capacidadePassageiros;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Getters
    public boolean getFreioABS() {
        return this.freioABS;
    }

    public boolean getTracao4X4() {
        return this.tracao4X4;
    }

    public int getAlturaSolo() {
        return this.alturaSolo;
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

    public void setTracao4X4(boolean tracao4X4) {
        this.tracao4X4 = tracao4X4;
    }

    public void setAlturaSolo(int alturaSolo) {
        this.alturaSolo = alturaSolo;
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
        return super.toString() + "\nFreios ABS: " + this.freioABS + "\nTracao 4x4: " + this.tracao4X4 + "\nAltura do Solo: " + this.alturaSolo + "\nQuantidade de Airbags: " + this.qtdAirbags + "\nCapacidade de Passageiros: " + this.capacidadePassageiros + "\nTipo de Combustivel: " + this.tipoCombustivel;
    }
}

