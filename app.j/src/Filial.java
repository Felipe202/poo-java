public class Filial {
    private String nome;
    private Gerente gerente;
    private Telefone telefone;

    public Filial(String nome, Gerente gerente, Telefone telefone) {
        this.nome = nome;
        this.gerente = gerente;
        this.telefone = telefone;
    }

    public String getNome() {return nome; }
    public Gerente gerente() {return gerente; }
    public Telefone telefone() {return telefone; }
}
