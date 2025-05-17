package JavaProgramming.vehicle;

import java.util.Calendar;

public abstract class Veiculo {
    private String cor;
    private String marca;
    private String modelo;
    private Calendar dataFabricacao;
    private float preco;

    public Veiculo(String marca, String modelo,int dia, int mes, int ano, String cor, float preco) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabricacao = Calendar.getInstance();
        this.dataFabricacao.set(dia,mes + 1,ano);
        this.preco = preco;
    }
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Calendar getDataFabricacao() {
        return this.dataFabricacao;
    }

    public void setDataFabricacao(int dia, int mes, int ano) { this.dataFabricacao.set(ano,mes-1,dia);}

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        int dia = this.dataFabricacao.get(Calendar.DAY_OF_MONTH);
        int mes =  this.dataFabricacao.get(Calendar.MONTH) + 1;
        return "marca:" + this.marca + ", modelo:" + this.modelo + ", dataFabricacao:" + (dia<10? "0":"") + dia +(mes<10? "0": "") + mes + this.dataFabricacao + ", cor:" + this.cor + ", preco:" + this.preco;
    }
}
