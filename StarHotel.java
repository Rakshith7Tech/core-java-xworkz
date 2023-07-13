class StarHotel{
	static String foodMenus[]={"Butter Chicken", "Biryani", "Tandoori Chicken", "Rogan Josh", "Masala Dosa", "Palak Paneer", "Chole Bhature", "Pav Bhaji", "Aloo Paratha", "Samosa", "Chicken Tikka Masala", "Malai Kofta", "Chicken Biryani", "Pani Puri", "Rogan Josh", "Hyderabadi Biryani", "Dal Makhani", "Naan", "Chicken Curry", "Dahi Vada", "Mutton Curry", "Vada Pav", "Paneer Tikka", "Chole Kulche", "Matar Paneer", "Chicken Korma", "Butter Naan", "Rajma Chawal", "Aloo Tikki", "Chicken 65", "Bhel Puri", "Gobi Manchurian", "Fish Curry", "Mutton Biryani", "Prawn Masala", "Kadai Paneer", "Idli", "Pongal", "Masala Chai", "Rabri", "Gulab Jamun", "Jalebi", "Rasmalai", "Rasgulla", "Gajar Halwa", "Kheer", "Kulfi", "Falooda", "Lassi", "Paan"};
	public static void main(String ft[]){
		System.out.println("Main started");
		System.out.println("List of Food types are:");
		getFoodMenus();
		// for(String foodMenu : foodMenus){
			// System.out.println(foodMenu);
		// }
        System.out.println("Main ended");
		System.out.println(foodMenus.length);
 }
        public static void getFoodMenus(){
		    System.out.println("Inside getFoodMenus");
			for(String foodMenu : foodMenus){
			System.out.println(foodMenu);
		}
		}
}