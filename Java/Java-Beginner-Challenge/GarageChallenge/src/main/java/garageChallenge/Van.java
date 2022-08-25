package garageChallenge;

public class Van extends Vehicle{
	
	// Attributes
	Integer Milage;
	Integer Age;
	Integer CostOfWork;
	private Integer WheelsReplace;
	private Boolean EngineFault;
	private Boolean Repaint;
	
	// Class Constructors
	public Van() {
	}
	
	public Van(Integer VehicleID, Integer Wheels, String Colour, Integer ManufactureYear, String Make, Integer Milage) {
		super(VehicleID, Wheels, Colour, ManufactureYear, Make);
		this.Milage = Milage;
	}
	
	// Getters and Setters	
	public Integer getMilage() {
		return Milage;
	}
	
	public void setMilage(Integer Milage) {
		this.Milage = Milage;
	}
	
	public Integer getCostOfWork() {
		return CostOfWork;
	}
	
	public void setCostOfWork(Integer WheelsReplace, Boolean EngineFault, Boolean Repaint) {
		this.WheelsReplace = WheelsReplace;
		this.EngineFault = EngineFault;
		this.Repaint = Repaint;
		
	}

	@Override
	public Integer getAge() {
		Age = (2022 - getManufactureYear());
		return Age;
	}
	
	public Integer getWheelsReplace() {
		return WheelsReplace;
	}

	public void setWheelsReplace(Integer wheelsReplace) {
		WheelsReplace = wheelsReplace;
	}

	public Boolean getEngineFault() {
		return EngineFault;
	}

	public void setEngineFault(Boolean engineFault) {
		EngineFault = engineFault;
	}

	public Boolean getRepaint() {
		return Repaint;
	}

	public void setRepaint(Boolean repaint) {
		Repaint = repaint;
	}

	@Override
	public Integer costOfWork(Integer WheelsReplace, Boolean EngineFault, Boolean Repaint) {
		Integer perWheel = 100;
		if (WheelsReplace > 0) {
			getMake();
			if (Make == "BMW" || Make == "Audi" || Make == "Mercedes") {
				perWheel = 200;
			} else if (Make == "Ford" || Make == "Volkswagen" || Make == "Peugeot") {
				perWheel = 50;
			}
			CostOfWork = +(WheelsReplace * perWheel);
		}
		if (EngineFault == true) {
			getMilage();
			if (Milage >= 100000) {
				CostOfWork =+ 300;
			} else if (Milage >= 50000){
				CostOfWork =+ 200;
			} else {
				CostOfWork =+100;
			}
		} if (Repaint == true); {
			getColour();
			if (Colour == "Purple" || Colour == "Gold" || Colour == "Yellow") {
				CostOfWork = +200;
			} else {
				CostOfWork = +100;
			}
		}
		getAge();
		if (Age > 10) {
			CostOfWork = (CostOfWork*2);
		}
		return CostOfWork;

	}

}
