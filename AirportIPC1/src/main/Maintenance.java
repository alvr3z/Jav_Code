package main;

public class Maintenance {

	private int stations; // Quantity of Maintenance Stations
	private int aircraftCheck; // Number of Aircraft checking
	private boolean state; // State of Desk
	private static int leftTurns; // Left turns for the Aircraft
	
	//Constructor Method
	public Maintenance( int aircraftCheck, boolean State, int leftTurns) {
		//setStations();
		setAircraftCheck(aircraftCheck);
		setState(State);
		setLeftTurns(leftTurns);
	}
	//Gets & Sets 
	public int getStations() {
		return stations;
	}

	public void setStations(int stations) {
		this.stations = stations;
	}

	public int getAircraftCheck() {
		return aircraftCheck;
	}

	public void setAircraftCheck(int aircraftCheck) {
		this.aircraftCheck = aircraftCheck;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public static int getLeftTurns() {
		return leftTurns;
	}

	public void setLeftTurns(int leftTurns) {
		Maintenance.leftTurns = leftTurns;
	}
	@Override
	public String toString() {
		return "Maintenance [stations=" + stations + ", aircraftCheck=" + aircraftCheck + ", state=" + state + "]";
	}
	
	

}
