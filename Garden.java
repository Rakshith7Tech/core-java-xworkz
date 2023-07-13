class Garden{
static String flowerNames[]={null,null,null,null,null};
static int index;
public static boolean addFlower(String flower ){
boolean isAdded = false;
if(flower!= null){
flowerNames[index] = flower;
index++;
isAdded = true;
}else{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllFlower(){
for(int flower=0;flower<flowerNames.length;flower++){
String ref=flowerNames[flower];
System.out.println(ref);
}
}
public static boolean updateFlowerName(String existingFlowerName,String updatedFlowerName)
{
	boolean isUpdated=false;
	for(int j=0;j<flowerNames.length;j++)
	{
		if(flowerNames[j].equals(existingFlowerName))
		{
		flowerNames[j]=updatedFlowerName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static boolean deleteFlowerName(String deletedFlowerName){
        System.out.println("invoking deleteFlowerName");
       
        boolean isDeleted=false;
        int flowerIndex;
        int noofElements=index;

        for(flowerIndex=0; flowerIndex<index;flowerIndex++){
            if(flowerNames[flowerIndex].equals(deletedFlowerName)){
				isDeleted=true;
                break;
            }
        }

        if(flowerIndex<noofElements){
            noofElements=noofElements-1;
        }

        for(int newFlowerIndex=flowerIndex;newFlowerIndex<noofElements;newFlowerIndex++){
            flowerNames[newFlowerIndex]=flowerNames[newFlowerIndex+1];
        }
		index--;
        return isDeleted;

    }
    
    public static void getAllFlowerNamePostDeletetion(){
        for(int flowerIndex=0;flowerIndex<index; flowerIndex++){
            System.out.println(flowerNames[flowerIndex]);
    }
}
}