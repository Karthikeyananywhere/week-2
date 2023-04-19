package project1;

public class Yamaha {
	private String bikeName;
	
	private Double bikePrice;
	
	private Double bikeCc;
	
	private String colour;

	public Yamaha(String bikeName, Double bikePrice, Double bikeCc, String colour) {
		super();
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		this.bikeCc = bikeCc;
		this.colour = colour;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public Double getBikePrice() {
		return bikePrice;
	}

	public void setBikePrice(Double bikePrice) {
		this.bikePrice = bikePrice;
	}

	public Double getBikeCc() {
		return bikeCc;
	}

	public void setBikeCc(Double bikeCc) {
		this.bikeCc = bikeCc;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Yamaha [bikeName=" + bikeName + ", bikePrice=" + bikePrice + ", bikeCc=" + bikeCc + ", colour=" + colour
				+ "]";
	}


	
	
	

}
