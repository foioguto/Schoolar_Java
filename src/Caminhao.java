public class Caminhao extends Veiculo {
    private double capacidadeCarga; // em toneladas

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularValorAluguel() {
        return 200.0 + (capacidadeCarga * 20.0);
    }
}
