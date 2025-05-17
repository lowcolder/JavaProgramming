package TrabalhoJava;

import java.util.Calendar;

public abstract class Automoveis {
    private String marca;
    private String modelo;
    private Calendar dataFabricacao;
    private String cor;
    private float preco;

    public Automoveis(String marca, String modelo,int dia, int mes, int ano, String cor, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabricacao = Calendar.getInstance();
        this.dataFabricacao.set(dia,mes + 1,ano);
        this.cor = cor;
        this.preco = preco;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Calendar getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(int dia, int mes, int ano) {
        this.dataFabricacao.set(dia,mes,ano);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        int dia = dataFabricacao.get(Calendar.DAY_OF_MONTH);
        int mes =  dataFabricacao.get(Calendar.MONTH) + 1;
        return "marca:" + marca + ", modelo:" + modelo + ", dataFabricacao:" + (dia<10? "0":"") + dia +(mes<10? "0": "") + mes + dataFabricacao + ", cor:" + cor + ", preco:" + preco;
    }
    
}
