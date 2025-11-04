public void imprimirTabuleiro() {
    for (int y = 0; y < 8; y++) {
        for (int x = 0; x < 8; x++) {
            Peca peca = getPeca(x, y);
            if (peca != null) {
                System.out.print(peca.getClass().getSimpleName().substring(0, 1) + " ");
            } else {
                System.out.print(". ");
            }
        }
        System.out.println();
    }
}