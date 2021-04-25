public class Robot {

    private Position pos;
    private Maze maze;

    public Robot(Position pos, Maze maze) {
        this.pos = pos;
        this.maze = maze;
    }

    public Position getPos() {
        return pos;
    }

    public Maze getMaze() {
        return maze;
    }

    @Override
    public String toString() {
        return "R[" + pos.getX() + ", " + pos.getY() + "]";
    }

    public void printMaze() {

        int length = maze.getPosition().length;
        int lengthInside = maze.getPosition()[0].length;
        String string = "";

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <lengthInside; j++) {
                if (maze.getPosition()[i][j] == CellType.Space && (pos.getX() != i ||  pos.getY() != j)) {
                    string += "  ";
                }

                if (maze.getPosition()[i][j] == CellType.Wall) {
                    string += "O ";
                }

                if (maze.getPosition()[i][j] == CellType.Exit && (pos.getX() != i || pos.getY() != j)) {
                    string += "X ";
                }

                if (pos.getX() == i && pos.getY() == j) {
                    string += "* ";

                }
            }
            string += "\n";
        }
        System.out.println(string);
    }



    public CellType lookUp() {

        return getMaze().getPosition()[getPos().getX()-1][getPos().getY()];

    }

    public CellType lookDown(){

        return getMaze().getPosition()[getPos().getX()+1][getPos().getY()];
    }
    public CellType lookLeft(){

        return getMaze().getPosition()[getPos().getX()][getPos().getY()-1];
    }
    public CellType lookRight(){

        return getMaze().getPosition()[getPos().getX()][getPos().getY()+1];
    }

    public void moveUp() {
        if (getMaze().isInside(pos.upOf()) && lookUp() != CellType.Wall) {
            pos.setX(pos.getX() - 1);
        }

    }
    public void moveDown(){
        if (getMaze().isInside(pos.downOf()) && lookDown() != CellType.Wall ){
            pos.setX(pos.getX()+1);
        }
    }
    public void moveLeft(){
        if (getMaze().isInside(pos.leftOf()) && lookLeft() != CellType.Wall ){
            pos.setY(pos.getY()-1);
        }
    }
    public void moveRight(){
        if (getMaze().isInside(pos.rightOf()) && lookRight() != CellType.Wall ){
            pos.setY(pos.getY()+1);
        }
    }


}