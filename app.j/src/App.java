public class App {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Felipe");
        Telefone telefone1 = new Telefone("79", "99999-9999");
        Filial filial1 = new Filial("Filial1", gerente1, telefone1);
        
        System.out.println("Filial: " + filial1.getNome());
        System.out.println("Gerente: " + filial1.getGerente().getNome());
        System.out.println("Telefone: " + filial1.getTelefone().getTelefoneCompleto());
    }
}
