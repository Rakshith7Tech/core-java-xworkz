class BinacularTester{
	public static void main(String bin[]){
		Binacular binacular=new Binacular("Convex","Canon");
		binacular.typeOfLens="Convex";
		binacular.brandName="Samsung";
		binacular.price=10000.00;
		System.out.println(binacular.typeOfLens+"\n"+binacular.brandName+"\n"+binacular+"\n"+binacular.price);
	}
}