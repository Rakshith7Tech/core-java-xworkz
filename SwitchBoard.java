class SwitchBoard{
		
    //instance members
    //instance variables

    String brandName;
    int noOfSwitches;
    String type;
    String color;
    double price;   
	
	public SwitchBoard(String bN, int nS, String tp, String cl, double pr){
		//initialize instance variables
		//Left side is instance variables and Right side is parameters
		// if left & right are same then use this.brandName=brandName; keyword
		brandName=bN;
		noOfSwitches=nS;
		type=tp;
		color=cl;
		price=pr;
        System.out.println("Switch board constructor is invoked");
        
    }




    // instance method
    public void provideElectricity(){
        System.out.println("Electricity is provided");
    }	
}