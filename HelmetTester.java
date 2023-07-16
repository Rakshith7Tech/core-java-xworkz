class HelmetTester {
    public static void main(String h[]){
        Helmet helmet1 = new Helmet();
        helmet1.brand = "Bell";
        helmet1.model = "Qualifier DLX";
        helmet1.color = "Black";
        helmet1.size = "Medium";
        helmet1.price = 169.99;
        helmet1.isFullFace = true;
        helmet1.displayInfo();
        System.out.println(helmet1.brand + "\n" + helmet1.model + "\n" + helmet1.color + "\n" + helmet1.size + "\n" + helmet1.price + "\n" + (helmet1.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet2 = new Helmet();
        helmet2.brand = "Shoei";
        helmet2.model = "RF-1200";
        helmet2.color = "White";
        helmet2.size = "Large";
        helmet2.price = 489.99;
        helmet2.isFullFace = true;
        helmet2.displayInfo();
        System.out.println(helmet2.brand + "\n" + helmet2.model + "\n" + helmet2.color + "\n" + helmet2.size + "\n" + helmet2.price + "\n" + (helmet2.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet3 = new Helmet();
        helmet3.brand = "AGV";
        helmet3.model = "K-3 SV";
        helmet3.color = "Black/Yellow";
        helmet3.size = "Medium";
        helmet3.price = 299.99;
        helmet3.isFullFace = true;
        helmet3.displayInfo();
        System.out.println(helmet3.brand + "\n" + helmet3.model + "\n" + helmet3.color + "\n" + helmet3.size + "\n" + helmet3.price + "\n" + (helmet3.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet4 = new Helmet();
        helmet4.brand = "HJC";
        helmet4.model = "CL-17";
        helmet4.color = "Matte Black";
        helmet4.size = "Small";
        helmet4.price = 139.99;
        helmet4.isFullFace = true;
        helmet4.displayInfo();
        System.out.println(helmet4.brand + "\n" + helmet4.model + "\n" + helmet4.color + "\n" + helmet4.size + "\n" + helmet4.price + "\n" + (helmet4.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet5 = new Helmet();
        helmet5.brand = "Scorpion";
        helmet5.model = "EXO-R420";
        helmet5.color = "Matte Black";
        helmet5.size = "Medium";
        helmet5.price = 129.99;
        helmet5.isFullFace = true;
        helmet5.displayInfo();
        System.out.println(helmet5.brand + "\n" + helmet5.model + "\n" + helmet5.color + "\n" + helmet5.size + "\n" + helmet5.price + "\n" + (helmet5.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet6 = new Helmet();
        helmet6.brand = "Nolan";
        helmet6.model = "N87";
        helmet6.color = "Black/Red";
        helmet6.size = "Large";
        helmet6.price = 249.99;
        helmet6.isFullFace = true;
        helmet6.displayInfo();
        System.out.println(helmet6.brand + "\n" + helmet6.model + "\n" + helmet6.color + "\n" + helmet6.size + "\n" + helmet6.price + "\n" + (helmet6.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet7 = new Helmet();
        helmet7.brand = "LS2";
        helmet7.model = "Strobe";
        helmet7.color = "White";
        helmet7.size = "Medium";
        helmet7.price = 179.99;
        helmet7.isFullFace = true;
        helmet7.displayInfo();
        System.out.println(helmet7.brand + "\n" + helmet7.model + "\n" + helmet7.color + "\n" + helmet7.size + "\n" + helmet7.price + "\n" + (helmet7.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet8 = new Helmet();
        helmet8.brand = "Arai";
        helmet8.model = "Quantum-X";
        helmet8.color = "Red";
        helmet8.size = "Large";
        helmet8.price = 749.99;
        helmet8.isFullFace = true;
        helmet8.displayInfo();
        System.out.println(helmet8.brand + "\n" + helmet8.model + "\n" + helmet8.color + "\n" + helmet8.size + "\n" + helmet8.price + "\n" + (helmet8.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet9 = new Helmet();
        helmet9.brand = "Icon";
        helmet9.model = "Airflite";
        helmet9.color = "Green";
        helmet9.size = "Small";
        helmet9.price = 249.99;
        helmet9.isFullFace = true;
        helmet9.displayInfo();
        System.out.println(helmet9.brand + "\n" + helmet9.model + "\n" + helmet9.color + "\n" + helmet9.size + "\n" + helmet9.price + "\n" + (helmet9.isFullFace ? "Full Face" : "Not Full Face"));

        Helmet helmet10 = new Helmet();
        helmet10.brand = "Fly Racing";
        helmet10.model = "F2 Carbon MIPS";
        helmet10.color = "Orange/Blue";
        helmet10.size = "Medium";
        helmet10.price = 299.99;
        helmet10.isFullFace = true;
        helmet10.displayInfo();
        System.out.println(helmet10.brand + "\n" + helmet10.model + "\n" + helmet10.color + "\n" + helmet10.size + "\n" + helmet10.price + "\n" + (helmet10.isFullFace ? "Full Face" : "Not Full Face"));
    }
}