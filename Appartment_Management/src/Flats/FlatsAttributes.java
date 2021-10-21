package Flats;

public class FlatsAttributes {
	
	private int flatId;
	private String flateBlockName;
	private int noOfMembers;
	
	public int getFlatId() {
		return flatId;
	}
	public String getFlateBlockName() {
		return flateBlockName;
	}
	public int getNoOfMembers() {
		return noOfMembers;
	}
	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}
	public FlatsAttributes(int a, String b, int c ){
		this.flatId = a;
		this.flateBlockName = b;
		this.noOfMembers = c;
	}
	public void displayFlatDetails(){	
		
		System.out.print("Flat Details:--> ");
		System.out.print("Flat No.: " + this.flatId+" \\ ");
		System.out.print(this.flateBlockName + "-Block");
		System.out.println(" \\ Living Memebers: " + this.noOfMembers);	
	}
}
