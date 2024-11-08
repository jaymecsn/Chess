package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Queen extends Piece{
    public Queen(Board board, int cols, int rows, boolean isWhite){
        super(board);
        this.cols = cols;
        this.rows = rows;
        xPos = cols * board.tileSize;
        yPos = rows * board.tileSize;

        this.isWhite = isWhite;
        this.name = "Queen";

        this.sprite =sheet.getSubimage(sheetScale, isWhite ? 0: sheetScale,sheetScale,sheetScale).getScaledInstance(board.tileSize,board.tileSize, BufferedImage.SCALE_SMOOTH);
    }
}
