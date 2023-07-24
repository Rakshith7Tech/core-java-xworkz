class Aeroplane{
	String name;
	int noOfSeats;
	public Aeroplane(){
		// this();
		Aeroplane aeroplane = new Aeroplane();
		System.out.println("Start of flow");
		aeroplane.name="Indigo";
		aeroplane.noOfSeats=180;
		System.out.println("End of flow");
	}
	// public static void createInstance(){
		// Aeroplane aeroplane = new Aeroplane("SpiceJet",200);
		// System.out.println(aeroplane.name+"\n"+aeroplane.noOfSeats);
	// }
}