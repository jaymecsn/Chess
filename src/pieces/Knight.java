package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Knight extends Piece{
    public Knight(Board board, int cols, int rows, boolean isWhite){
        super(board);
        this.cols = cols;
        this.rows = rows;
        xPos = cols * board.tileSize;
        yPos = rows * board.tileSize;

        this.isWhite = isWhite;
        this.name = "Knight";

        this.sprite =sheet.getSubimage(3*sheetScale, isWhite ? 0: sheetScale,sheetScale,sheetScale).getScaledInstance(sheetScale,sheetScale, BufferedImage.SCALE_SMOOTH);
    }
}
