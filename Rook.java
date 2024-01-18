package Chess_App;
public class Rook extends AbstractChessPiece{
    public Rook(String defaultMoveBehavior, Coordinate coordinate, boolean isWhite){
        super(defaultMoveBehavior,coordinate,isWhite, '♖', '♜');
    }
}
