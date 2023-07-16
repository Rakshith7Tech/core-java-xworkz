class PrinterTester {
    public static void main(String p[]){
        Printer printer1 = new Printer();
        printer1.brand = "Epson";
        printer1.model = "XP-4100";
        printer1.color = "Black";
        printer1.price = 99.99;
        printer1.printingTechnology = "Inkjet";
        printer1.isWireless = true;
        printer1.displayInfo();
        System.out.println(printer1.brand + "\n" + printer1.model + "\n" + printer1.color + "\n" + printer1.price + "\n" + printer1.printingTechnology + "\n" + (printer1.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer2 = new Printer();
        printer2.brand = "HP";
        printer2.model = "OfficeJet Pro 6978";
        printer2.color = "White";
        printer2.price = 129.99;
        printer2.printingTechnology = "Inkjet";
        printer2.isWireless = true;
        printer2.displayInfo();
        System.out.println(printer2.brand + "\n" + printer2.model + "\n" + printer2.color + "\n" + printer2.price + "\n" + printer2.printingTechnology + "\n" + (printer2.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer3 = new Printer();
        printer3.brand = "Canon";
        printer3.model = "PIXMA TR4520";
        printer3.color = "Black";
        printer3.price = 69.99;
        printer3.printingTechnology = "Inkjet";
        printer3.isWireless = true;
        printer3.displayInfo();
        System.out.println(printer3.brand + "\n" + printer3.model + "\n" + printer3.color + "\n" + printer3.price + "\n" + printer3.printingTechnology + "\n" + (printer3.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer4 = new Printer();
        printer4.brand = "Brother";
        printer4.model = "HL-L2380DW";
        printer4.color = "Black";
        printer4.price = 169.99;
        printer4.printingTechnology = "Laser";
        printer4.isWireless = true;
        printer4.displayInfo();
        System.out.println(printer4.brand + "\n" + printer4.model + "\n" + printer4.color + "\n" + printer4.price + "\n" + printer4.printingTechnology + "\n" + (printer4.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer5 = new Printer();
        printer5.brand = "Xerox";
        printer5.model = "VersaLink B400";
        printer5.color = "White";
        printer5.price = 699.99;
        printer5.printingTechnology = "Laser";
        printer5.isWireless = true;
        printer5.displayInfo();
        System.out.println(printer5.brand + "\n" + printer5.model + "\n" + printer5.color + "\n" + printer5.price + "\n" + printer5.printingTechnology + "\n" + (printer5.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer6 = new Printer();
        printer6.brand = "Samsung";
        printer6.model = "SL-M2020W";
        printer6.color = "Gray";
        printer6.price = 79.99;
        printer6.printingTechnology = "Laser";
        printer6.isWireless = true;
        printer6.displayInfo();
        System.out.println(printer6.brand + "\n" + printer6.model + "\n" + printer6.color + "\n" + printer6.price + "\n" + printer6.printingTechnology + "\n" + (printer6.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer7 = new Printer();
        printer7.brand = "Lexmark";
        printer7.model = "B2338dw";
        printer7.color = "Black";
        printer7.price = 199.99;
        printer7.printingTechnology = "Laser";
        printer7.isWireless = true;
        printer7.displayInfo();
        System.out.println(printer7.brand + "\n" + printer7.model + "\n" + printer7.color + "\n" + printer7.price + "\n" + printer7.printingTechnology + "\n" + (printer7.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer8 = new Printer();
        printer8.brand = "Dell";
        printer8.model = "E310dw";
        printer8.color = "Black";
        printer8.price = 129.99;
        printer8.printingTechnology = "Laser";
        printer8.isWireless = true;
        printer8.displayInfo();
        System.out.println(printer8.brand + "\n" + printer8.model + "\n" + printer8.color + "\n" + printer8.price + "\n" + printer8.printingTechnology + "\n" + (printer8.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer9 = new Printer();
        printer9.brand = "Ricoh";
        printer9.model = "SP C261SFNw";
        printer9.color = "White";
        printer9.price = 329.99;
        printer9.printingTechnology = "Laser";
        printer9.isWireless = true;
        printer9.displayInfo();
        System.out.println(printer9.brand + "\n" + printer9.model + "\n" + printer9.color + "\n" + printer9.price + "\n" + printer9.printingTechnology + "\n" + (printer9.isWireless ? "Wireless" : "Not Wireless"));

        Printer printer10 = new Printer();
        printer10.brand = "Kodak";
        printer10.model = "Verite 65 Plus";
        printer10.color = "Black";
        printer10.price = 149.99;
        printer10.printingTechnology = "Inkjet";
        printer10.isWireless = true;
        printer10.displayInfo();
        System.out.println(printer10.brand + "\n" + printer10.model + "\n" + printer10.color + "\n" + printer10.price + "\n" + printer10.printingTechnology + "\n" + (printer10.isWireless ? "Wireless" : "Not Wireless"));
    }
}