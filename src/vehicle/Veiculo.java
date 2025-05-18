package vehicle;

import java.util.Calendar;

// Superclasse Veiculo
public abstract class Veiculo {
    private String cor;
    private String marca;
    private String modelo;
    private Calendar dataFabricacao;
    private float preco;

    // Metodo construtor
    public Veiculo(String marca, String modelo,int dia, int mes, int ano, String cor, float preco) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabricacao = Calendar.getInstance();
        this.dataFabricacao.set(dia,mes + 1,ano);
        this.preco = preco;
    }

    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Calendar getDataFabricacao() {
        return this.dataFabricacao;
    }

    public String getCor() {
        return this.cor;
    }

    public float getPreco() {
        return this.preco;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDataFabricacao(int dia, int mes, int ano) {
        this.dataFabricacao.set(ano,mes-1,dia);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        int dia = this.dataFabricacao.get(Calendar.DAY_OF_MONTH);
        int mes =  this.dataFabricacao.get(Calendar.MONTH) + 1;
        return "Marca:" + this.marca + "\nModelo:" + this.modelo + "\nData de Fabricacao:" + (dia<10? "0":"") + dia +(mes<10? "0": "") + mes + this.dataFabricacao + "\nCor:" + this.cor + "\nPreco:" + this.preco;
    }
}
