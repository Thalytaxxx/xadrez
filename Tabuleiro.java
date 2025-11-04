public abstract class Peca {
    protected int x;
    protected int y;
    protected Cor cor; // enum Cor { BRANCO, PRETO }

    public Peca(int x, int y, Cor cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Cor getCor() { return cor; }
    public void setPosicao(int x, int y) { this.x = x; this.y = y; }

    // cada peça implementa sua regra, usando o tabuleiro para checar bloqueios
    public abstract boolean ehMovimentoValido(int novoX, int novoY, Tabuleiro tabuleiro);

    // para toString/debug
    public abstract String getSimbolo();
}