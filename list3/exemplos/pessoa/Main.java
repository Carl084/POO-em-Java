public class Main {
    
    public static void main(String[] args) {
        
        // pessoa é o tipo
        // pessoa1 é a referência que aponta para o obj
        // new pessoa() cria uma nova instância
        pessoa pessoa1 = new pessoa("Carlos", 23);
        pessoa pessoa2 = new pessoa("João", 25);

        // Encapsulamento
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getIdade());
    }
}