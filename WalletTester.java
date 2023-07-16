class WalletTester {
    public static void main(String w[]){
        Wallet wallet1 = new Wallet();
        wallet1.brand = "Louis Vuitton";
        wallet1.color = "Brown";
        wallet1.material = "Leather";
        wallet1.numCompartments = 6;
        wallet1.price = 599.99;
        wallet1.displayInfo();
        System.out.println(wallet1.brand + "\n" + wallet1.color + "\n" + wallet1.material + "\n" + wallet1.numCompartments + "\n" + wallet1.price);

        Wallet wallet2 = new Wallet();
        wallet2.brand = "Gucci";
        wallet2.color = "Black";
        wallet2.material = "Leather";
        wallet2.numCompartments = 4;
        wallet2.price = 499.99;
        wallet2.displayInfo();
        System.out.println(wallet2.brand + "\n" + wallet2.color + "\n" + wallet2.material + "\n" + wallet2.numCompartments + "\n" + wallet2.price);

        Wallet wallet3 = new Wallet();
        wallet3.brand = "Prada";
        wallet3.color = "Pink";
        wallet3.material = "Saffiano Leather";
        wallet3.numCompartments = 8;
        wallet3.price = 799.99;
        wallet3.displayInfo();
        System.out.println(wallet3.brand + "\n" + wallet3.color + "\n" + wallet3.material + "\n" + wallet3.numCompartments + "\n" + wallet3.price);

        Wallet wallet4 = new Wallet();
        wallet4.brand = "Burberry";
        wallet4.color = "Beige";
        wallet4.material = "Canvas";
        wallet4.numCompartments = 10;
        wallet4.price = 399.99;
        wallet4.displayInfo();
        System.out.println(wallet4.brand + "\n" + wallet4.color + "\n" + wallet4.material + "\n" + wallet4.numCompartments + "\n" + wallet4.price);

        Wallet wallet5 = new Wallet();
        wallet5.brand = "Hermes";
        wallet5.color = "Orange";
        wallet5.material = "Calfskin";
        wallet5.numCompartments = 4;
        wallet5.price = 1499.99;
        wallet5.displayInfo();
        System.out.println(wallet5.brand + "\n" + wallet5.color + "\n" + wallet5.material + "\n" + wallet5.numCompartments + "\n" + wallet5.price);

        Wallet wallet6 = new Wallet();
        wallet6.brand = "Coach";
        wallet6.color = "Black";
        wallet6.material = "Signature Canvas";
        wallet6.numCompartments = 6;
        wallet6.price = 299.99;
        wallet6.displayInfo();
        System.out.println(wallet6.brand + "\n" + wallet6.color + "\n" + wallet6.material + "\n" + wallet6.numCompartments + "\n" + wallet6.price);

        Wallet wallet7 = new Wallet();
        wallet7.brand = "Michael Kors";
        wallet7.color = "Rose Gold";
        wallet7.material = "Saffiano Leather";
        wallet7.numCompartments = 8;
        wallet7.price = 199.99;
        wallet7.displayInfo();
        System.out.println(wallet7.brand + "\n" + wallet7.color + "\n" + wallet7.material + "\n" + wallet7.numCompartments + "\n" + wallet7.price);

        Wallet wallet8 = new Wallet();
        wallet8.brand = "Fossil";
        wallet8.color = "Brown";
        wallet8.material = "Leather";
        wallet8.numCompartments = 4;
        wallet8.price = 89.99;
        wallet8.displayInfo();
        System.out.println(wallet8.brand + "\n" + wallet8.color + "\n" + wallet8.material + "\n" + wallet8.numCompartments + "\n" + wallet8.price);

        Wallet wallet9 = new Wallet();
        wallet9.brand = "Kate Spade";
        wallet9.color = "Pink";
        wallet9.material = "Saffiano Leather";
        wallet9.numCompartments = 6;
        wallet9.price = 149.99;
        wallet9.displayInfo();
        System.out.println(wallet9.brand + "\n" + wallet9.color + "\n" + wallet9.material + "\n" + wallet9.numCompartments + "\n" + wallet9.price);

        Wallet wallet10 = new Wallet();
        wallet10.brand = "Ted Baker";
        wallet10.color = "Silver";
        wallet10.material = "Metallic Leather";
        wallet10.numCompartments = 6;
        wallet10.price = 129.99;
        wallet10.displayInfo();
        System.out.println(wallet10.brand + "\n" + wallet10.color + "\n" + wallet10.material + "\n" + wallet10.numCompartments + "\n" + wallet10.price);
    }
}