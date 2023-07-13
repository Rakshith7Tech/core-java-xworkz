class GardenTester{
public static void main(String flower[]){
//Garden.getfloweName();
Garden.addFlower("Rose");
Garden.addFlower("Jasmine");
Garden.addFlower("Lotus");
Garden.addFlower("Marigold");
Garden.addFlower("Sunflower");
Garden.getAllFlower();
boolean value=Garden.updateFlowerName("Rose","Roses");
boolean value1=Garden.updateFlowerName("Jasmine","lotus");
boolean value2=Garden.updateFlowerName("Lotus","jasmine");
boolean value3=Garden.updateFlowerName("Marigold","Marigoldes");
boolean value4=Garden.updateFlowerName("Sunflower","Moonlily");
Garden.getAllFlower();
Garden.deleteFlowerName("Moonlily");
Garden.deleteFlowerName("jasmine");
Garden.getAllFlowerNamePostDeletetion();
}
}