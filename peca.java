public abstract class Peca {
    private String cor;
    private int x;
    private int y;

    public Peca(String cor, int x, int y) {
        this.cor = cor;
        this.x = x;
        this.y = y;
    }

    public String getCor() {
        return cor;
    }

    public int getX() {
        return x;
    }
public Peca(int x, int y, Cor cor) {
    System.out.println("Criando peça em (" + x + ", " + y + ") com cor " + cor);
    this.x = x;
    this.y = y;
    this.cor = cor;
}

    public int getY() {
        return y;
    }

    public abstract boolean ehMovimentoValido(int novoX, int novoY);
}
