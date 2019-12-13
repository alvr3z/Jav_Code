package main;

public class Main {

	public static void main(String[] args) {
		
		MainFrame AirportFrame = new MainFrame();
		AirportFrame.setVisible(true);
	
		if((AirportFrame.getCounter() > AirportFrame.getTurns()) || (AirportFrame.getTurns() > AirportFrame.getAircrafts())) {
			MainFrame.clear();
			MainFrame.TxtArea.setText("SIMULACION FINALIZADA");
	}
	}

}
