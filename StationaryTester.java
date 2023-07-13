class StationaryTester{
	public static void main(String st[]){
	//create, save, add
	Stationary.addStationaryItems("Books");
	Stationary.addStationaryItems("Pencil");
	Stationary.addStationaryItems("Pen");
	Stationary.addStationaryItems("Chart");
	Stationary.addStationaryItems("Copy");
	Stationary.addStationaryItems("Sharpner");
	Stationary.addStationaryItems("Ruler");
	Stationary.addStationaryItems("Rubber");
	Stationary.getAllstationaryItem();
	
	//read, get, fetch
	// Stationary.getAllStationaryItems();
	//update, edit
	// Stationary.editStationaryItemName();
	// Stationary.getAllStationaryItems();
	//Stationary.getAllStationaryItem();
	Stationary.updateItemName("Rubber","Eraser");
	Stationary.getAllstationaryItem();
	
	Stationary.deleteStationaryItem("chart");
	Stationary.getAllStationaryItemPostDeletetion();
	String item=Stationary.searchStationaryItemByName("Books");
	String item1=Stationary.searchStationaryItemByName("Sharpner");
	System.out.println("The searched item is :"+item);
	System.out.println("The searched item is :"+item1);
	}
}