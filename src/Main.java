public class Main {
    public static void main(String args[]) {
        House house = new House.HouseBuilder()
                //Ustawiamy pola które potrzebujemy za pomocą odpowiednich metod z klasy HouseBuilder w bardzo przejrzysty sposób
                .buildDoors("drzwi")
                .buildFloors("podłogi")
                .buildWalls("ściany")
                .buildRoof("dach")
                //Na koniec wywołujemy metodę build() by zwrócić obiekt typu House.
                .build();

        System.out.println(house);
    }
}
