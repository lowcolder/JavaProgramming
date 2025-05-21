package vehicle;
/*
===============================================================================
alunos: Davi Henrique Garcia Araujo                              data(04/04/2025)
        Layla Pimenta de Melo
        Robson Ribeiro Filho
        Rafael Albino Ferreira

Professor: Alessandro
Desc: A classe VeiculoCargaCarreta representa um veiculo de carga do tipo carreta, com
      atributos adicionais como se é articulada, possui rastreamento por GPS,
      refrigerada, comprimento total, quantidade de compartimentos e tipo de carga.
      Ela as implementações de VeiculoCarga.
===============================================================================
*/
// Subclasse de nivel 2 da superclasse Veiculo
// Subclasse de nivel 1 da subclasse VeiculoCarga
public class VeiculoCargaCarreta extends VeiculoCarga {
    boolean articulada;
    boolean rastreamentoGPS;
    boolean refrigerada;
    double comprimentoTotal;
    int qtdCompartimentos;
    String tipoCarga;

    // Metodo construtor de VeiculoCarga
    public VeiculoCargaCarreta(boolean articulada, boolean rastreamentoGPS, boolean refrigerada, double comprimentoTotal, int qtdCompartimentos, String tipoCarga,int numeroEixos, double carga, String tipoCarroceria, String marca, String modelo, int dia, int mes, int ano, String cor, float preco) {
        // Chama o metodo construtor da subclasse VeiculoCarga
        super(numeroEixos, carga, tipoCarroceria, marca, modelo, dia, mes, ano, cor, preco);
        this.articulada = articulada;
        this.rastreamentoGPS = rastreamentoGPS;
        this.refrigerada = refrigerada;
        this.comprimentoTotal = comprimentoTotal;
        this.qtdCompartimentos = qtdCompartimentos;
        this.tipoCarga = tipoCarga;
    }

    // Getters
    public boolean getArticulada() {
        return this.articulada;
    }

    public boolean getRastreamentoGPS() {
        return this.rastreamentoGPS;
    }

    public boolean getRefrigerada() {
        return this.refrigerada;
    }

    public double getComprimentoTotal() {
        return this.comprimentoTotal;
    }

    public int getQtdCompartimentos() {
        return this.qtdCompartimentos;
    }

    public String getTipoCarga() {
        return this.tipoCarga;
    }

    // Setters
    public void setArticulada(boolean articulada) {
        this.articulada = articulada;
    }

    public void setRastreamentoGPS(boolean rastreamentoGPS) {
        this.rastreamentoGPS = rastreamentoGPS;
    }

    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }

    public void setComprimentoTotal(double comprimentoTotal) {
        this.comprimentoTotal = comprimentoTotal;
    }

    public void setQtdCompartimentos(int qtdCompartimentos) {
        this.qtdCompartimentos = qtdCompartimentos;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArticulada: " + this.articulada + "\nRastreamento por GPS: " + this.rastreamentoGPS + "\nRefrigerada: " + this.refrigerada + "Comprimento Total: " + this.comprimentoTotal + "\nQuantidade de Compartimentos: " + this.qtdCompartimentos + "\nTipos de Carga: " + this.tipoCarga;
    }
}