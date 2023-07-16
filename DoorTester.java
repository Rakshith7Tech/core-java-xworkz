class DoorTester {
    public static void main(String d[]){
        Door door1 = new Door();
        door1.material = "Wood";
        door1.color = "Brown";
        door1.width = 36;
        door1.height = 80;
        door1.isOpen = false;
        door1.displayInfo();
        System.out.println(door1.material + "\n" + door1.color + "\n" + door1.width + " inches\n" + door1.height + " inches\n" + (door1.isOpen ? "Open" : "Closed"));

        Door door2 = new Door();
        door2.material = "Metal";
        door2.color = "White";
        door2.width = 32;
        door2.height = 78;
        door2.isOpen = true;
        door2.displayInfo();
        System.out.println(door2.material + "\n" + door2.color + "\n" + door2.width + " inches\n" + door2.height + " inches\n" + (door2.isOpen ? "Open" : "Closed"));

        Door door3 = new Door();
        door3.material = "Fiberglass";
        door3.color = "Black";
        door3.width = 30;
        door3.height = 80;
        door3.isOpen = false;
        door3.displayInfo();
        System.out.println(door3.material + "\n" + door3.color + "\n" + door3.width + " inches\n" + door3.height + " inches\n" + (door3.isOpen ? "Open" : "Closed"));

        Door door4 = new Door();
        door4.material = "Glass";
        door4.color = "Clear";
        door4.width = 28;
        door4.height = 72;
        door4.isOpen = true;
        door4.displayInfo();
        System.out.println(door4.material + "\n" + door4.color + "\n" + door4.width + " inches\n" + door4.height + " inches\n" + (door4.isOpen ? "Open" : "Closed"));

        Door door5 = new Door();
        door5.material = "Steel";
        door5.color = "Gray";
        door5.width = 36;
        door5.height = 80;
        door5.isOpen = false;
        door5.displayInfo();
        System.out.println(door5.material + "\n" + door5.color + "\n" + door5.width + " inches\n" + door5.height + " inches\n" + (door5.isOpen ? "Open" : "Closed"));

        Door door6 = new Door();
        door6.material = "Aluminum";
        door6.color = "Silver";
        door6.width = 34;
        door6.height = 82;
        door6.isOpen = true;
        door6.displayInfo();
        System.out.println(door6.material + "\n" + door6.color + "\n" + door6.width + " inches\n" + door6.height + " inches\n" + (door6.isOpen ? "Open" : "Closed"));

        Door door7 = new Door();
        door7.material = "PVC";
        door7.color = "White";
        door7.width = 32;
        door7.height = 80;
        door7.isOpen = false;
        door7.displayInfo();
        System.out.println(door7.material + "\n" + door7.color + "\n" + door7.width + " inches\n" + door7.height + " inches\n" + (door7.isOpen ? "Open" : "Closed"));

        Door door8 = new Door();
        door8.material = "Composite";
        door8.color = "Brown";
        door8.width = 36;
        door8.height = 80;
        door8.isOpen = true;
        door8.displayInfo();
        System.out.println(door8.material + "\n" + door8.color + "\n" + door8.width + " inches\n" + door8.height + " inches\n" + (door8.isOpen ? "Open" : "Closed"));

        Door door9 = new Door();
        door9.material = "UPVC";
        door9.color = "White";
        door9.width = 30;
        door9.height = 78;
        door9.isOpen = false;
        door9.displayInfo();
        System.out.println(door9.material + "\n" + door9.color + "\n" + door9.width + " inches\n" + door9.height + " inches\n" + (door9.isOpen ? "Open" : "Closed"));

        Door door10 = new Door();
        door10.material = "Glass";
        door10.color = "Frosted";
        door10.width = 28;
        door10.height = 72;
        door10.isOpen = true;
        door10.displayInfo();
        System.out.println(door10.material + "\n" + door10.color + "\n" + door10.width + " inches\n" + door10.height + " inches\n" + (door10.isOpen ? "Open" : "Closed"));
    }
}