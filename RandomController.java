import java.util.Random;

public  class RandomController extends RobotController {


    public RandomController(Robot robot) {
        super(robot);
    }

    @Override
    public void findExit() {
        Random rand = new Random();
        int random ;
        for (; getRobot().getMaze().isExit(getRobot().getPos()) == false ;) {
            random = rand.nextInt(4)+1;
            switch (random) {
                case 1:
                    walkUp();
                    break;
                case 2:
                    walkDown();
                    break;
                case 3:
                    walkLeft();
                    break;
                case 4:
                    walkRight();
                    break;
            }
            getRobot().printMaze();

        }
        System.out.println("Exit has been found.");
    }
}
