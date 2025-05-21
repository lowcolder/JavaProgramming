package vehicle;
/*
===============================================================================
alunos: Davi Henrique Garcia Araujo                              data(04/04/2025)
        Layla Pimenta de Melo
        Robson Ribeiro Filho
        Rafael Albino Ferreira

Professor: Alessandro
Desc: A classe VeiculoPasseio é uma subclasse da superclasse Veiculo. Ela
      possui atributos e metodos especificos para veiculos de passeio, como
      quantidade de portas, ar condicionado, tipo de cambio e tipo de direcao.
      A classe possui um metodo construtor que inicializa esses atributos e
      metodos getters e setters para cada um deles. O metodo toString() retorna
      uma representacao em string dos atributos do veiculo de passeio.
===============================================================================
*/
// Subclasse de nível 1 da superclasse Veiculo
public class VeiculoPasseio extends Veiculo{
    private int qtdPortas;
    private boolean arCondicionado;
    private String tipoCambio;
    private String tipoDirecao;

    // Metodo construtor de VeiculoPasseio
    public VeiculoPasseio(int qtdPortas, boolean arCondicionado, String tipoCambio, String tipoDirecao, String marca, String modelo, int dia, int mes, int ano, String cor, float preco) {
        // Chama o metodo construtor da superclasse Veiculo
        super(marca, modelo, dia, mes, ano, cor, preco);
        this.qtdPortas = qtdPortas;
        this.arCondicionado = arCondicionado;
        this.tipoCambio = tipoCambio;
        this.tipoDirecao = tipoDirecao;
    }

    // Getters
    public int getQtdPortas() { 
        return this.qtdPortas;
    }

    public boolean getArCondicionado() {
        return this.arCondicionado;
    }

    public String getTipoCambio() {
        return this.tipoCambio;
    }

    public String getTipoDirecao() {
        return this.tipoDirecao;
    }

    // Setters
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public void setTipoDirecao(String tipoDirecao) {
        this.tipoDirecao = tipoDirecao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de Portas: " + this.qtdPortas + "\nAr Condicionado: " + this.arCondicionado + "\nTipo de Cambio: " + this.tipoCambio + "\nTipo de Direcao: " + this.tipoDirecao;
    }
}
