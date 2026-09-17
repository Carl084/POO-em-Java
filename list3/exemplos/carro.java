public class carro {
    private  int velocidade; // Atributo
    
    public carro(int velocidadeInicial) {
        velocidade = velocidadeInicial;
    }

    public void acelera() { // Métodos
        velocidade++;
    }

    public void freia() { // Métodos
        velocidade--;
    }
}
