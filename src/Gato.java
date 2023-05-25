// Exemplo de classe Gato que herda da classe Animal
class Gato extends Animal {
    // Construtor
    public Gato(String nome) {
        super(nome);
    }

    // Implementação do método abstrato emitirSom() da classe Animal
    public void emitirSom() {
        System.out.println("O gato " + getNome() + " está miando.");
    }
}