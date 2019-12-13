package main;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	int counter = 0;
	int counterAircrafts = 0;
	int counterPassenger = 0;
	int counterDocs = 0;
	int counterTurnsP = 0;
	int counterTurnsA = 0;
	// Arrays for Aircrafts and Maintenance Stations
	Aircraft A[]; // Array to storage Aircrafts
	Aircraft SD[][]; // ARRAY FOR SERRVICE STATIONS DESKS
	Passenger Desks[][];
	Luggage L[];
	
	private int Turns;
	private int Aircrafts;
	private int registDesks;
	private int registLineSize;
	private int serviceStations;
	private int serviceLineSize;

	// ARRAY FOR THE DESKTOP LETTERS
	char arrayLetters[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	// LABELS
	JLabel LbTurn = new JLabel("Turnos para finalizar Simulacion");
	JLabel LbAircraft = new JLabel("Cantidad de aviones");
	JLabel LbRegisterDesk = new JLabel("Cantidad de Escritorios de Registro");
	JLabel LbRegisterLineSize = new JLabel("Dimension Fila de Registro");
	JLabel LbServiceStation = new JLabel("Cantidad de estaciones de servicio");
	JLabel LbServiceLineSize = new JLabel("Dimension Fila de servicios");
	// TEXT FIELDS
	static JTextField TxtTurn = new JTextField("");
	static JTextField TxtAircraft = new JTextField("");
	static JTextField TxtRegisterDesk = new JTextField("");
	static JTextField TxtRegisterLineSize = new JTextField("");
	static JTextField TxtServiceStation = new JTextField("");
	static JTextField TxtServiceLineSize = new JTextField("");
	// TEXT AREA
	static JTextArea TxtArea = new JTextArea();
	static JScrollPane sp = new JScrollPane(TxtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	// BUTTONS
	JButton BtnSet = new JButton("SET");
	JButton BtnNext = new JButton(">>>");
	JButton BtnClear = new JButton("RESET");

	public MainFrame() {
		createInterface();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getTurns() {
		return Turns;
	}

	public void setTurns(int turns) {
		Turns = turns;
	}

	public int getAircrafts() {
		return Aircrafts;
	}

	public void setAircrafts(int aircrafts) {
		Aircrafts = aircrafts;
	}

	public int getRegistDesks() {
		return registDesks;
	}

	public void setRegistDesks(int registDesks) {
		this.registDesks = registDesks;
	}

	public int getRegistLineSize() {
		return registLineSize;
	}

	public void setRegistLineSize(int registLineSize) {
		this.registLineSize = registLineSize;
	}

	public int getServiceStations() {
		return serviceStations;
	}

	public void setServiceStations(int serviceStations) {
		this.serviceStations = serviceStations;
	}

	public int getServiceLineSize() {
		return serviceLineSize;
	}

	public void setServiceLineSize(int serviceLineSize) {
		this.serviceLineSize = serviceLineSize;
	}

	public void createInterface() {
		// CONTAINER
		Container Ctainer = getContentPane();
		Ctainer.setLayout(null);

		// FRAME CONFIG
		this.setSize(900, 900); // Setting a size to the frame
		this.setTitle("Airport IPC"); // Setting a title for the frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Setting the Default option
		this.setResizable(false); // Blocking the Re
		this.setLocationRelativeTo(null); // Centering the Frame

		// LABELS CONFIG
		LbTurn.setBounds(10, 40, 200, 20); // Setting dimension and position of Label
		LbAircraft.setBounds(10, 60, 200, 20);
		LbRegisterDesk.setBounds(10, 80, 200, 20);
		LbRegisterLineSize.setBounds(10, 100, 200, 20);
		LbServiceStation.setBounds(10, 120, 200, 20);
		LbServiceLineSize.setBounds(10, 140, 200, 20);

		// TEXTFIELDS CONFIG
		TxtTurn.setBounds(250, 40, 50, 15); // Setting dimension and position of Label
		TxtAircraft.setBounds(250, 60, 50, 15);
		TxtRegisterDesk.setBounds(250, 80, 50, 15);
		TxtRegisterLineSize.setBounds(250, 100, 50, 15);
		TxtServiceStation.setBounds(250, 120, 50, 15);
		TxtServiceLineSize.setBounds(250, 140, 50, 15);

		// TXTAREA CONFIG
		TxtArea.setBounds(350, 20, 500, 700);
		TxtArea.setEditable(false);
		// BUTTON CONFIG
		BtnSet.setBounds(10, 180, 100, 20);
		BtnNext.setBounds(200, 180, 100, 20);
		BtnClear.setBounds(10, 200, 100, 20);
		// SHOW LABELS
		this.add(LbTurn);
		this.add(LbAircraft);
		this.add(LbRegisterDesk);
		this.add(LbRegisterLineSize);
		this.add(LbServiceStation);
		this.add(LbServiceLineSize);
		// SHOW TEXTFIELDS
		this.add(TxtTurn);
		this.add(TxtAircraft);
		this.add(TxtRegisterDesk);
		this.add(TxtRegisterLineSize);
		this.add(TxtServiceStation);
		this.add(TxtServiceLineSize);
		// SHOW TEXTAREA

		this.add(TxtArea);
		this.add(sp);
		// SHOW BUTTONs
		this.add(BtnSet);
		this.add(BtnNext);
		this.add(BtnClear);

		BtnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// SAVE THE VALS OF THE TEXTFIELD
					int Turns = Integer.parseInt(TxtTurn.getText());
					int Aircrafts = Integer.parseInt(TxtAircraft.getText());
					int registDesks = Integer.parseInt(TxtRegisterDesk.getText());
					int registLineSize = Integer.parseInt(TxtRegisterLineSize.getText());
					int serviceStations = Integer.parseInt(TxtServiceStation.getText());
					int serviceLineSize = Integer.parseInt(TxtServiceLineSize.getText());

					setTurns(Turns); // Setting the Turns
					setAircrafts(Aircrafts);// Setting quantity of Aircrafts
					setRegistDesks(registDesks);// Setting the quantity of Desks
					setRegistLineSize(registLineSize);// Setting the Size of the line in wait register
					setServiceStations(serviceStations);// Setting the quantity of the Service Stations
					setServiceLineSize(serviceLineSize);// Setting the Size of the line in wait for service

					createDesks(registLineSize, registDesks);// Creating the Register Desks
					createStations(serviceLineSize, serviceStations);// Creating the Service Stations

				} catch (NumberFormatException S) {
					TxtArea.setText("INGRESE SOLAMENTE NUMEROS");
				}
				showInfo();
				showDesks();
				showStations();
				showLuggage();

			}
		});
		BtnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// THIS BUTTONS GIVES THE SEQUENCE OF THE PROGRAM
				
				if (counter < getTurns() && counterAircrafts < getAircrafts()) {
					if(counterTurnsP < Desks[0][counter].getTurn()) {
						counterTurnsP++;
					}else {
					counter++;
					counterAircrafts++;
					counterPassenger++;
					counterDocs++;
					counterTurnsA++ ;
					createAircrafts(counterAircrafts);
					System.out.println("***********Turn: " + counter + "*****************");
					showInfo();
					showDesks();
					showStations();
					showLuggage();
					}
				} else {
					TxtArea.append("\n\tTURNOS FINALIZADOS\n");
				}

			}
		});
		BtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				counter = 0;
				counterAircrafts = 0;
				counterPassenger = 0;
				counterDocs = 0;
				counterTurnsA = 0 ;
			}
		});

	}

	// CREATE THE ARICRAFTS
	public void createAircrafts(int aircrafts) {
		System.out.println("CREATING AIRCRAFT");
		for (int i = 0; i < aircrafts; i++) {
			Aircraft A = new Aircraft();
			System.out.println("AIRCRAFT PASSENGERS :"+A.getPassengers());
			System.out.println("AIRCRAFT SIZE : "+A.getAircraftSize());
			System.out.println("AIRCRAFT TUNRS: "+A.getDeabordingTurns());
			System.out.println("AIRCRAFT MAINTENANCETURNS :"+A.getMaintenanceTurns());
			System.out.println("");
			addAircrafts(A);
			createPassengers(A.getPassengers());
			
		}

	}

	// CREATE THE PASSENGERS
	public void createPassengers(int nPassengers) {
		System.out.println("CREATING PASSENGER");
		for (int i = 0; i < nPassengers; i++) {
			Passenger P = new Passenger();
			System.out.println("PASSENGER ID: "+ P.getId());
			System.out.println("PASSENGER Lug: "+ P.getLug());
			System.out.println("PASSENGER DOCS: "+ P.getDoc());
			System.out.println("PASSENGER TURNS: "+ P.getTurn());
			System.out.println("");
			addPassengers(P);
			createLuggage(P.getLug());
		}

	}
	// Add Passengers
	public void addPassengers(Passenger P) { // Add the Passengers to the Register Desks
		
		for(int y = 0; y< getRegistLineSize(); y++) {
			for(int x = 0 ; x< getRegistDesks();x++) {
				if(!(Desks[y][x].flag)) {
					Desks[y][x] = P;
					System.out.println(Desks[x][y]+ " ");
					//return;
				}
			}
			System.out.println("");
		}
	}

	public void createLuggage(int Lug) {
		System.out.println("CREATING LUGGAGE");
		L= new Luggage[300];
		for (int i = 0; i < Lug ; i++) {
			L[i]= new Luggage(false);
		}
	}

	public void showInfo() {
		String title = ("\t AIRPORT IPC \n\n");

		TxtArea.setText(title);
		TxtArea.append("*******Turno" + getCounter() + "******\n");
		TxtArea.append("Arribo Avion : " + counterAircrafts + "\n");
		TxtArea.append("Avion Desabordando: " + counterAircrafts + " \n");
	}

	public void showDesks() {
		String separationLine = (" ________________________________________ \n");
		TxtArea.append("-----Escritorios de Registro-----\n");
		for (int i = 0; i < getRegistDesks(); i++) {
			TxtArea.append("Escritorio " + arrayLetters[i] + " Libre \n");
			TxtArea.append("\tPasajero Atendido: " + Desks[0][i].getId() + "\n");
			TxtArea.append("\tTurnos Restantes: " + (Desks[0][i].getTurn()) + "\n");
			TxtArea.append("\tCantidad de Documentos: " + (Desks[0][i].getDoc()) + "\n");
		}
		TxtArea.append(separationLine);
	}

	public void showStations() {
		TxtArea.append("*******Estaciones de Servicio*******\n");
		for (int i = 0; i < getServiceStations(); i++) {
			TxtArea.append("Estacion " + (i + 1) + " Libre \n");
			TxtArea.append("\tAvion en Matenimiento: " + (SD[0][i].getAircrafts()) + "\n");
			TxtArea.append("\tTurnos Restantes: " + (SD[0][i].getMaintenanceTurns()-counterTurnsA) + "\n");
		}
		TxtArea.append(" ________________________________________ \n");

	}

	public void showLuggage() {
		TxtArea.append("Cantidad de maletas Actualmente en Sistema" + "*");
		TxtArea.append("Estado de las maletas Anterior\n");
		// Unsorted Luggage
		// TxtArea.append(L[0].getId());
		TxtArea.append("Estado de las maletas Ordenadas\n");
		// Sorted Luggage
		TxtArea.append("Estado de las maletas Ordenadas\n");
		TxtArea.append("*******Fin Turno " + getCounter() + "******\n");
	}

	// Create Aircraft Service Stations
	public void createStations(int getServiceLineSize, int getServiceStations) {

		SD = new Aircraft[getServiceLineSize][getServiceStations]; // ROW X COL

		for (int y = 0; y < getServiceLineSize; y++) {
			for (int x = 0; x < getServiceStations; x++) {
				SD[y][x] = new Aircraft(false);
			}
			System.out.println("");
		}

	}

	public void addAircrafts(Aircraft A) { // Add the Aircrafts to the Service Stations
		
		for (int y = 0; y < getServiceLineSize(); y++) {
			for (int x = 0; x < getServiceStations(); x++) {
				if (!(SD[y][x].flag)) {
					SD[y][x] = A;
					return;
				}
			}
			System.out.println("");
		}
	}

	// Create Register Desks
	public void createDesks(int RegistLineSize, int RegistDesks) {

		Desks = new Passenger[RegistLineSize][RegistDesks]; // ROW X COL

		for (int y = 0; y < getRegistLineSize(); y++) {
			for (int x = 0; x < getRegistDesks(); x++) {
				Desks[y][x] = new Passenger(false);
			}
			System.out.println("");
		}
	}

	

	public void extractPassenger() {
		Passenger Temp[][] = new Passenger[getRegistLineSize()][getRegistDesks()];

		for (int y = 0; y < getRegistLineSize(); y++) {
			for (int x = 0; x < getRegistDesks(); x++) {
				if (Desks[y][x].getTurn() != 0) {
					Temp[y][x] = Desks[y][x];
				}
			}
			System.out.println("");
		}

	}

	public void BubbleSort() {
		
	}

	public static void clear() { // Restart System
		TxtArea.setText(null);
		TxtTurn.setText(null);
		TxtAircraft.setText(null);
		TxtRegisterDesk.setText(null);
		TxtRegisterLineSize.setText(null);
		TxtServiceStation.setText(null);
		TxtServiceLineSize.setText(null);
	}

}
