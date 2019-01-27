public class Statek {

    private punkt2D startPosition, currentPosition;

    static final int W_LEWO = 1, W_PRAWO = 2, W_GORE = 3, W_DOL = 4;

    public Statek(punkt2D newPosition){
        startPosition = newPosition;
        currentPosition = newPosition;
        System.out.println("Start");
        System.out.println("X: " + currentPosition.getX());
        System.out.println("Y: " + currentPosition.getY());
    }

    public punkt2D getStartPosition(){
        return this.startPosition;
    }

    public void setStartPosition(punkt2D startPosition){
        this.startPosition = startPosition;
    }

    public punkt2D getCurrentPosition(){
        return this.currentPosition;
    }

    public void setCurrentPosition(punkt2D currentPosition){
        this.currentPosition = currentPosition;
    }

    public void moveShip(int direction, int value){

        punkt2D pos = getCurrentPosition();

        switch(direction){
            case W_LEWO: {
                System.out.println("Ruch w lewo");
                pos.setX( pos.getX() - value );
                this.setCurrentPosition(pos);
            } break;
            case W_PRAWO: {
                System.out.println("Ruch w prawo");
                pos.setX( pos.getX() + value );
                this.setCurrentPosition(pos);
            } break;
            case W_GORE: {
                System.out.println("Ruch w góre");
                pos.setY( pos.getY() + value );
                this.setCurrentPosition(pos);
            } break;
            case W_DOL: {
                System.out.println("Ruch w dół");
                pos.setY( pos.getY() - value );
                this.setCurrentPosition(pos);
            } break;
        }

    }

}
