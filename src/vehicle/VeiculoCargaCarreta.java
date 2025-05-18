package vehicle;

// Subclasse de nivel 2 da superclasse Veiculo
// Subclasse de nivel 1 da subclasse VeiculoCarga
public class VeiculoCargaCarreta extends VeiculoCarga {
    boolean articulada;
    boolean rastreamentoGPS;
    int qtdCompartimentos;
    String tipoCarga;

    // Metodo construtor de VeiculoCarga
    public VeiculoCargaCarreta(boolean articulada, boolean rastreamentoGPS, int qtdCompartimentos, String tipoCarga,int numeroEixos, double carga, String tipoCarroceria, String marca, String modelo, int dia, int mes, int ano, String cor, float preco) {
        // Chama o metodo construtor da subclasse VeiculoCarga
        super(numeroEixos, carga, tipoCarroceria, marca, modelo, dia, mes, ano, cor, preco);
        this.articulada = articulada;
        this.rastreamentoGPS = rastreamentoGPS;
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

    public void setQtdCompartimentos(int qtdCompartimentos) {
        this.qtdCompartimentos = qtdCompartimentos;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArticulada: " + this.articulada + "\nRastreamento por GPS: " + this.rastreamentoGPS + "\nQuantidade de Compartimentos: " + this.qtdCompartimentos + "\nTipos de Carga: " + this.tipoCarga;
    }
}