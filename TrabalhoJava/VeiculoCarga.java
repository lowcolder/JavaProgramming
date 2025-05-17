package TrabalhoJava;

public class VeiculoCarga extends Automoveis {
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
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        return "numeroEixos:" + numeroEixos + ", carga:" + carga + ", tipoCarroceria:" + tipoCarroceria ;
    }
    
}
