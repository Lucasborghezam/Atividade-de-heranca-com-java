public class Main{
    public static void main(String[] args) {
        Livro livro = new Livro("Matrix", 1.50, "Lucas Borghezam", 1500, false);
        Camisa camisa = new Camisa("Camisa Básica", 29.99, "Branca", "G", "Algodão");
        Mouse mouse = new Mouse("Mouse Gamer Razer", 500.90, "USB", 16000, true);
        
        System.out.println("=== INFORMAÇÕES DO LIVRO ===");
        livro.exibirInfo();
        
        System.out.println();
        System.out.println("=== INFORMAÇÕES DA CAMISA ===");
        camisa.exibirInfo();

        System.out.println();
        System.out.println("=== INFORMAÇÕES DO MOUSE ===");
        mouse.exibirInfo();
    }
}