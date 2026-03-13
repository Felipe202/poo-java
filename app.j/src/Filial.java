public class Filial {
    String nome;
    String Gerente;
    String Telefone;

    public Filial(String nome, Gerente gerente, Telefone telefone) {
        this.nome = nome;
        this.Gerente = Gerente;
        this.Telefone = Telefone;
    }

    public String getNome() {return nome; }
    public String Gerente() {return Gerente; }
    public String Telefone() {return Telefone; }
}
