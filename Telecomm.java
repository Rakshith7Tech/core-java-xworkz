class Telecomm{
static String simNames[]={null,null,null,null,null};
static int index;
public static boolean addSim(String sim ){
    boolean isAdded = false;
	if(sim!= null){
	simNames[index] = sim;
	index++;
	isAdded = true;
	}else{
	System.out.println("cannot add ");
	}
	return isAdded;
	}
	public static void getAllSim(){
	for(int sim=0;sim<simNames.length;sim++){
	String ref=simNames[sim];
	System.out.println(ref);
	}
	}
	public static boolean updateSimName(String existingSimName,String updatedSimName){
	boolean isUpdated=false;
	for(int j=0;j<simNames.length;j++)
	{
		if(simNames[j].equals(existingSimName))
		{
		simNames[j]=updatedSimName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static boolean deleteSimName(String deletedSimName){
        System.out.println("invoking deleteSimName");
       
        boolean isDeleted=false;
        int simIndex;
        int noofElements=index;

        for(simIndex=0; simIndex<index;simIndex++){
            if(simNames[simIndex].equals(deletedSimName)){
				isDeleted=true;
                break;
            }
        }

        if(simIndex<noofElements){
            noofElements=noofElements-1;
        }

        for(int newSimIndex=simIndex;newSimIndex<noofElements;newSimIndex++){
            simNames[newSimIndex]=simNames[newSimIndex+1];
        }
		index--;
        return isDeleted;

    }
    
    public static void getAllSimNamePostDeletetion(){
        for(int simIndex=0;simIndex<index; simIndex++){
            System.out.println(simNames[simIndex]);
    }
}
}