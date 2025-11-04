public class Rei extends Peca {
    public Rei(String cor, int x, int y) {
        super(cor, x, y);
    }

    @Override
    public boolean ehMovimentoValido(int novoX, int novoY) {
        // Implementação da lógica de movimentação do rei
        return Math.abs(novoX - getX()) <= 1 && Math.abs(novoY - getY()) <= 1;
    }
}
