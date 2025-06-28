package BridgeDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal bigDog = new Dog(3, 500, "Meat", new BigDog());
        Animal smallDog = new Dog(2, 250, "Granules", new SmallDog());
        
        bigDog.feed();
        smallDog.feed();
	}

}
