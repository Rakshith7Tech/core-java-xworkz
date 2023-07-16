class RocketTester {
    public static void main(String r[]){
        Rocket rocket1 = new Rocket();
        rocket1.name = "Falcon 9";
        rocket1.manufacturer = "SpaceX";
        rocket1.payloadCapacity = 22_800; // in kilograms
        rocket1.height = 70.0;
        rocket1.diameter = 3.7;
        rocket1.mass = 549_054; // in kilograms
        rocket1.displayInfo();
        System.out.println(rocket1.name + "\n" + rocket1.manufacturer + "\n" + rocket1.payloadCapacity + "\n" + rocket1.height + "\n" + rocket1.diameter + "\n" + rocket1.mass);

        Rocket rocket2 = new Rocket();
        rocket2.name = "Atlas V";
        rocket2.manufacturer = "United Launch Alliance";
        rocket2.payloadCapacity = 18_810; // in kilograms
        rocket2.height = 58.3;
        rocket2.diameter = 3.81;
        rocket2.mass = 334_500; // in kilograms
        rocket2.displayInfo();
        System.out.println(rocket2.name + "\n" + rocket2.manufacturer + "\n" + rocket2.payloadCapacity + "\n" + rocket2.height + "\n" + rocket2.diameter + "\n" + rocket2.mass);

        Rocket rocket3 = new Rocket();
        rocket3.name = "Delta IV";
        rocket3.manufacturer = "United Launch Alliance";
        rocket3.payloadCapacity = 14_220; // in kilograms
        rocket3.height = 62.54;
        rocket3.diameter = 5.0;
        rocket3.mass = 733_100; // in kilograms
        rocket3.displayInfo();
        System.out.println(rocket3.name + "\n" + rocket3.manufacturer + "\n" + rocket3.payloadCapacity + "\n" + rocket3.height + "\n" + rocket3.diameter + "\n" + rocket3.mass);

        Rocket rocket4 = new Rocket();
        rocket4.name = "Soyuz";
        rocket4.manufacturer = "Roscosmos";
        rocket4.payloadCapacity = 6_900; // in kilograms
        rocket4.height = 49.5;
        rocket4.diameter = 3.0;
        rocket4.mass = 308_000; // in kilograms
        rocket4.displayInfo();
        System.out.println(rocket4.name + "\n" + rocket4.manufacturer + "\n" + rocket4.payloadCapacity + "\n" + rocket4.height + "\n" + rocket4.diameter + "\n" + rocket4.mass);

        Rocket rocket5 = new Rocket();
        rocket5.name = "Long March 5";
        rocket5.manufacturer = "China National Space Administration";
        rocket5.payloadCapacity = 25_000; // in kilograms
        rocket5.height = 57.0;
        rocket5.diameter = 5.0;
        rocket5.mass = 837_000; // in kilograms
        rocket5.displayInfo();
        System.out.println(rocket5.name + "\n" + rocket5.manufacturer + "\n" + rocket5.payloadCapacity + "\n" + rocket5.height + "\n" + rocket5.diameter + "\n" + rocket5.mass);

        Rocket rocket6 = new Rocket();
        rocket6.name = "Proton";
        rocket6.manufacturer = "Khrunichev State Research and Production Space Center";
        rocket6.payloadCapacity = 22_000; // in kilograms
        rocket6.height = 58.2;
        rocket6.diameter = 7.4;
        rocket6.mass = 712_000; // in kilograms
        rocket6.displayInfo();
        System.out.println(rocket6.name + "\n" + rocket6.manufacturer + "\n" + rocket6.payloadCapacity + "\n" + rocket6.height + "\n" + rocket6.diameter + "\n" + rocket6.mass);

        Rocket rocket7 = new Rocket();
        rocket7.name = "Space Launch System (SLS)";
        rocket7.manufacturer = "NASA";
        rocket7.payloadCapacity = 95_000; // in kilograms
        rocket7.height = 98.0;
        rocket7.diameter = 8.4;
        rocket7.mass = 2_733_900; // in kilograms
        rocket7.displayInfo();
        System.out.println(rocket7.name + "\n" + rocket7.manufacturer + "\n" + rocket7.payloadCapacity + "\n" + rocket7.height + "\n" + rocket7.diameter + "\n" + rocket7.mass);

        Rocket rocket8 = new Rocket();
        rocket8.name = "Ariane 5";
        rocket8.manufacturer = "Arianespace";
        rocket8.payloadCapacity = 21_000; // in kilograms
        rocket8.height = 57.7;
        rocket8.diameter = 5.4;
        rocket8.mass = 780_000; // in kilograms
        rocket8.displayInfo();
        System.out.println(rocket8.name + "\n" + rocket8.manufacturer + "\n" + rocket8.payloadCapacity + "\n" + rocket8.height + "\n" + rocket8.diameter + "\n" + rocket8.mass);

        Rocket rocket9 = new Rocket();
        rocket9.name = "GSLV Mk III";
        rocket9.manufacturer = "Indian Space Research Organisation (ISRO)";
        rocket9.payloadCapacity = 10_000; // in kilograms
        rocket9.height = 43.43;
        rocket9.diameter = 4.0;
        rocket9.mass = 640_000; // in kilograms
        rocket9.displayInfo();
        System.out.println(rocket9.name + "\n" + rocket9.manufacturer + "\n" + rocket9.payloadCapacity + "\n" + rocket9.height + "\n" + rocket9.diameter + "\n" + rocket9.mass);

        Rocket rocket10 = new Rocket();
        rocket10.name = "Vega";
        rocket10.manufacturer = "Arianespace";
        rocket10.payloadCapacity = 1_500; // in kilograms
        rocket10.height = 30.0;
        rocket10.diameter = 3.0;
        rocket10.mass = 137_000; // in kilograms
        rocket10.displayInfo();
        System.out.println(rocket10.name + "\n" + rocket10.manufacturer + "\n" + rocket10.payloadCapacity + "\n" + rocket10.height + "\n" + rocket10.diameter + "\n" + rocket10.mass);
    }
}