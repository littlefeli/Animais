public class Main {
    public static void main(String[] args) {

        // Criando instâncias das classes Cachorro e Gato
        Cachorro cachorro = new Cachorro("Rex", 12);
        Gato gato = new Gato("Frajola");

        // Chamando o método emitirSom() das instâncias
        cachorro.emitirSom(); // Saída: O cachorro Rex está latindo.
        gato.emitirSom();     // Saída: O gato Frajola está miando.
    }
}