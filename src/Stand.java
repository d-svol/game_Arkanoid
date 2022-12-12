public class Stand extends BaseObject {
    private double speed = 1;
    private double direction = 0;           //-1 left +1 right
    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Stand(double x, double y) {
        super(x, y, 3);
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public void  moveLeft(){
        direction = -1;
    }
    public void  moveRight(){
        direction = 1;
    }

    @Override
    void draw(Canvas canvas){
        canvas.drawMatrix(x - radius + 1, y, matrix, 'M');
    }

    @Override
    void move(){
        x += speed * direction;
        checkBorders(radius, Arkanoid.game.getWidth() - radius + 1, 1, Arkanoid.game.getHeight() + 1);
    }
}
