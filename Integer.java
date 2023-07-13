class Integer{
	public static void getLargestNumber(int a[]){
		int large=a[0];
		for(int index=1; index<a.length; index++){
			if(a[index]>large){
				large=a[index];
			}
		}
		System.out.println(large);
	}
	public static void getSmallestNumber(int a[]){
		int large=a[0];
		for(int index=1; index<a.length; index++){
			if(a[index]<large){
				large=a[index];
			}
		}
		System.out.println(large);
	}
}
