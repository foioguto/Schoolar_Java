public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean alugado;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.alugado = false;
    }

    public void alugar() {
        if (!alugado) {
            alugado = true;
            System.out.println("O veículo foi alugado.");
        } else {
            System.out.println("O veículo já está alugado.");
        }
    }

    public void devolver() {
        if (alugado) {
            alugado = false;
            System.out.println("O veículo foi devolvido.");
        } else {
            System.out.println("O veículo já está disponível.");
        }
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean Alugado() {
        return alugado;
    }

    public abstract double calcularValorAluguel();
}
