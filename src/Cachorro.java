import java.time.LocalDate;

public class Cachorro extends Animal{
    private static final int Entrega= 5;


    public Cachorro(String nome, String codigo, boolean vacinado, char sexo) {
        super(nome, codigo, vacinado, sexo);
    }

    @Override
    protected void brincar() {
        System.out.println("O CACHORRO ESTÁ BRINNCANDO");
    }

    @Override
    protected void falar() {
        System.out.println("AUAU AUAU");
    }

    @Override
        protected LocalDate CalcularEntrega () {
            return EntregaIda.plusDays(Entrega);
        }
}
