package garageChallenge;

public class Motobike extends Vehicle{
	
	// Attributes
	Integer CC;
	Integer Age;
	Integer CostOfWork;
	private Integer WheelsReplace;
	private Boolean EngineFault;
	private Boolean Repaint;
	
	// Class Constructors
	public Motobike() {
	}
	
	public Motobike(Integer VehicleID, Integer Wheels, String Colour, Integer ManufactureYear, Integer CC, String Make) {
		super(VehicleID, Wheels, Colour, ManufactureYear, Make);
		this.CC = CC;
	}
	
	// Getters and Setters
	public Integer getCC() {
		return CC;
	}
	
	public void setCC(Integer CC) {
		this.CC = CC;
	}
	

	public Integer getCostOfWork() {
		return CostOfWork;
	}
	
	public void setCostOfWork(Integer WheelsReplace, Boolean EngineFault, Boolean Repaint) {
		this.WheelsReplace = WheelsReplace;
		this.EngineFault = EngineFault;
		this.Repaint = Repaint;
		
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
	public Integer getAge() {
		Age = (2022 - getManufactureYear());
		return Age;
	}

	@Override
	public Integer costOfWork(Integer WheelsReplace, Boolean EngineFault, Boolean Repaint) {
		Integer perWheel = 50;
		if (WheelsReplace > 0) {
			getMake();
			if (Make == "Harley" || Make == "Yamaha") {
				perWheel = 100;
			}
			CostOfWork = +(WheelsReplace * perWheel);
		}
		if (EngineFault == true) {
			getCC();
			if (CC <= 125) {
				CostOfWork =+ 100;
			} else {
				CostOfWork =+ 200;
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
