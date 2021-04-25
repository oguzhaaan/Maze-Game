public class Main {
    public static void main(String[] args) {
        CellType[][] labirent = {
                {CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall},
                {CellType.Wall,CellType.Space,CellType.Space,CellType.Space,CellType.Space,CellType.Wall,CellType.Space,CellType.Space,CellType.Space,CellType.Space,CellType.Wall},
                {CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall,CellType.Space,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall},
                {CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall,CellType.Space,CellType.Space,CellType.Space,CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall},
                {CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall,CellType.Space,CellType.Wall,CellType.Wall,CellType.Space,CellType.Space,CellType.Space,CellType.Wall},
                {CellType.Space,CellType.Space,CellType.Space,CellType.Wall,CellType.Space,CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall,CellType.Space,CellType.Wall},
                {CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall,CellType.Space,CellType.Wall},
                {CellType.Exit,CellType.Space,CellType.Space,CellType.Wall,CellType.Space,CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall,CellType.Space,CellType.Wall},
                {CellType.Wall,CellType.Space,CellType.Wall,CellType.Wall,CellType.Space,CellType.Space,CellType.Space,CellType.Space,CellType.Wall,CellType.Space,CellType.Wall},
                {CellType.Wall,CellType.Space,CellType.Space,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Space,CellType.Wall},
                {CellType.Wall,CellType.Wall,CellType.Space,CellType.Space,CellType.Space,CellType.Space,CellType.Space,CellType.Space,CellType.Space,CellType.Space,CellType.Wall},
                {CellType.Wall,CellType.Space,CellType.Space,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Space,CellType.Space,CellType.Wall,CellType.Wall,CellType.Wall},
                {CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall,CellType.Wall},


        };
        Position position = new Position(5,0);
        Maze maze = new Maze(labirent);
        Robot robot = new Robot(position,maze);
        RandomController randomcontroller = new RandomController(robot);
        randomcontroller.findExit();

    }
}
