package Chess_App;
public class Queen extends AbstractChessPiece{
    public Queen(String defaultMoveBehavior, Coordinate coordinate, boolean isWhite){
        super(defaultMoveBehavior,coordinate,isWhite, '♕','♛');
    }
}
