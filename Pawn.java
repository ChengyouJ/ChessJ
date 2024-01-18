package Chess_App;
public class Pawn extends AbstractChessPiece{
    public Pawn(String defaultMoveBehavior, Coordinate coordinate, boolean isWhite){
        super(defaultMoveBehavior,coordinate,isWhite, '♙', '♟');
    }
}
