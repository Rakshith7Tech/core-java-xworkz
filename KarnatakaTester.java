class KarnatakaTester{
public static void main(String city[]){

Karnataka.addCity("Bangalore");
Karnataka.addCity("Haveri");
Karnataka.addCity("Dharwad");
Karnataka.addCity("Mysore");
Karnataka.addCity("Davanagere");
Karnataka.addCity("Hubballi");
Karnataka.addCity("Mandya");
Karnataka.getAllCity();
boolean city1=Karnataka.updateCityName("Bangalore","Bengaluru");
boolean city2=Karnataka.updateCityName("Haveri","New Haveri");
boolean city3=Karnataka.updateCityName("Dharwad","New Dharwad");
boolean city4=Karnataka.updateCityName("Mysore","Mysuru");
boolean city5=Karnataka.updateCityName("Hubballi","Hubli");
Karnataka.getAllCity();
Karnataka.deleteCityName("Mysuru");
Karnataka.deleteCityName("Mandya");
Karnataka.getAllCityNamePostDeletetion();
}
}