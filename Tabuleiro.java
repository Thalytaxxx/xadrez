public class Tabuleiro {
    private Peca[][] pecas;

    public Tabuleiro() {
        pecas = new Peca[8][8];
    }

    public void adicionarPeca(Peca peca) {
        pecas[peca.getX()][peca.getY()] = peca;
    }

    public void removerPeca(int x, int y) {
        pecas[x][y] = null;
    }

    public Peca getPeca(int x, int y) {
        return pecas[x][y];
    }

    public void moverPeca(int xAtual, int yAtual, int novoX, int novoY) {
        Peca peca = getPeca(xAtual, yAtual);
        if (peca != null && peca.ehMovimentoValido(novoX, novoY)) {
            removerPeca(xAtual, yAtual);
            peca = getPecaClasse(peca.getClass(), peca.getCor(), novoX, novoY);
            adicionarPeca(peca);
        }
    }

    private Peca getPecaClasse(Class<? extends Peca> classe, String cor, int x, int y) {
        // Implementação da lógica para criar uma peça da classe certa
    }
}
