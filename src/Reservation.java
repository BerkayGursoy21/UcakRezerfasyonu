import java.util.Random;

public class Reservation {
    public int Price;
    public int PassengerNumber;

    public Reservation() {
        Random rnd = new Random();
        Price = rnd.nextInt(9501) + 500;

        Random rnd2 = new Random();
        PassengerNumber = rnd2.nextInt(500) + 1;
    }
}
