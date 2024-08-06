import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Livro novo_livro = new Livro();
        System.out.println("Qual a editora do livro?");
        String editora = teclado.nextLine();
        novo_livro.editora = editora;
    
        System.out.println("Editora:" + editora);
        teclado.close();
    }
}


class Livro {
    String  editora;
    String  autor;
    String nome;
    String genero;
    int data_de_lancamento; 
}