
public class Main {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		Memory ram = new Memory();
		HardDrive hd = new HardDrive();
		
		ComputerFacade computerFacade = new ComputerFacade(cpu, ram, hd);
		computerFacade.start();
	}

}
