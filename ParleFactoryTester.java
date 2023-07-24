class ParleFactoryTester{
	public static void main(String machine[]){
		ParleFactory factory=new ParleFactory("20gm",10,12);
		System.out.println(factory.biscuitName);
		System.out.println(factory.biscuitName+"\n"+factory.quantity+"\n"+factory.price+"\n"+factory.noOfBiscuits);
	}
}