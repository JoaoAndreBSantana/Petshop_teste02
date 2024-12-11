import java.time.LocalDate;

public class Papagaio extends Animal{
    private static final int Entrega= 4;

    public Papagaio(String nome, String codigo, boolean vacinado, char sexo) {
        super(nome, codigo, vacinado, sexo);
    }

    @Override
    protected void brincar() {
        System.out.println("O PAPAGAIO ESTÁ BRINCANDO!");
    }

    @Override
    protected void falar() {
        System.out.println("BOM DIA GALERAAA");
    }

    @Override
    protected LocalDate CalcularEntrega() {
        return EntregaIda.plusDays(Entrega);
    }
}
