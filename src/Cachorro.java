
    class Cachorro extends Animal {
        private double idade;


        // Construtor
        public Cachorro(String nome, int idade) {
            this.idade = idade;
            super(nome);
        }

        // Implementação do método abstrato emitirSom() da classe Animal
        public void emitirSom() {
            System.out.println("O cachorro " + getNome() + " está latindo.");
        }
    }


