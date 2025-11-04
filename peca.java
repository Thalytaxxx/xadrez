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

    public int getY() {
        return y;
    }

    public abstract boolean ehMovimentoValido(int novoX, int novoY);
}
