//Adolfo Medina
public class CargoShip extends Ship {

	//instance variable
	private double tonnage;
	private double maxSpeed;
	
	//default constructor
	public CargoShip()
	{
		super();
		this.tonnage = 0;
		this.maxSpeed = 0;
	}
	
	//parameterized constructor
	public CargoShip(String xShipName, String xDate, double xTonnage, double xMaxSpeed)
	{
		super(xShipName, xDate);
		this.setTonnage(xTonnage);
		this.setMaxSpeed(xMaxSpeed);
	}
	//accesors
	public double getTonnage()
	{
		return this.tonnage;
	}
	
	public double getMaxSpeed()
	{
		return this.maxSpeed;
	}
	
	//mutators
	public void setTonnage(double xTonnage)
	{
		if(xTonnage > 0)
		{
			this.tonnage = xTonnage;
		}
		else
		{
			System.out.println("Invalid value entered for tonnage");
		}
	}
	
	public void setMaxSpeed(double xMaxSpeed)
	{
		if(xMaxSpeed > 0)
		{
			this.tonnage = xMaxSpeed;
		}
		else
		{
			System.out.println("Invalid value entered for tonnage");
		}
	}
	//method override
	public String toString()
	{
		return super.toString() +
				"\nTonnage: "+this.tonnage
		+"\nMax Speed: "+this.maxSpeed+"";
	}
	
}
