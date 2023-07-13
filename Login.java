class Login{

   static  boolean isLogin;
   
   public static boolean login(String email,String password){
       
   

	   if(email != ""&& password !=""){

	     if(email=="R@gmail.com" && password=="Raksh7586"){
		   isLogin=true;
		   System.out.println("Login is Successfull");
		 
		 }
		 else{
		   isLogin=false;
		   System.out.println("Invalid Email Or Password");
		 }
	   }else{
	   System.out.println("Provide correct credentials");
	   }
       return isLogin;
   }

   public static boolean login(long mobileNo,String password){
        boolean isLogin=false;
		if(mobileNo!=0 && password!="" ){
		  if(mobileNo==8622402948L && password=="Raksh7586"){
		  isLogin=true;
		  System.out.println("Login is Successfull ");
		  }
		  else{
		    isLogin=false;
			System.out.println("Invalid user identity ..Try agaain");
		  }
        }
		else{
		  isLogin=false;
		  System.out.println("Provide correct Identity");
		}
		
		
        return isLogin;
    }

}