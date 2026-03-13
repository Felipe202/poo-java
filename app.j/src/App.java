public class App {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Felipe");
        Telefone telefone1 = new Telefone("(79)", "99999-9999");
        Filial filial1 = new Filial("Filial1", gerente1, telefone1);
        
        System.out.println("Filial: " + filial1.getNome());
        System.out.println("Gerente: " + gerente1.getNome());
        System.out.println("Telefone: " + telefone1.getDdd() + telefone1.getNumero());
    }
}
