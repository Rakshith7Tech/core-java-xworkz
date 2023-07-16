class SatelliteTester {
    public static void main(String s[]){
        Satellite satellite1 = new Satellite();
        satellite1.name = "Hubble Space Telescope";
        satellite1.launchYear = 1990;
        satellite1.orbitType = "Low Earth Orbit";
        satellite1.mass = 11_110; // in kilograms
        satellite1.displayInfo();
        System.out.println(satellite1.name + "\n" + satellite1.launchYear + "\n" + satellite1.orbitType + "\n" + satellite1.mass);

        Satellite satellite2 = new Satellite();
        satellite2.name = "International Space Station";
        satellite2.launchYear = 1998;
        satellite2.orbitType = "Low Earth Orbit";
        satellite2.mass = 419_725; // in kilograms
        satellite2.displayInfo();
        System.out.println(satellite2.name + "\n" + satellite2.launchYear + "\n" + satellite2.orbitType + "\n" + satellite2.mass);

        Satellite satellite3 = new Satellite();
        satellite3.name = "GPS Satellite";
        satellite3.launchYear = 1978;
        satellite3.orbitType = "Medium Earth Orbit";
        satellite3.mass = 1_764; // in kilograms
        satellite3.displayInfo();
        System.out.println(satellite3.name + "\n" + satellite3.launchYear + "\n" + satellite3.orbitType + "\n" + satellite3.mass);

        Satellite satellite4 = new Satellite();
        satellite4.name = "Weather Satellite";
        satellite4.launchYear = 1960;
        satellite4.orbitType = "Polar Orbit";
        satellite4.mass = 2_000; // in kilograms
        satellite4.displayInfo();
        System.out.println(satellite4.name + "\n" + satellite4.launchYear + "\n" + satellite4.orbitType + "\n" + satellite4.mass);

        Satellite satellite5 = new Satellite();
        satellite5.name = "Communications Satellite";
        satellite5.launchYear = 1963;
        satellite5.orbitType = "Geostationary Orbit";
        satellite5.mass = 2_200; // in kilograms
        satellite5.displayInfo();
        System.out.println(satellite5.name + "\n" + satellite5.launchYear + "\n" + satellite5.orbitType + "\n" + satellite5.mass);

        Satellite satellite6 = new Satellite();
        satellite6.name = "Spy Satellite";
        satellite6.launchYear = 2001;
        satellite6.orbitType = "Sun-Synchronous Orbit";
        satellite6.mass = 1_500; // in kilograms
        satellite6.displayInfo();
        System.out.println(satellite6.name + "\n" + satellite6.launchYear + "\n" + satellite6.orbitType + "\n" + satellite6.mass);

        Satellite satellite7 = new Satellite();
        satellite7.name = "Navigation Satellite";
        satellite7.launchYear = 1989;
        satellite7.orbitType = "Molniya Orbit";
        satellite7.mass = 1_200; // in kilograms
        satellite7.displayInfo();
        System.out.println(satellite7.name + "\n" + satellite7.launchYear + "\n" + satellite7.orbitType + "\n" + satellite7.mass);

        Satellite satellite8 = new Satellite();
        satellite8.name = "Earth Observation Satellite";
        satellite8.launchYear = 2007;
        satellite8.orbitType = "Sun-Synchronous Orbit";
        satellite8.mass = 800; // in kilograms
        satellite8.displayInfo();
        System.out.println(satellite8.name + "\n" + satellite8.launchYear + "\n" + satellite8.orbitType + "\n" + satellite8.mass);

        Satellite satellite9 = new Satellite();
        satellite9.name = "Space Science Satellite";
        satellite9.launchYear = 2015;
        satellite9.orbitType = "Polar Orbit";
        satellite9.mass = 500; // in kilograms
        satellite9.displayInfo();
        System.out.println(satellite9.name + "\n" + satellite9.launchYear + "\n" + satellite9.orbitType + "\n" + satellite9.mass);

        Satellite satellite10 = new Satellite();
        satellite10.name = "Satellite Internet";
        satellite10.launchYear = 2020;
        satellite10.orbitType = "Low Earth Orbit";
        satellite10.mass = 1_000; // in kilograms
        satellite10.displayInfo();
        System.out.println(satellite10.name + "\n" + satellite10.launchYear + "\n" + satellite10.orbitType + "\n" + satellite10.mass);
    }
}