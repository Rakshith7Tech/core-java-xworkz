class ChaiPoint{
	// static String location="Koramangala";
	// static String tea="Masala Tea";
	// static String tea1="Green Tea";
	// static String tea2="Lemon Tea";
	// static String tea3="Ginger Tea";
	// static String tea4="Elaichi Tea";
	// static String tea5="Jasmine Tea";
	// static String tea6="Rose Tea";
	// static String tea7="Herbal Tea";
	// static String tea8="Tulsi Tea";
	// static String tea9="Black Tea";
	// static String tea10="White Tea";
	// static String tea11="Chocolate Tea";
	// static String tea12="Cardamom Tea";
	// static String chaiAvailable[]={tea,tea1,tea2,tea3,tea4,tea5,tea6,tea7,tea8,tea9,tea10,tea11,tea12};
	static String chaiAvailable[]={null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addChai(String chai){
		boolean isAdded=false;
		if(chai!=null){
			chaiAvailable[index]=chai;
			index++;
			isAdded=true;
			}else{
				System.out.println("Cannot add chai, as it is a null value");
			}
			return isAdded;
		}
	
	
	public static void getAllChaiAvailable(){
		System.out.println("Invoking getAllChaiAvailable");
		
		for(int chai=0; chai<chaiAvailable.length; chai++){
			String reference=chaiAvailable[chai];
			System.out.println(reference);
		}
		System.out.println("End of getAllChaiAvailable");
	}
	}
