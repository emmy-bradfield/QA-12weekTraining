package garageChallenge;

public class Main{
	
	public static void main(String[] args) {

		Garage garage = new Garage();
		garage.addCar(4, "Black", 2009, "Ford", false, 2, false, true);
		garage.addCar(4, "Purple", 2021, "Volkswagen", true, 0, true, true);
		garage.addMotobike(2, "Black", 2012, 250, "Yamaha", 1, true, false);
		garage.addVan(4, "White", 2002, "Peugeot", 126873, 4, true, false);

		garage.currentJobs();
				
		garage.emptyGarage();
		garage.addVan(20, "Green", 1900, "Your Mum", 696969, 19, true, true);
		garage.addCar(4, "Black", 2009, "Ford", false, 2, false, true);
		garage.addCar(4, "Purple", 2021, "Volkswagen", true, 0, true, true);
		garage.addMotobike(2, "Black", 2012, 250, "Yamaha", 1, true, false);
		garage.addVan(4, "White", 2002, "Peugeot", 126873, 4, true, false);
		garage.fixVehicle(7);
		garage.currentJobs();
		
		garage.removeVehicle(5);
		garage.currentJobs();
		
		System.out.println("Not only was I unable to resolve the last part, I'm so confident that"
				+ " what I have done is likely far enough away from what the answers will be.\nAfter "
				+"many hours already, I shall resign and accept defeat on this.");
	}

}
