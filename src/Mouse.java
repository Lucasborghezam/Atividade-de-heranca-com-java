public class Mouse extends Produto {
    private String tipoConexao;
    private int dpi;
    private boolean temIluminacaoRGB;

    public Mouse(String nome, double preco, String tipoConexao, int dpi, boolean temIluminacaoRGB) {
        super(nome, preco);
        this.tipoConexao = tipoConexao;
        this.dpi = dpi;
        this.temIluminacaoRGB = temIluminacaoRGB;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de conexão: " + tipoConexao);
        System.out.println("DPI: " + dpi);
        if (temIluminacaoRGB) {
            System.out.println("Iluminação RGB: Sim");
        } else {
            System.out.println("Iluminação RGB: Não");
        }
    }
    
}
