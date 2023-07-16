class MusicalInstrumentsTester {
    public static void main(String m[]){
        MusicalInstruments instrument1 = new MusicalInstruments();
        instrument1.name = "Acoustic Guitar";
        instrument1.brand = "Fender";
        instrument1.type = "String";
        instrument1.price = 200.00;
        instrument1.playSound();
        System.out.println(instrument1.name + "\n" + instrument1.brand + "\n" + instrument1.type + "\n" + instrument1.price);

        MusicalInstruments instrument2 = new MusicalInstruments();
        instrument2.name = "Electric Guitar";
        instrument2.brand = "Gibson";
        instrument2.type = "String";
        instrument2.price = 500.00;
        instrument2.playSound();
        System.out.println(instrument2.name + "\n" + instrument2.brand + "\n" + instrument2.type + "\n" + instrument2.price);

        MusicalInstruments instrument3 = new MusicalInstruments();
        instrument3.name = "Piano";
        instrument3.brand = "Steinway & Sons";
        instrument3.type = "Keyboard";
        instrument3.price = 3000.00;
        instrument3.playSound();
        System.out.println(instrument3.name + "\n" + instrument3.brand + "\n" + instrument3.type + "\n" + instrument3.price);

        MusicalInstruments instrument4 = new MusicalInstruments();
        instrument4.name = "Drums";
        instrument4.brand = "Pearl";
        instrument4.type = "Percussion";
        instrument4.price = 800.00;
        instrument4.playSound();
        System.out.println(instrument4.name + "\n" + instrument4.brand + "\n" + instrument4.type + "\n" + instrument4.price);

        MusicalInstruments instrument5 = new MusicalInstruments();
        instrument5.name = "Violin";
        instrument5.brand = "Stradivarius";
        instrument5.type = "String";
        instrument5.price = 1000.00;
        instrument5.playSound();
        System.out.println(instrument5.name + "\n" + instrument5.brand + "\n" + instrument5.type + "\n" + instrument5.price);

        MusicalInstruments instrument6 = new MusicalInstruments();
        instrument6.name = "Saxophone";
        instrument6.brand = "Yamaha";
        instrument6.type = "Woodwind";
        instrument6.price = 1500.00;
        instrument6.playSound();
        System.out.println(instrument6.name + "\n" + instrument6.brand + "\n" + instrument6.type + "\n" + instrument6.price);

        MusicalInstruments instrument7 = new MusicalInstruments();
        instrument7.name = "Trumpet";
        instrument7.brand = "Bach";
        instrument7.type = "Brass";
        instrument7.price = 800.00;
        instrument7.playSound();
        System.out.println(instrument7.name + "\n" + instrument7.brand + "\n" + instrument7.type + "\n" + instrument7.price);

        MusicalInstruments instrument8 = new MusicalInstruments();
        instrument8.name = "Flute";
        instrument8.brand = "Muramatsu";
        instrument8.type = "Woodwind";
        instrument8.price = 1200.00;
        instrument8.playSound();
        System.out.println(instrument8.name + "\n" + instrument8.brand + "\n" + instrument8.type + "\n" + instrument8.price);

        MusicalInstruments instrument9 = new MusicalInstruments();
        instrument9.name = "Cello";
        instrument9.brand = "Stradivarius";
        instrument9.type = "String";
        instrument9.price = 2500.00;
        instrument9.playSound();
        System.out.println(instrument9.name + "\n" + instrument9.brand + "\n" + instrument9.type + "\n" + instrument9.price);

        MusicalInstruments instrument10 = new MusicalInstruments();
        instrument10.name = "Drum Set";
        instrument10.brand = "Tama";
        instrument10.type = "Percussion";
        instrument10.price = 1200.00;
        instrument10.playSound();
        System.out.println(instrument10.name + "\n" + instrument10.brand + "\n" + instrument10.type + "\n" + instrument10.price);

    }
}