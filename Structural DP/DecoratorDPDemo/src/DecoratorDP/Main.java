package DecoratorDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer gamingComputer = new GamingComputer(new BasicComputer());
        gamingComputer.assemble();
        System.out.println("\n");
        
        Computer workComputer = new WorkComputer(new BasicComputer());
        workComputer.assemble();
	}

}
