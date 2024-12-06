//Adolfo Medina
public class Ship {
	
	//Instance variables
	private String shipName;
	private String date;
	//default constructor
	public Ship()
	{
		this.shipName = "unknown";
		this.date = "01/01/1990";
		
	}
	//parameterized constructor
	public Ship(String xShipName, String xDate)
	{
		this.setShipName(xShipName);
		this.setDate(xDate);
	}
	//accesors
	public String getShipName()
	{
		return this.shipName;
	}
	
	public String getDate()
	{
		return this.date;
	}
	//mutators
	public void setShipName(String xShipName)
	{
		this.shipName = xShipName;
	}
	
	public void setDate(String xDate)
	{
	
			this.date = xDate; 
		
	}
	//other method
	public String toString()
	{
		return 
		 "Ship Name: "+this.shipName
		+"\nLaunch DAte: "+this.date;
	}


}
