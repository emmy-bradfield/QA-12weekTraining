package garageChallenge;

public abstract class Vehicle {
	
	// Attributes
	Integer VehicleID;
	Integer Wheels;
	String Colour;
	Integer ManufactureYear;
	Integer CostOfWork;
	String Make;
	
	// Methods
	public abstract Integer getAge();
	public abstract Integer costOfWork(Integer WheelsReplace, Boolean EngineFault, Boolean Repaint);
	
	// Class Constructors
	public Vehicle() {
	}
	
	public Vehicle (Integer VehicleID, Integer Wheels, String Colour, Integer ManufactureYear, String Make) {
		this.VehicleID = VehicleID;
		this.Wheels = Wheels;
		this.Colour = Colour;
		this.ManufactureYear = ManufactureYear;
		this.Make = Make;
	};

	// Getters and Setters
	public Integer getVehicleID() {
		return VehicleID;
	}
	
	public Integer getWheels() {
		return Wheels;
	}

	public String getColour() {
		return Colour;
	}

	public Integer getManufactureYear() {
		return ManufactureYear;
	}
	
	public Integer getCostOfWork() {
		return CostOfWork;
	}
	
	public void setVehicleId (Integer VehicleID) {
		this.VehicleID = VehicleID;
	}
	
	public void setWheels(Integer Wheels) {
		this.Wheels = Wheels;
	}
	
	public void setColour(String Colour) {
		this.Colour = Colour;
	}
	
	public void setManufactureYear(Integer ManufactureYear) {
		this.ManufactureYear = ManufactureYear;
	}
	
	public void setCostOfWork(Integer CostOfWork) {
		this.CostOfWork = CostOfWork;
	}
	
	public String getMake() {
		return Make;
	}
	
	public void setMake(String Make) {
		this.Make = Make;
	}
}
