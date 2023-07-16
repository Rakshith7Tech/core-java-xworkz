class WaterHeaterTester {
    public static void main(String w[]){
        WaterHeater waterHeater1 = new WaterHeater();
        waterHeater1.brand = "Rheem";
        waterHeater1.capacity = 50; // in gallons
        waterHeater1.powerSource = "Electric";
        waterHeater1.price = 599.99;
        waterHeater1.energyRating = "Energy Star";
        waterHeater1.isSmart = true;
        waterHeater1.displayInfo();
        System.out.println(waterHeater1.brand + "\n" + waterHeater1.capacity + "\n" + waterHeater1.powerSource + "\n" + waterHeater1.price + "\n" + waterHeater1.energyRating + "\n" + waterHeater1.isSmart);

        WaterHeater waterHeater2 = new WaterHeater();
        waterHeater2.brand = "AO Smith";
        waterHeater2.capacity = 40; // in gallons
        waterHeater2.powerSource = "Natural Gas";
        waterHeater2.price = 899.99;
        waterHeater2.energyRating = "Energy Star";
        waterHeater2.isSmart = false;
        waterHeater2.displayInfo();
        System.out.println(waterHeater2.brand + "\n" + waterHeater2.capacity + "\n" + waterHeater2.powerSource + "\n" + waterHeater2.price + "\n" + waterHeater2.energyRating + "\n" + waterHeater2.isSmart);

        WaterHeater waterHeater3 = new WaterHeater();
        waterHeater3.brand = "Bradford White";
        waterHeater3.capacity = 60; // in gallons
        waterHeater3.powerSource = "Propane";
        waterHeater3.price = 1299.99;
        waterHeater3.energyRating = "Non-Energy Star";
        waterHeater3.isSmart = false;
        waterHeater3.displayInfo();
        System.out.println(waterHeater3.brand + "\n" + waterHeater3.capacity + "\n" + waterHeater3.powerSource + "\n" + waterHeater3.price + "\n" + waterHeater3.energyRating + "\n" + waterHeater3.isSmart);

        WaterHeater waterHeater4 = new WaterHeater();
        waterHeater4.brand = "EcoSmart";
        waterHeater4.capacity = 3; // in gallons
        waterHeater4.powerSource = "Electric";
        waterHeater4.price = 199.99;
        waterHeater4.energyRating = "Energy Star";
        waterHeater4.isSmart = true;
        waterHeater4.displayInfo();
        System.out.println(waterHeater4.brand + "\n" + waterHeater4.capacity + "\n" + waterHeater4.powerSource + "\n" + waterHeater4.price + "\n" + waterHeater4.energyRating + "\n" + waterHeater4.isSmart);

        WaterHeater waterHeater5 = new WaterHeater();
        waterHeater5.brand = "Navien";
        waterHeater5.capacity = 10; // in gallons
        waterHeater5.powerSource = "Natural Gas";
        waterHeater5.price = 799.99;
        waterHeater5.energyRating = "Energy Star";
        waterHeater5.isSmart = false;
        waterHeater5.displayInfo();
        System.out.println(waterHeater5.brand + "\n" + waterHeater5.capacity + "\n" + waterHeater5.powerSource + "\n" + waterHeater5.price + "\n" + waterHeater5.energyRating + "\n" + waterHeater5.isSmart);

        WaterHeater waterHeater6 = new WaterHeater();
        waterHeater6.brand = "Whirlpool";
        waterHeater6.capacity = 30; // in gallons
        waterHeater6.powerSource = "Electric";
        waterHeater6.price = 699.99;
        waterHeater6.energyRating = "Energy Star";
        waterHeater6.isSmart = true;
        waterHeater6.displayInfo();
        System.out.println(waterHeater6.brand + "\n" + waterHeater6.capacity + "\n" + waterHeater6.powerSource + "\n" + waterHeater6.price + "\n" + waterHeater6.energyRating + "\n" + waterHeater6.isSmart);

        WaterHeater waterHeater7 = new WaterHeater();
        waterHeater7.brand = "Kenmore";
        waterHeater7.capacity = 20; // in gallons
        waterHeater7.powerSource = "Electric";
        waterHeater7.price = 549.99;
        waterHeater7.energyRating = "Non-Energy Star";
        waterHeater7.isSmart = false;
        waterHeater7.displayInfo();
        System.out.println(waterHeater7.brand + "\n" + waterHeater7.capacity + "\n" + waterHeater7.powerSource + "\n" + waterHeater7.price + "\n" + waterHeater7.energyRating + "\n" + waterHeater7.isSmart);

        WaterHeater waterHeater8 = new WaterHeater();
        waterHeater8.brand = "Ariston";
        waterHeater8.capacity = 6; // in gallons
        waterHeater8.powerSource = "Electric";
        waterHeater8.price = 299.99;
        waterHeater8.energyRating = "Energy Star";
        waterHeater8.isSmart = false;
        waterHeater8.displayInfo();
        System.out.println(waterHeater8.brand + "\n" + waterHeater8.capacity + "\n" + waterHeater8.powerSource + "\n" + waterHeater8.price + "\n" + waterHeater8.energyRating + "\n" + waterHeater8.isSmart);

        WaterHeater waterHeater9 = new WaterHeater();
        waterHeater9.brand = "Bosch";
        waterHeater9.capacity = 12; // in gallons
        waterHeater9.powerSource = "Electric";
        waterHeater9.price = 399.99;
        waterHeater9.energyRating = "Energy Star";
        waterHeater9.isSmart = true;
        waterHeater9.displayInfo();
        System.out.println(waterHeater9.brand + "\n" + waterHeater9.capacity + "\n" + waterHeater9.powerSource + "\n" + waterHeater9.price + "\n" + waterHeater9.energyRating + "\n" + waterHeater9.isSmart);

        WaterHeater waterHeater10 = new WaterHeater();
        waterHeater10.brand = "Rinnai";
        waterHeater10.capacity = 8; // in gallons
        waterHeater10.powerSource = "Natural Gas";
        waterHeater10.price = 699.99;
        waterHeater10.energyRating = "Non-Energy Star";
        waterHeater10.isSmart = false;
        waterHeater10.displayInfo();
        System.out.println(waterHeater10.brand + "\n" + waterHeater10.capacity + "\n" + waterHeater10.powerSource + "\n" + waterHeater10.price + "\n" + waterHeater10.energyRating + "\n" + waterHeater10.isSmart);
    }
}