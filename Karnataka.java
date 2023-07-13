class Karnataka{
static String cityNames[]={null,null,null,null,null,null,null};
static int index;
//add karnataka into cityAvailable
public static boolean addCity(String city){
boolean isAdded = false;
if(index<cityNames.length){
if(city!= null && city.length()>0){
cityNames[index] = city;
index++;
isAdded = true;
}else{
System.out.println("cannot add ");
}
}else{
	System.out.println("Cities are full, cannot add anymore");
}
return isAdded;
}
public static boolean updateCityName(String existingCityName, String updatedCityName){
	boolean isUpdated=false;
			for(int cityIndex=0; cityIndex<cityNames.length; cityIndex++){
				if(cityNames[cityIndex].equals(existingCityName)){
					cityNames[cityIndex]=updatedCityName;
					isUpdated=true;
				}	
			}
			return isUpdated;
		}
		public static void getAllCity(){
		for(int city=0;city<cityNames.length;city++){
		String ref=cityNames[city];
		System.out.println(ref);
        }
    }
	public static boolean deleteCityName(String deletedCityName){
        System.out.println("invoking deleteCityName");
       
        boolean isDeleted=false;
        int cityIndex;
        int noofElements=index;

        for(cityIndex=0; cityIndex<index;cityIndex++){
            if(cityNames[cityIndex].equals(deletedCityName)){
				isDeleted=true;
                break;
            }
        }

        if(cityIndex<noofElements){
            noofElements=noofElements-1;
        }

        for(int newCityIndex=cityIndex;newCityIndex<noofElements;newCityIndex++){
            cityNames[newCityIndex]=cityNames[newCityIndex+1];
        }
		index--;
        return isDeleted;

    }
    
    public static void getAllCityNamePostDeletetion(){
        for(int cityIndex=0;cityIndex<index; cityIndex++){
            System.out.println(cityNames[cityIndex]);
    }
}
}

