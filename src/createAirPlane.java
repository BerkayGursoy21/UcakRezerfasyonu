import java.util.Random;

public class createAirPlane implements Airplane {
    private Random random = new Random();

    public createAirPlane() {
        int randomNum = random.nextInt(4);

        if (randomNum == 0) {
        }
        if (randomNum == 1) {
        }
        if (randomNum == 2) {
        }
        if (randomNum == 3) {
        }
    }

	@Override
	public String getModel() {
		
		return null;
	}

	@Override
	public void setModel(String model) {
		
		
	}
}
