class AgroIndustryTester {
    public static void main(String[] args) {
        AgroIndustry equipment1 = new AgroIndustry();
        equipment1.name = "Tractor";
        equipment1.manufacturer = "John Deere";
        equipment1.power = 100; // in horsepower
        equipment1.price = 50000.0;
        equipment1.isPortable = true;
        equipment1.fuelType = "Diesel";
        equipment1.displayInfo();
        System.out.println(equipment1.name + "\n" + equipment1.manufacturer + "\n" + equipment1.power + "\n" + equipment1.price + "\n" + equipment1.isPortable + "\n" + equipment1.fuelType);

        AgroIndustry equipment2 = new AgroIndustry();
        equipment2.name = "Combine Harvester";
        equipment2.manufacturer = "Case IH";
        equipment2.power = 300; // in horsepower
        equipment2.price = 200000.0;
        equipment2.isPortable = false;
        equipment2.fuelType = "Diesel";
        equipment2.displayInfo();
        System.out.println(equipment2.name + "\n" + equipment2.manufacturer + "\n" + equipment2.power + "\n" + equipment2.price + "\n" + equipment2.isPortable + "\n" + equipment2.fuelType);

        AgroIndustry equipment3 = new AgroIndustry();
        equipment3.name = "Sprayer";
        equipment3.manufacturer = "Horsch";
        equipment3.power = 150; // in horsepower
        equipment3.price = 100000.0;
        equipment3.isPortable = true;
        equipment3.fuelType = "Diesel";
        equipment3.displayInfo();
        System.out.println(equipment3.name + "\n" + equipment3.manufacturer + "\n" + equipment3.power + "\n" + equipment3.price + "\n" + equipment3.isPortable + "\n" + equipment3.fuelType);

        AgroIndustry equipment4 = new AgroIndustry();
        equipment4.name = "Seeder";
        equipment4.manufacturer = "Kuhn";
        equipment4.power = 50; // in horsepower
        equipment4.price = 25000.0;
        equipment4.isPortable = true;
        equipment4.fuelType = "Diesel";
        equipment4.displayInfo();
        System.out.println(equipment4.name + "\n" + equipment4.manufacturer + "\n" + equipment4.power + "\n" + equipment4.price + "\n" + equipment4.isPortable + "\n" + equipment4.fuelType);

        AgroIndustry equipment5 = new AgroIndustry();
        equipment5.name = "Irrigation System";
        equipment5.manufacturer = "Valmont";
        equipment5.power = 20; // in horsepower
        equipment5.price = 5000.0;
        equipment5.isPortable = false;
        equipment5.fuelType = "Electric";
        equipment5.displayInfo();
        System.out.println(equipment5.name + "\n" + equipment5.manufacturer + "\n" + equipment5.power + "\n" + equipment5.price + "\n" + equipment5.isPortable + "\n" + equipment5.fuelType);

        AgroIndustry equipment6 = new AgroIndustry();
        equipment6.name = "Fertilizer Spreader";
        equipment6.manufacturer = "Amazone";
        equipment6.power = 80; // in horsepower
        equipment6.price = 15000.0;
        equipment6.isPortable = true;
        equipment6.fuelType = "Diesel";
        equipment6.displayInfo();
        System.out.println(equipment6.name + "\n" + equipment6.manufacturer + "\n" + equipment6.power + "\n" + equipment6.price + "\n" + equipment6.isPortable + "\n" + equipment6.fuelType);

        AgroIndustry equipment7 = new AgroIndustry();
        equipment7.name = "Harrow";
        equipment7.manufacturer = "Dakota";
        equipment7.power = 30; // in horsepower
        equipment7.price = 8000.0;
        equipment7.isPortable = true;
        equipment7.fuelType = "Gasoline";
        equipment7.displayInfo();
        System.out.println(equipment7.name + "\n" + equipment7.manufacturer + "\n" + equipment7.power + "\n" + equipment7.price + "\n" + equipment7.isPortable + "\n" + equipment7.fuelType);

        AgroIndustry equipment8 = new AgroIndustry();
        equipment8.name = "Plough";
        equipment8.manufacturer = "Lemken";
        equipment8.power = 40; // in horsepower
        equipment8.price = 10000.0;
        equipment8.isPortable = true;
        equipment8.fuelType = "Diesel";
        equipment8.displayInfo();
        System.out.println(equipment8.name + "\n" + equipment8.manufacturer + "\n" + equipment8.power + "\n" + equipment8.price + "\n" + equipment8.isPortable + "\n" + equipment8.fuelType);

        AgroIndustry equipment9 = new AgroIndustry();
        equipment9.name = "Hay Baler";
        equipment9.manufacturer = "New Holland";
        equipment9.power = 60; // in horsepower
        equipment9.price = 35000.0;
        equipment9.isPortable = true;
        equipment9.fuelType = "Diesel";
        equipment9.displayInfo();
        System.out.println(equipment9.name + "\n" + equipment9.manufacturer + "\n" + equipment9.power + "\n" + equipment9.price + "\n" + equipment9.isPortable + "\n" + equipment9.fuelType);

        AgroIndustry equipment10 = new AgroIndustry();
        equipment10.name = "Greenhouse";
        equipment10.manufacturer = "Rimol";
        equipment10.power = 0; // in horsepower
        equipment10.price = 5000.0;
        equipment10.isPortable = false;
        equipment10.fuelType = "N/A";
        equipment10.displayInfo();
        System.out.println(equipment10.name + "\n" + equipment10.manufacturer + "\n" + equipment10.power + "\n" + equipment10.price + "\n" + equipment10.isPortable + "\n" + equipment10.fuelType);
    }
}