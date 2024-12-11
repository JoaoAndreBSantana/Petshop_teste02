import java.time.LocalDate;

abstract public class Animal {

    protected String nome;
    protected String codigo;
    protected boolean vacinado;
    protected char sexo;
    protected LocalDate EntregaIda;
    protected  LocalDate EntregaVolta;

    public Animal(String nome, String codigo, boolean vacinado,char sexo) {
        this.codigo= codigo;
        this.nome= nome;
        this.sexo= sexo;
        this.vacinado= vacinado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isVacinado() {
        return vacinado;
    }


    public void Vacinar(){
        if (vacinado){
            System.out.println("ANIMAL JÁ ESTÁ VACINADO!");
        }else{
            this.vacinado=true;
            this.EntregaIda= LocalDate.now();
            this.EntregaVolta= CalcularEntrega();
            System.out.println("ANIMAL VACINADO COM SUCESSO\nDATA DE ENTREGA: " + EntregaVolta);

        }

    }

    protected abstract void brincar();
    protected abstract void falar();

    protected abstract LocalDate CalcularEntrega();

}







