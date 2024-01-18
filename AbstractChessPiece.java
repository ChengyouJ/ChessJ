package Chess_App;

public abstract class AbstractChessPiece {
    private char whiteSymbol;
    private char blackSymbol;
    public boolean isWhite;
    public Coordinate coordinate;
    public String defaultMoveBehavior;
    public boolean moved = false;
    AbstractChessPiece(String defaultMoveBehavior, Coordinate coordinate, boolean isWhite, char whiteSymbol, char blackSymbol){
        this.defaultMoveBehavior = defaultMoveBehavior;
        this.coordinate = coordinate;
        this.isWhite = isWhite;
        this.whiteSymbol = whiteSymbol;
        this.blackSymbol = blackSymbol;
    }
    private void moved(){
        moved = true;
    }
    /**Symbol representing the piece
     @return symbol of chess piece*/
    public char getSymbol(){
        if(this.isWhite){
            return this.whiteSymbol;
        }else{
            return this.blackSymbol;
        }
    }
    /**get a string that represent the movement of the piece*/
    public String getDefaultMoveBehavior(){
        return this.defaultMoveBehavior;
    }
    /**updating coordinate of piece and set moved to true*/
    public void update(Coordinate coordinate){
        moved();
        this.coordinate = coordinate;
    }
}
