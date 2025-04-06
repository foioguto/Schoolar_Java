public class Main {

    public static void main(String[] args) {

        Produto felicidade = new Produto();

        felicidade.setPreco(-10);

        double precinho = felicidade.aplicarDesconto(felicidade.getPreco(), 10);
        System.out.println(precinho);
    }
}
