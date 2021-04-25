public abstract class RobotController {

    private Robot robot;

    public RobotController(Robot robot){
        this.robot = robot;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public abstract void findExit();

    public void walkUp(){
        for (; robot.getMaze().isInside(robot.getPos().upOf()) && robot.lookUp() != CellType.Wall ;) {
            robot.moveUp();
        }
    }
    public void walkDown(){
        for (; robot.getMaze().isInside(robot.getPos().downOf()) && robot.lookDown() != CellType.Wall ;) {
            robot.moveDown();
        }
    }
    public void walkLeft(){
        for (; robot.getMaze().isInside(robot.getPos().leftOf()) && robot.lookLeft() != CellType.Wall ;) {
            robot.moveLeft();
        }
    }
    public void walkRight(){
        for (; robot.getMaze().isInside(robot.getPos().rightOf()) && robot.lookRight() != CellType.Wall ;) {
            robot.moveRight();
        }
    }
}