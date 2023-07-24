public class SwitchBoardTester {
    
    public static void main(String[] args) {
        
       
        // board is reference variable 
        // new keyword indicates that there is class name SwitchBoard which i have to allocate memory
     
         // 1. object creation logic & 2. once we create a object memory will be allocated 3. invoking constuctor 4. ref variable
        SwitchBoard board = new SwitchBoard("JK",3,"A","White",100.00);            
		System.out.println(board.brandName+"\n"+board.noOfSwitches+"\n"+board.type+"\n"+board.color+"\n"+board.price);
		SwitchBoard board1 = new SwitchBoard("JWK",5,"B","Brown",150.00);            
		System.out.println(board1.brandName+"\n"+board1.noOfSwitches+"\n"+board1.type+"\n"+board1.color+"\n"+board1.price);
		SwitchBoard board2 = new SwitchBoard("SJR",9,"C","Black",300.00);            
		System.out.println(board2.brandName+"\n"+board2.noOfSwitches+"\n"+board2.type+"\n"+board2.color+"\n"+board2.price);
		
    }

}