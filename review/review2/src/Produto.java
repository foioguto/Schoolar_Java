public class Produto {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double preco, double desconto) {
        double precinho = preco - (preco * desconto / 100);
        if (precinho < 0) {
            System.out.println("Deu nao");
            return 0;
        } else{
            return precinho;
        }
    }
}
