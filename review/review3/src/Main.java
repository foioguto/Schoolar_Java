public class Main {

    public static void main(String[] args) {

        Cachorro catioro = new Cachorro();

        catioro.raca = "catioro";
        catioro.emitirSom(catioro.raca);

        System.out.println(" ");
        Gato gatito = new Gato();

        gatito.raca = "gatito";
        gatito.emitirSom(gatito.raca);
    }
}
