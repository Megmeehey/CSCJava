package S3_ObjectsAndPackages;

/**
 * Created by megmeehey on 14.07.17.
 */
public class RobotTest {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        moveRobot(robot, -10, 20);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int dX = toX - robot.getX(), dY = toY - robot.getY();
        if (dX > 0) {
            while (!(robot.getDirection() == Direction.RIGHT)) {
                robot.turnRight();
            }
        } else if (dX < 0) {
            while (!(robot.getDirection() == Direction.LEFT)) {
                robot.turnRight();
            }
        }
        dX = Math.abs(dX);
        while (dX != 0) {
            robot.stepForward();
            dX--;
        }

        if (dY > 0) {
            while (!(robot.getDirection() == Direction.UP)) {
                robot.turnRight();
            }
        } else if (dY < 0) {
            while (!(robot.getDirection() == Direction.DOWN)) {
                robot.turnRight();
            }
        }
        dY = Math.abs(dY);
        while (dY != 0) {
            robot.stepForward();
            dY--;
        }
    }
}
