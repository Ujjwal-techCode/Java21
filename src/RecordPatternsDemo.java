public class RecordPatternsDemo {

    public sealed interface Vehicle permits Car, Truck {
        String registrationNumber();
    }

    public record Car(String name, String registrationNumber) implements Vehicle {
        @Override
        public String registrationNumber() {
            return registrationNumber;
        }

        public String name() {
            return name;
        }
    }

    public record Truck(String name, String registrationNumber) implements Vehicle {
        @Override
        public String registrationNumber() {
            return registrationNumber;
        }

        public String name() {
            return name;
        }
    }

    public record FourWheeler(Car car, Truck truck){}

    public static void main(String args[]) {
        //Vehicle vehicle = new Car("Ciaz","KA520623");
        //Object vehicle = new Car("Ciaz","KA520623");
        Object vehicle = new FourWheeler(new Car("Ciaz","KA520623"), new Truck("Tata", "Ka234567"));

        switch(vehicle) {
            case Car(String s1, String s2)  -> System.out.println("Sedan");
            case null -> System.out.println("value is null");
            case Truck(String s3, String s4) -> System.out.println("Pickup");
            case FourWheeler(Car(String s1, String s2), Truck(String s3, String s4)) -> System.out.println(s1+s2+s3+s4);
            case Object s -> System.out.println(s);
        }

        //Nested Record Patter Matching, Simple record pattern matching is similar and more easier than this.
        if(vehicle instanceof FourWheeler(Car(String s1, String s2), Truck(String s3, String s4))){
            System.out.println(s1+s2+s3+s4);
        }
    }
}
