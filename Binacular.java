class Binacular{
	String typeOfLens;
	String brandName;
	double price;
	
	public Binacular(){
		System.out.println("Binacular default Constructor is invoked - no arg const");
	}
	public Binacular(String typeOfLens, String brandName){
		//Constructor Chaining
		/*this method*/ this(10000.00);
		System.out.println("Binacular Constructor is invoked - 2 arg const");
		this.typeOfLens=typeOfLens;
		this.brandName=brandName;
		// System.out.println("Binacular Constructor is invoked - 2 arg const");
	}
	public Binacular(double price){
		this();
		System.out.println("Binacular Constructor is invoked - 1 arg const");
		// this("Convex","Canon");
		this.price=price;
	}
}