public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public boolean equals (Position position){
        if(this.x == getX() && this.y == getY())
            return true;
        else return false;

    }


    public Position upOf(){
        return new Position(x-1,y);
    }
    public Position downOf(){
        return new Position(x+1,y);
    }
    public Position leftOf(){
        return new Position(x,y-1);
    }
    public Position rightOf(){
        return new Position(x,y+1);

    }
}
