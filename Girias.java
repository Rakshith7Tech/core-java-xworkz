class Girias{
	static String electronicDevices[]={"Refrigirator","Washing Machine","Television","LED","Grinder","AC","IronBox","Microwave"};
	static double priceOfElectronicDevices[]={50000.00,40000.00,30000.99,100000.99,15000.89,45000.50,0.0,5000.00};
	public static void main(String ed[]){
		System.out.println("Main started");
		System.out.println("List of Electronic Devices are:");
		for(int devices=0; devices<electronicDevices.length; ){
			System.out.println(electronicDevices[devices]);
			devices++;
		}
		System.out.println("List of Electronic Devices are:");
		getElectronicDevices();
		// for(String electronicDevice : electronicDevices){
			// System.out.println(electronicDevice);
		// }
		// for(double priceOfElectronicDevice : priceOfElectronicDevices){
			// System.out.println(priceOfElectronicDevice);
			getPriceOfElectronicDevices();
		// }
		System.out.println("Main ended");
	}
		public static void getElectronicDevices(){
		    System.out.println("Inside getElectronicDevices");
			for(String electronicDevice : electronicDevices){
			System.out.println(electronicDevice);
			}
		}
		public static void getPriceOfElectronicDevices(){
		    System.out.println("Inside getPriceOfElectronicDevices");
			for(double priceOfElectronicDevice : priceOfElectronicDevices){
			System.out.println(priceOfElectronicDevice);
		    }
		}
}