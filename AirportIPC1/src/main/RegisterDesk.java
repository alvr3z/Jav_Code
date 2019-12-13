package main;

public class RegisterDesk {
	
	
	private String client;  //Id of the Passenger 
	private boolean state; //State of the Desk
	private int docs; //Quantity of Docs per Passanger
	private int leftTurns; //Turns left of the Passenger
	
	public RegisterDesk() {
		setClient(client);
		//setState();
		setDocs(docs);
		setLeftTurns(leftTurns);

	}
	public String getClient() {
		return client;
	}

	public void setClient(String client2) {
		this.client = client2;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getDocs() {
		return docs;
	}

	public void setDocs(int docs) {
		this.docs = docs;
	}

	public int getLeftTurns() {
		return leftTurns;
	}

	public void setLeftTurns(int leftTurns) {
		this.leftTurns = leftTurns;
	}
	@Override
	public String toString() {
		return "RegisterDesk [client=" + client + ", state=" + state + ", docs=" + docs + ", leftTurns=" + leftTurns
				+ "]";
	}
	
	


}
