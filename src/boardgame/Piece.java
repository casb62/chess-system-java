package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;//Enfatizando, por motivos didáticos.
    }
    
    //Para o tabuleiro não ficar visível pela camada de xadrez
    protected Board getBoard() {
        return board;
    }
}
