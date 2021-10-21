package Appartments;

public class AppartmentAttributes {
	
	private int appartmentId;
	private String appartmentName;

	public int getAppartmentId() {
		return appartmentId;
	}
	public String getAppartmentName() {
		return appartmentName;
	}
	
	public AppartmentAttributes(int x, String y){
		this.appartmentId = x;
		this.appartmentName = y;
	}
	public void displayAppartmentDetails(){
		System.out.print("<---Appertment ID: " + appartmentId);
		System.out.println("  \\  Appertment Name: " + appartmentName + "--->");
	}

	

}
