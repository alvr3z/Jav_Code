package main;

public class Luggage {
	
	
	private int lugNumber;
	private String lugId;
	boolean flag;
	public Luggage() {
		setId(lugId);
		setlugNumber(lugNumber);
	}
	public Luggage(boolean flag) {
		lugId = "";
		lugNumber = 0;
		this.flag = flag;
	}
	public String getId() {
		return lugId;
	}

	public void setId(String lugId) {
		this.lugId = lugId;
	}
	
	public int getlugNumber() {
		return lugNumber;
	}
	public void setlugNumber(int lugNumber) {
		this.lugNumber = lugNumber;
	}
	


	@Override
	public String toString() {
		return "Lug Number:\t " + lugNumber + "\nLugId:\t" + lugId;
	}
	

}
