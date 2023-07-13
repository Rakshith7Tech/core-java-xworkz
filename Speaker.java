class Speaker{
	static String name="JBL";
	static int minVolume;
	static int currentVolume;
	static int maxVolume=10;
	static boolean isConnected;
	public static boolean onOrOff(){
		System.out.println("Invoking onOrOff()");
		System.out.println("Parameter" + 0);
		if(isConnected==false){
			isConnected=true;
			System.out.println("Speaker is Turned On");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Speaker is Turned Off");
		}
		return isConnected;
	}
	public static void increaseVolume(){
		if(isConnected==true){
		if(currentVolume < maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("The currentVolume is "+ currentVolume);
		}
		else{
			System.out.println("Max Volume reached");
		}
		}else{
			System.out.println("HSM... Speaker Connect Maad firstuu");
		}
	}
	public static void decreaseVolume(){
		if(isConnected==true){
			if(currentVolume > minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The currentVolume is "+ currentVolume);
			}else{
				System.out.println("Min Volume reached");
			}
		}else{
			System.out.println("The volume is decreased");
		}
		}
	}

