//adolfo Medina
public class CruiseShip extends Ship {
	
	//instance variables
	private int passengers;
	private int crew;
	
	//default constructor
	public CruiseShip()
	{
		super();
		this.passengers = 0;
		this.crew = 0;
	}
	//paramaterized constructor
	 CruiseShip(String xShipName, String xDate, int xPassengers, int xCrew)
	{
		super(xShipName, xDate);
		this.setPassengers(xPassengers);
		this.setCrew(xCrew);
	}
	//accesors
	public int getPassengers()
	{
		return this.passengers;
	}
	
	public int getCrew()
	{
		return this.crew;
	}
	//mutators
	public void setPassengers(int xPassengers)
	{
		if(xPassengers > 0)
		{
			this.passengers = xPassengers;
		}
		else 
		{
			System.out.println("Invalid entry for passengers");
		}
	}
	
	public void setCrew(int xCrew)
	{
		if(xCrew > 0)
		{
			this.crew = xCrew;
		}
		else
		{
			System.out.println("Invalid Value for Crew");
		}
	}
	//method over ride
	public String toString()
	{
		return super.toString() +
				"\nPassengers: "+this.passengers
		+"\nNumber of Crew: "+this.crew+"";
	}
}
