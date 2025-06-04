public class Livro extends Produto {
    private String autor;
    private int paginas;
    private boolean temCapaDura;
    
    public Livro(String nome, double preco, String autor, int paginas, boolean temCapaDura) {
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
        this.temCapaDura = temCapaDura;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
        if (temCapaDura) {
            System.out.println("Tipo: Capa dura");
        } else {
            System.out.println("Tipo: Capa comum");
        }
    }
}