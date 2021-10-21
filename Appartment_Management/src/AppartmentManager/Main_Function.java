package AppartmentManager;
import java.util.*;
import Appartments.AppartmentAttributes;
import Flats.FlatsAttributes;
import AppartmentManager.Menu;

public class Main_Function {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<AppartmentAttributes> appList = new ArrayList<AppartmentAttributes>();
		ArrayList<ArrayList<FlatsAttributes>> flatList = new ArrayList<ArrayList<FlatsAttributes>>();
		ArrayList<FlatsAttributes> flatListInner = new ArrayList<FlatsAttributes>();

		System.out.println("!! Welcom To Appertment Management Sysytem !!");
		System.out.println("---------------------------------------------------------------------------------------");
		
		loop : while(true){ 
			Menu dis = new Menu();
			dis.displayMenu();
			System.out.println("");
			System.out.print("Which You Want To Choose Enter The No.: ");
			int menuButton = sc.nextInt();
			
			switch(menuButton){
				case 1:
					System.out.println("-------------------------------------------------------------------");
					System.out.println("<-----Enter The Details------->");
					System.out.println("-------------------------------------------------------------------");
					System.out.print("Enter The No. Of Total Appertment Entries:- ");
					int size = sc.nextInt();
					for(int i=0; i<size; i++){
						System.out.println("----------------------------------------------");
						System.out.print("Enter "+ (1+i) +" Appertment ID:- ");
						int appId = sc.nextInt();
						System.out.print("Enter "+ (1+i) +" Appertment Name:- ");
						String appName = sc.next();
						System.out.println("----------------------------------------------------");
						appList.add(new AppartmentAttributes(appId, appName));
						System.out.print("Enter The No. Of Flat Entries In This Appertment:- ");
						int size2= sc.nextInt();
						System.out.println("-----------------------------------------------------");
						flatList.add(flatListInner);
						flatListInner = new ArrayList<FlatsAttributes>(flatListInner);
						for(int j=0; j<size2; j++){
							System.out.print("Enter "+ (1+j) +" Flat ID:- ");
							int flid = sc.nextInt();
							System.out.print("Enter "+ (1+j) +" Flat Block-Name:- ");
							String flblock = sc.next();
							System.out.print("Enter "+ (1+j) +" Flat Members:- ");
							int flmem = sc.nextInt();
							System.out.println("-------------------------------------------------------");
							flatList.get(i).add(new FlatsAttributes( flid, flblock, flmem ));
						}
					}
					System.out.println("");
					System.out.print("!! Do You Want To Enter The Above Data(Yes/No):: ");
					String YesOrNo = sc.next();
					String y = "yes";
					String N = "no";
					if(YesOrNo.equalsIgnoreCase(y)){
						System.out.println("<-------All Appartment Details------->");
						for (int i = 0; i < flatList.size(); i++) {
							System.out.println("---------------------------------------------------------------");
							appList.get(i).displayAppartmentDetails();
							System.out.println("---------------------------------------------------------------");
				            for (int j = 0; j < flatList.get(i).size(); j++) {
				            	flatList.get(i).get(j).displayFlatDetails();
				            }
						}	
					}else if(YesOrNo.equalsIgnoreCase(N)){
						System.out.println("!! Than You For Visting !!");
					}else{
						System.out.println("!! Invalid Entry!!");
					}
					System.out.println("---------------------------------------------------------------");
					break;
					
				case 2:
					System.out.println("---------------------------------------------------------------");
					System.out.println("To Get All Flats Accroding to Appartments");
					System.out.println("---------------------------------------------------------------");
					System.out.print("Enter the Appartment ID: ");  
					int appId = sc.nextInt();	
					System.out.println("---------------------------------------------------------------");
					for (int i=0; i<flatList.size(); i++) {
						if(appId == appList.get(i).getAppartmentId() ){
							
//							for (int j = 0; j < flatList.get(i).size(); j++) {
//					      	flatList.get(i).get(j).displayFlatDetails();
//					        }
//							System.out.println("");
							
							System.out.print("Enter Block-Name to Get Flats: ");
							String bNo = sc.next();
							System.out.println("---------------------------------------------------------------");
							for (int j = 0; j < flatList.get(i).size(); j++){
								if(bNo.equalsIgnoreCase(flatList.get(i).get(j).getFlateBlockName())){
									System.out.println("Flat No.: " + flatList.get(i).get(j).getFlatId())	;			
									}							
								}
							}
						}
					System.out.println("---------------------------------------------------------------");
					break;
					
				case 3:
					System.out.println("---------------------------------------------------------------");
					System.out.println("Update The Flat Members Based On Id");
					System.out.println("---------------------------------------------------------------");
					System.out.print("Enter the Appartment ID: ");  
					int appId1 = sc.nextInt();	
					System.out.println("---------------------------------------------------------------");
					for (int i=0; i<flatList.size(); i++) {
						if(appId1 == appList.get(i).getAppartmentId() ){
							System.out.print("Updating Members Enter The Flat ID: ");
							int fNo = sc.nextInt();
							System.out.println("---------------------------------------------------------------");
							for (int j = 0; j < flatList.get(i).size(); j++){
								if(fNo == (flatList.get(i).get(j).getFlatId())){
									System.out.println("Flat Member Is: " +flatList.get(i).get(j).getNoOfMembers());
									System.out.println("");
									System.out.print("ENTER NEW MEMBERS: ");
									int newMember = sc.nextInt();
									System.out.println("");
									flatList.get(i).get(j).setNoOfMembers(newMember);
									System.out.print("->UPDATING");
									System.out.print("->New Flat Member Is: " +flatList.get(i).get(j).getNoOfMembers());
									System.out.println("");
									System.out.println("");
									System.out.println("Updated Flat--->");
									System.out.println("---------------------------------------------------------------");
									flatList.get(i).get(j).displayFlatDetails();
								}
							}
						}
					}
					System.out.println("---------------------------------------------------------------");
					break;
				case 4:
					System.out.println("---------------------------------------------------------------");
					System.out.println("To Get All Details Of A Flat");
					System.out.println("---------------------------------------------------------------");
					System.out.print("Enter The Appartment ID: ");
					int appId2 = sc.nextInt();
					System.out.println("---------------------------------------------------------------");
					for (int i = 0; i < flatList.size(); i++) {
						if(appId2 == appList.get(i).getAppartmentId() ){
							System.out.print("Enter The Flat ID: ");
							int fNo1 = sc.nextInt();
				            for (int j = 0; j < flatList.get(i).size(); j++) {
								if(fNo1 == (flatList.get(i).get(j).getFlatId())){
									System.out.println("---------------------------------------------------------------");
									flatList.get(i).get(j).displayFlatDetails();
								}
				            }
						}
					}
					System.out.println("---------------------------------------------------------------");
					break;
				case 5:		                	
					System.out.println("!!!! Thank You For Visting. !!!!");
					break loop;
					default:
						System.out.println("Invalid choice!! Please Enter a Valid choice. !!! \n");	
			}
		}
		
	}
}


