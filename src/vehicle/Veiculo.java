package vehicle;
/*
===============================================================================
alunos: Davi Henrique Garcia Araujo                              data(04/04/2025)
        Layla Pimenta de Melo
        Robson Ribeiro Filho
        Rafael Albino Ferreira

Professor: Alessandro
Desc: A classe Veiculo é a superclasse de todas as classes de veiculos.
       Ela possui atributos comuns a todos os veiculos, como marca, modelo, cor,
       data de fabricacao e preco. A classe possui um metodo construtor que
       inicializa esses atributos e metodos getters e setters para cada um deles.
       O metodo toString() retorna uma representacao em string dos atributos do
       veiculo.
===============================================================================
*/
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
        this.dataFabricacao.set(ano, mes - 1, dia);
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

    public String toString() {
        int dia = this.dataFabricacao.get(Calendar.DAY_OF_MONTH);
        int mes =  this.dataFabricacao.get(Calendar.MONTH) + 1;
        int ano = this.dataFabricacao.get(Calendar.YEAR);
    
        String data = String.format("%02d/%02d/%04d", dia, mes, ano);
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nData de Fabricacao: " + data + "\nCor:" + this.cor + "\nPreco:" + this.preco;
    }
}
