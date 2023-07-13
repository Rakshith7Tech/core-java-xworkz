class SuperMarket{
	static String vegatables[]={"Potato", "Carrot", "Beans", "Brinjal", "Onion"};
	static String biscuits[]={"Oreo", "Marie Gold", "Barboun", "Good Day", "Parle-G", "Krack Jack", "Hide and Seek", "Sunfeast", "Sweat and Salt","Jim Jam"};
	static String perfumes[]={"Park Avenue", "Fogg", "WildStone", "Axe", "Villain", "Nivea", "Engage", "Man", "Denver", "Bella Vita"}; 
    static String groceries[]={"Rice Flour", "Finger Millet Flour", "Jowar Flour", "Dal", "Wheat", "Flax Seeds", "Peanuts", "Rajma", "Peas", "Spinach"};
	static String alcohols[]={"Vodka", "Rum", "Whiskey", "Tequila", "Gin", "Brandy", "Scotch", "Bourbon", "Cognac", "Absinthe", "Sake", "Champagne", "Prosecco", "Vermouth", "Sherry", "Port", "Cider", "Beer", "Wine", "Mead", "Margarita", "Martini", "Mojito", "Daiquiri", "Bloody Mary", "Pina Colada", "Cosmopolitan", "Manhattan", "Negroni", "Old Monk"};
	public static void main(String sp[]){
	
	System.out.println("Main started");
	System.out.println("List of Vegatables are:");
	getVegatables();
	// for(String vegatable : vegatables){
			// System.out.println(vegatable);
			// }
	System.out.println(vegatables.length);
	System.out.println("List of Biscuits are:");
	getBiscuits();
	// for(String biscuit : biscuits){
			// System.out.println(biscuit);
			// }
	System.out.println(biscuits.length);
	System.out.println("List of Perfumes are:");
	getPerfumes();
	// for(String perfume : perfumes){
			// System.out.println(perfume);
			// }
	System.out.println(perfumes.length);
	System.out.println("List of Groceries are:");
	getGroceries();
	// for(String grocerie : groceries){
			// System.out.println(grocerie);
			// }
	System.out.println(groceries.length);
	System.out.println("List of Alcohols are:");
	getAlcohols();
	System.out.println("Main ended");
	// for(String alcohol : alcohols){
			// System.out.println(alcohol);
			// }
	System.out.println(alcohols.length);
	}
	public static void getVegatables(){
		System.out.println("Inside getVegatables");
		for(String vegatable : vegatables){
			System.out.println(vegatable);
			}
	}
	public static void getBiscuits(){
		System.out.println("Inside getBiscuits");
		for(String biscuit : biscuits){
			System.out.println(biscuit);
			}
    }
	public static void getPerfumes(){
		System.out.println("Inside getPerfumes");
		for(String perfume : perfumes){
			System.out.println(perfume);
			}
    }
	public static void getGroceries(){
		System.out.println("Inside getGroceries");
		for(String vegatable : vegatables){
			System.out.println(vegatable);
			}
	}
	public static void getAlcohols(){
		System.out.println("Inside getAlcohols");
		for(String alcohol : alcohols){
			System.out.println(alcohol);
			}
	}
}