# ChessJ
Chess_App
Basic chess pieces classes for Java OOP. Designed to be expanded into chess variants.

To add a new piece, follow the following structure.

public class [CHESS PIECE] extends AbstractChessPiece{
    public [CHESS PIECE](String defaultMoveBehavior, Coordinate coordinate, boolean isWhite){
        super(defaultMoveBehavior,coordinate,isWhite, [WHITE SYMBOL], [BLACK SYMBOL]);
    }
}
