class McDonalds{
   public static double search(String foodName){
	   if("Hamburger" == foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 119.99;
	   }
	   if("Double Cheeseburger"== foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 149.00;
	   }
	   if("Triple Cheeseburger"== foodName){
		 System.out.println("The searched Food is " + foodName);
		 return 299.90;
	   }
	   if("Big Mac"== foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 199.89;
	   }
	   if("Quarter Pounder"==foodName){
		   System.out.println("The searched Food is " + foodName); 
		   return 399.00; 
	   }
       if("Big N' Tasty"==foodName){
	       System.out.println("The searched Food is " + foodName);
	       return 499.50;
       }
       if("McDouble"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 249.99;
	   }
	   if("Bacon McDouble"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 899.00;
	   }
	   if("Daily Double"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 799.50;
	   }
	   if("McFeast"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 999.99;
	   }
	   if("McChicken"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 149.90;
	   }
	   if("McNuggets"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 399.49;
	   }
	   if("Premium Chicken Sandwiches"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 249.99;
	   }
	   if("Premium Chicken Deluxe"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 449.50;
	   }
	   if("Grilled Chicken Deluxe"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 550.95;
	   }
	   if("Taste-Crafted"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 599.50;
	   }
	   if("Deli Choices"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 1450.99;
	   }
	   if("Snack Wrap"==foodName ){
		   System.out.println("The searched Food is " + foodName);
		   return 125.99;   
	   }
	   if("Premium Chicken McWrap"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 460.00;
	   }
	   if("Chicken McBites"==foodName){
		   System.out.println("The searched Food is " + foodName);
		   return 955.00;
	   }
	   return 0.0;
    }
	 public static double search(String foodName, double quantity){
	   if("Hamburger" == foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 199.99*quantity;
	   }
	   if("Double Cheeseburger"== foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 149.00*quantity;
	   }
	   if("Triple Cheeseburger"== foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 299.90*quantity;
	   }
	   if("Big Mac"== foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 199.89*quantity;
	   }
	   if("Quarter Pounder"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity); 
		   return 399.00*quantity; 
	   }
       if("Big N' Tasty"==foodName){
	       System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
	       return 499.50*quantity;
       }
       if("McDouble"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 249.99*quantity;
	   }
	   if("Bacon McDouble"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 899.00*quantity;
	   }
	   if("Daily Double"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 799.50*quantity;
	   }
	   if("McFeast"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 999.99*quantity;
	   }
	   if("McChicken"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 149.90*quantity;
	   }
	   if("McNuggets"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 399.49*quantity;
	   }
	   if("Premium Chicken Sandwiches"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 249.99*quantity;
	   }
	   if("Premium Chicken Deluxe"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 449.50*quantity;
	   }
	   if("Grilled Chicken Deluxe"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 550.95*quantity;
	   }
	   if("Taste-Crafted"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 599.50*quantity;
	   }
	   if("Deli Choices"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 1450.99*quantity;
	   }
	   if("Snack Wrap"==foodName ){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 125.99*quantity;   
	   }
	   if("Premium Chicken McWrap"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 460.00*quantity;
	   }
	   if("Chicken McBites"==foodName){
		   System.out.println("The searched Food is " + foodName+" , Quantity: "+quantity);
		   return 955.00*quantity;
	   }
	  return 0.0;

    }
}