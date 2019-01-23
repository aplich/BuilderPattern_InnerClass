public class House {
    public String walls;
    public String floors;
    public String rooms;
    public String roof;
    public String windows;
    public String doors;
    public String garage;

    //Prywatny konstruktor - jeśli ktoś będzie chciał stworzyć instancję klasy House, musi skorzystać z klasy HouseBuilder i jej metod.
    private House(HouseBuilder houseBuilder) {
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;
    }

    public String getWalls() {
        return walls;
    }

    public String getFloors() {
        return floors;
    }

    public String getRooms() {
        return rooms;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindows() {
        return windows;
    }

    public String getDoors() {
        return doors;
    }

    public String getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
    public static class HouseBuilder {
        public String walls;
        public String floors;
        public String rooms;
        public String roof;
        public String windows;
        public String doors;
        public String garage;

        public HouseBuilder buildWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder buildFloors(String floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder buildRooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder buildDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder buildGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
