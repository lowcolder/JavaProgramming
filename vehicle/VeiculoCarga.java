package JavaProgramming.vehicle;


public class VeiculoCarga extends Veiculo {
    private int numeroEixos;
    private double carga;
    private String tipoCarroceria;
    

    public VeiculoCarga(int numeroEixos, double carga, String tipoCarroceria, String marca, String modelo, int dia, int mes, int ano, String cor, float preco) {
        super(marca, modelo, dia, mes, ano, cor, preco);
        this.numeroEixos = numeroEixos;
        this.carga = carga;
        this.tipoCarroceria = tipoCarroceria;
    }

    public int getNumeroEixos() {
        return this.numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public double getCarga() {
        return this.carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getTipoCarroceria() {
        return this.tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        return "numeroEixos:" + this.numeroEixos + ", carga:" + this.carga + ", tipoCarroceria:" + this.tipoCarroceria ;
    }
    
}
