class UmbrellaTester {
    public static void main(String u[]){
        Umbrella umbrella1 = new Umbrella();
        umbrella1.brand = "GustBuster";
        umbrella1.color = "Black";
        umbrella1.size = "Standard";
        umbrella1.price = 24.99;
        umbrella1.isOpen = false;
        umbrella1.displayInfo();
        System.out.println(umbrella1.brand + "\n" + umbrella1.color + "\n" + umbrella1.size + "\n" + umbrella1.price + "\n" + (umbrella1.isOpen ? "Open" : "Closed"));

        Umbrella umbrella2 = new Umbrella();
        umbrella2.brand = "Totes";
        umbrella2.color = "Navy Blue";
        umbrella2.size = "Compact";
        umbrella2.price = 12.99;
        umbrella2.isOpen = true;
        umbrella2.displayInfo();
        System.out.println(umbrella2.brand + "\n" + umbrella2.color + "\n" + umbrella2.size + "\n" + umbrella2.price + "\n" + (umbrella2.isOpen ? "Open" : "Closed"));

        Umbrella umbrella3 = new Umbrella();
        umbrella3.brand = "Fulton";
        umbrella3.color = "Red";
        umbrella3.size = "Large";
        umbrella3.price = 19.99;
        umbrella3.isOpen = false;
        umbrella3.displayInfo();
        System.out.println(umbrella3.brand + "\n" + umbrella3.color + "\n" + umbrella3.size + "\n" + umbrella3.price + "\n" + (umbrella3.isOpen ? "Open" : "Closed"));

        Umbrella umbrella4 = new Umbrella();
        umbrella4.brand = "Davek";
        umbrella4.color = "Silver";
        umbrella4.size = "Standard";
        umbrella4.price = 129.99;
        umbrella4.isOpen = true;
        umbrella4.displayInfo();
        System.out.println(umbrella4.brand + "\n" + umbrella4.color + "\n" + umbrella4.size + "\n" + umbrella4.price + "\n" + (umbrella4.isOpen ? "Open" : "Closed"));

        Umbrella umbrella5 = new Umbrella();
        umbrella5.brand = "ShedRain";
        umbrella5.color = "Pink";
        umbrella5.size = "Compact";
        umbrella5.price = 9.99;
        umbrella5.isOpen = false;
        umbrella5.displayInfo();
        System.out.println(umbrella5.brand + "\n" + umbrella5.color + "\n" + umbrella5.size + "\n" + umbrella5.price + "\n" + (umbrella5.isOpen ? "Open" : "Closed"));

        Umbrella umbrella6 = new Umbrella();
        umbrella6.brand = "Blunt";
        umbrella6.color = "Yellow";
        umbrella6.size = "Standard";
        umbrella6.price = 79.99;
        umbrella6.isOpen = true;
        umbrella6.displayInfo();
        System.out.println(umbrella6.brand + "\n" + umbrella6.color + "\n" + umbrella6.size + "\n" + umbrella6.price + "\n" + (umbrella6.isOpen ? "Open" : "Closed"));

        Umbrella umbrella7 = new Umbrella();
        umbrella7.brand = "Senz";
        umbrella7.color = "Blue";
        umbrella7.size = "Large";
        umbrella7.price = 49.99;
        umbrella7.isOpen = false;
        umbrella7.displayInfo();
        System.out.println(umbrella7.brand + "\n" + umbrella7.color + "\n" + umbrella7.size + "\n" + umbrella7.price + "\n" + (umbrella7.isOpen ? "Open" : "Closed"));

        Umbrella umbrella8 = new Umbrella();
        umbrella8.brand = "Knirps";
        umbrella8.color = "Green";
        umbrella8.size = "Compact";
        umbrella8.price = 29.99;
        umbrella8.isOpen = true;
        umbrella8.displayInfo();
        System.out.println(umbrella8.brand + "\n" + umbrella8.color + "\n" + umbrella8.size + "\n" + umbrella8.price + "\n" + (umbrella8.isOpen ? "Open" : "Closed"));

        Umbrella umbrella9 = new Umbrella();
        umbrella9.brand = "GustBuster";
        umbrella9.color = "Red";
        umbrella9.size = "Standard";
        umbrella9.price = 24.99;
        umbrella9.isOpen = false;
        umbrella9.displayInfo();
        System.out.println(umbrella9.brand + "\n" + umbrella9.color + "\n" + umbrella9.size + "\n" + umbrella9.price + "\n" + (umbrella9.isOpen ? "Open" : "Closed"));

        Umbrella umbrella10 = new Umbrella();
        umbrella10.brand = "Totes";
        umbrella10.color = "Purple";
        umbrella10.size = "Compact";
        umbrella10.price = 12.99;
        umbrella10.isOpen = true;
        umbrella10.displayInfo();
        System.out.println(umbrella10.brand + "\n" + umbrella10.color + "\n" + umbrella10.size + "\n" + umbrella10.price + "\n" + (umbrella10.isOpen ? "Open" : "Closed"));
    }
}