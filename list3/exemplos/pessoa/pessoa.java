public class pessoa {
// Classes mais adequadas não deixa os atributos diretamente acessíveis. 

    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public pessoa(String nome, int idade) {
        this.nome = nome; // Salva o nome recebido pelo construtor no atributo.
        this.idade = idade;

    }

    public String getName() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        this.idade = idade;
    }
}