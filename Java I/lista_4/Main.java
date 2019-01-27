public class Main {

    public static void main(String[] args) {

        try{
            punkt2D startPoint = new punkt2D(2, 2);
            Statek ship = new Statek(startPoint);

            ship.moveShip(1, 1);
            System.out.println("X: " + ship.getCurrentPosition().getX());
            System.out.println("Y: " +ship.getCurrentPosition().getY());

            //ship.moveShip(1, 2);
        } catch(Exception e){
            System.out.println("Bład: "+ e);
        }



    }
}
