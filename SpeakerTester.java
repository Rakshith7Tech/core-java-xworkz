class SpeakerTester{
	public static void main(String tester[]){
		System.out.println("Main Started");
		Speaker.onOrOff();
		Speaker.onOrOff();
		
		boolean connected1=Speaker.onOrOff();
		System.out.println("Is Speaker connected " + connected1);
		boolean connected2=Speaker.onOrOff();
		Speaker.onOrOff();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		boolean connected3=Speaker.onOrOff();
		System.out.println("Is Speaker connected " + connected2);
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		System.out.println("Main ended");
	}
}