package main;

import java.util.Random;
import java.util.UUID;

public class Passenger {

	private  String id;
	private  int lug, doc, turn;
	boolean flag;

	String uniqueID = UUID.randomUUID().toString();
	
	Random Ran = new Random();
	int randomLug = Ran.nextInt(4) + 1;
	int randomDoc = Ran.nextInt(10) + 1;
	int randomTurn = Ran.nextInt(3) + 1;
	
	public Passenger(boolean flag) {
		this.id = "";
		this.lug = 0;
		this.doc = 0;
		this.turn = 0;
		this.flag = flag;
	}
	
	public Passenger() {
		setId();
		setLug();
		setDoc();
		setTurn();
	}
	
	public String getId() {
		return id;
	}

	public void setId() {
		String id = uniqueID;
		this.id = id;
	}

	public int getLug() {
		return lug;
	}

	public void setLug() {
		int lug = randomLug;
		if (lug > 0 && lug < 5) {
			this.lug = lug;
		} else {
			System.out.println("OCCURRIO UN ERROR DURANTE EL PROCESO LUG");
		}

	}

	public int getDoc() {
		return doc;
	}

	public void setDoc() {
		int doc = randomDoc;
		if (doc > 0 && doc < 11) {
			this.doc = doc;
		} else {
			System.out.println("OCCURRIO UN ERROR DURANTE EL PROCESO DOC");
		}
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn() {
		int turn = randomTurn;
		if (turn > 0 && turn < 4) {
			this.turn = turn;
			System.out.println(turn);
		} else {
			System.out.println("OCCURRIO UN ERROR DURANTE EL PROCESO TURNO");
		}
	}
	

	@Override
	public String toString() {
		return "Passenger: " + id + "\nEQUIPAJE: \t" + lug + "\nDOCUMENTOS: \t" + doc + "\nTURNO: \t\t" + turn;
	}

}
