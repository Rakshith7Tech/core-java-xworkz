class RunningShoes{
	static String innerMaterial="Leather";
	static String outerMaterial="Leather";
	static int price=499;
	static String idealFor="Boys";
	static String occasion="Function";
	static String closure="No-lace";
	public static void main(String rs[]){
		System.out.println("Shoe innerMaterial "+ innerMaterial);
		System.out.println("Shoe outerMaterial "+ outerMaterial);
		System.out.println("Shoe price "+ price);
		System.out.println("Shoe idealFor "+ idealFor);
		System.out.println("Shoe occasion "+ occasion);
		System.out.println("Shoe closure "+ closure);
		
		innerMaterial="Canvas";
		outerMaterial="Canvas";
		price=199;
		idealFor="Men";
		occasion="Sports";
		closure="Lace-ups";
		System.out.println("Shoe innerMaterial "+ innerMaterial);
		System.out.println("Shoe outerMaterial "+ outerMaterial);
		System.out.println("Shoe price "+ price);
		System.out.println("Shoe idealFor "+ idealFor);
		System.out.println("Shoe occasion "+ occasion);
		System.out.println("Shoe closure "+ closure);
	}
	
}