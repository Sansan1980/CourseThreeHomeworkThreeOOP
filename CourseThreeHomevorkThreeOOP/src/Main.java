public class Main {
    public static void main(String[] args) {
        Transport bicycle = new Bicycle("Стелс", 2);
        Transport car = new Car("Москвич1", 4);
        Transport truck = new Truck("Вольво", 8);
        Transport[] transports = new Transport[]{bicycle, car, truck};

        ServiceStation serviceStation = new ServiceStation();
        for (Transport t : transports) {
            if (t != null) {
                serviceStation.check(t);
            }
        }
    }
    //--//--//--//--//
}


