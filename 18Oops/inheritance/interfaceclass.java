public class interfaceclass {
    public static void main(String[] args) {
        Queen Q= new Queen();
        Q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down ,left right digonal(in all directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down ,left right ");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down ,left right(1 position only) ");
    }
}
