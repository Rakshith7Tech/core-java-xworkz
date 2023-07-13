class Factorial{
	public static int getFact(int factorialNumber){
		int fact=1;
		for(int i=1; i<=factorialNumber; i++){
			fact=i*fact;
		}
		return fact;
	}
}