import java.time.LocalDate;

public class Gato extends Animal{
    private static final int Entrega= 2;

    public Gato(String nome, String codigo, boolean vacinado, char sexo) {
        super(nome, codigo, vacinado, sexo);
    }

    @Override
    protected void brincar() {
        System.out.println("O GATO ESTÁ BRINCANDO");
    }

    @Override
    protected void falar() {
        System.out.println("MIAU MIAU");
    }

    @Override
    protected LocalDate CalcularEntrega() {
        return EntregaIda.plusDays(Entrega);
    }
}
