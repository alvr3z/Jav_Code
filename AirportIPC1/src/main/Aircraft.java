package main;

import java.util.Random;

public class Aircraft {

	Random Ran = new Random();

	int randomSize = Ran.nextInt(3) + 1;

	int randomProb = Ran.nextInt(100) + 1;
	
	int randomPassengers1 = Ran.nextInt(6) + 5; // Small
	int randomPassengers2 = Ran.nextInt(11) + 15; // Medium
	int randomPassengers3 = Ran.nextInt(11) + 30; // Large
	
	int randomMaintenanceTurn1 = Ran.nextInt(3) + 1; // Small
	int randomMaintenanceTurn2 = Ran.nextInt(3) + 2; // Medium
	int randomMaintenanceTurn3 = Ran.nextInt(4) + 3; // Large

	private int Aircrafts;
	private int AircraftSize; // Size 1 2 3
	private int Passengers; // Depends of the Aircraft Size
	private int DeabordingTurns; // Turn of the Aircraft
	private int MaintenanceTurns; // Service Turns
	boolean flag;

	// AIRCRAFT CONSTRUCTOR
	public Aircraft() {
		setAircraftSize();
		setPassengers();
		setDeabordingTurns();
		setMaintenanceTurns();
	}

	public Aircraft(boolean flag) {
		this.Aircrafts = 0;
		this.AircraftSize = 0; // Size 1 2 3
		this.Passengers = 0; // Depends of the Aircraft Size
		this.DeabordingTurns = 0; // Turn of the Aircraft
		this.MaintenanceTurns = 0; // Service Turns
		this.flag = flag;
	}

	// GETTERS AND SETTERS
	public int getAircrafts() {
		return Aircrafts;
	}

	public void setAircrafts(int Aircrafts) {
		this.Aircrafts = Aircrafts;
	}

	public int getAircraftSize() {
		return AircraftSize;
	}

	public void setAircraftSize() {
		if(randomSize > 0 && randomSize < 3) {
			this.AircraftSize = randomSize;
		} else {
			System.out.println("OCCURRIO UN ERROR DURANTE EL PROCESO SIZE");
		}
	}

	public int getPassengers() {
		return Passengers;
	}

	public void setPassengers() {
		if (AircraftSize == 1) {
			if (randomPassengers1 > 4 && randomPassengers1 < 11) {
				this.Passengers = randomPassengers1;
			}
		} else if (AircraftSize == 2) {
			if (randomPassengers2 > 14 && randomPassengers2 < 26) {
				this.Passengers = randomPassengers2;
			}
		} else if (AircraftSize == 3) {
			if (randomPassengers3 > 29 && randomPassengers3 < 41) {
				this.Passengers = randomPassengers3;
			}
		} else {
			System.out.println("OCURRIO UN ERROR DURANTE EL PROCESO PASAJEROS");
		}

	}

	public int getDeabordingTurns() {
		return DeabordingTurns;
	}

	public void setDeabordingTurns() {
		if (AircraftSize == 1) {
			this.DeabordingTurns = 1;
		} else if (AircraftSize == 2) {
			this.DeabordingTurns = 2;
		} else if (AircraftSize == 3) {
			this.DeabordingTurns = 3;
		} else {
			System.out.println("OCURRIO UN ERROR DURANTE EL PROCESO DESABORDAJE");
		}

	}

	public int getMaintenanceTurns() {
		return MaintenanceTurns;
	}

	public void setMaintenanceTurns() {
		if (AircraftSize == 1) {
			if (randomMaintenanceTurn1 > 0 && randomMaintenanceTurn1 < 4) {
				this.MaintenanceTurns = randomMaintenanceTurn1;
			}
		} else if (AircraftSize == 2) {
			if (randomMaintenanceTurn2 > 1 && randomMaintenanceTurn2 < 5) {
				this.MaintenanceTurns = randomMaintenanceTurn2;
			}
		} else if (AircraftSize == 3) {
			if (randomMaintenanceTurn3 > 2 && randomMaintenanceTurn3 < 7) {
				this.MaintenanceTurns = randomMaintenanceTurn3;
			}
		} else {
			System.out.println("OCURRIO UN ERROR DURANTE EL PROCESO MANTENIMIENTO");
		}

	}

}
