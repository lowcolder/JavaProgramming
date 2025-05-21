package vehicle;
/*
===============================================================================
alunos: Davi Henrique Garcia Araujo                              data(04/04/2025)
        Layla Pimenta de Melo
        Robson Ribeiro Filho
        Rafael Albino Ferreira

Professor: Alessandro
Desc: A classe VeiculoCarga representa um veiculo de carga, que herda da superclasse Veiculo.
       Ela possui atributos e metodos especificos para veiculos de carga.
       Os atributos incluem o numero de eixos, a carga e o tipo de carroceria.
       Os metodos incluem getters e setters para acessar e modificar os atributos,
       alem de um metodo toString() para representar o objeto como uma string.
===============================================================================
*/
// Subclasse de nivel 1 da superclasse Veiculo
public class VeiculoCarga extends Veiculo {
    private int numeroEixos;
    private double carga;
    private String tipoCarroceria;
    
    // Metodo construtor de VeiculoCarga
    public VeiculoCarga(int numeroEixos, double carga, String tipoCarroceria, String marca, String modelo, int dia, int mes, int ano, String cor, float preco) {
        // Chama o metodo construtor da superclasse Veiculo
        super(marca, modelo, dia, mes, ano, cor, preco);
        this.numeroEixos = numeroEixos;
        this.carga = carga;
        this.tipoCarroceria = tipoCarroceria;
    }

    // Getters
    public int getNumeroEixos() {
        return this.numeroEixos;
    }

    public double getCarga() {
        return this.carga;
    }

    public String getTipoCarroceria() {
        return this.tipoCarroceria;
    }

    // Setters
    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de Eixos: " + this.numeroEixos + "\nCarga: " + this.carga + "\nTipo de Carroceria: " + this.tipoCarroceria;
    } 
}
