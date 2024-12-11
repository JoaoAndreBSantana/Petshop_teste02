import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Princesa", "001", false, 'm');
        Gato gato1 = new Gato("Flinn", "002", false, 'm');
        Papagaio papagaio1 = new Papagaio("Cezar", "003", true, 'f');


        cachorro1.brincar();
        cachorro1.falar();
        cachorro1.Vacinar();
        cachorro1.Vacinar();

        gato1.falar();
        gato1.brincar();

    }
}