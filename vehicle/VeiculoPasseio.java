package JavaProgramming.vehicle;


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

    public int getQtdPortas() { return this.qtdPortas;}

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean getArCondicionado() {
        return this.arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getTipoCambio() {
        return this.tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getTipoDirecao() {
        return this.tipoDirecao;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    @Override
    public String toString() {
        return "qtdPortas=" + this.qtdPortas + ", arCondicionado=" + this.arCondicionado + ", tipoCambio=" + this.tipoCambio + ", tipoDirecao=" + this.tipoDirecao;
    }
}
