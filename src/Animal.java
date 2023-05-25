// Exemplo de classe Animal

abstract class Animal implements Som {
    private String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o nome do animal
    public String getNome() {
        return nome;
    }

    // Método abstrato para fazer o animal emitir som
    public abstract void emitirSom();
}



