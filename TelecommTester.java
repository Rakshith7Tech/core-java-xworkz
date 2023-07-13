class TelecommTester{
	public static void main(String city[]){
	//Telecomm.getsimName();
	Telecomm.addSim("Airtel");
	Telecomm.addSim("Jio");
	Telecomm.addSim("Vodafone");
	Telecomm.addSim("Idea");
	Telecomm.addSim("BSNL");
	Telecomm.getAllSim();
	boolean value=Telecomm.updateSimName("Airtel","Airtel pvt ltd");
    boolean value1=Telecomm.updateSimName("Jio","Jio infocom limited");
    boolean value2=Telecomm.updateSimName("Vodafone","VODAFONE"); 
    boolean value3=Telecomm.updateSimName("Idea","IDEA");  
    boolean value4=Telecomm.updateSimName("BSNL","bsnl");   
	Telecomm.getAllSim();
	Telecomm.deleteSimName("bsnl");
	Telecomm.deleteSimName("IDEA");
	Telecomm.getAllSimNamePostDeletetion();
	}
}	