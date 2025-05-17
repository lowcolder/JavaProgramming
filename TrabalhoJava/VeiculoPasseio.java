package TrabalhoJava;


public class VeiculoPasseio extends Automoveis{
    private int qtdPortas;
    private boolean arCondicionado;
    private String tipoCambio;
    private String tipoDirecao;

    public VeiculoPasseio(int qtdPortas, boolean arCondicionado, String tipoCambio, String tipoDirecao, String marca, String modelo, int dia, int mes, int ano, String cor, float preco) {
        super(marca, modelo, dia, mes, ano, cor, preco);
        this.qtdPortas = qtdPortas;
        this.arCondicionado = arCondicionado;
        this.tipoCambio = tipoCambio;
        this.tipoDirecao = tipoDirecao;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getTipoDirecao() {
        return tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    @Override
    public String toString() {
        return "qtdPortas=" + qtdPortas + ", arCondicionado=" + arCondicionado + ", tipoCambio=" + tipoCambio + ", tipoDirecao=" + tipoDirecao;
    }
}
