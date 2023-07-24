class ParleFactory{
	static String biscuitName="Parle-G";
	String quantity;
	double price;
	int noOfBiscuits;
public ParleFactory(String quantity,double price,int noOfBiscuits){
	// this.biscuitName=biscuitName;
	this.quantity=quantity;
	this.price=price;
	this.noOfBiscuits=noOfBiscuits;
}
public void produceBiscuits(){
	System.out.println("Producing Biscuits in huge numbers");
}
}
// ParleFactory factory = new ParleFactory();
// factory.quantity="50gm";
// factory.price=20.00;
// factory.noOfBiscuits=10;
// }