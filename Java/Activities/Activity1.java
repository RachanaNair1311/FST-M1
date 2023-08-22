package Activities;

public class Activity1 {
    public static void main (String[] args)
    {
        Car Hyundai = new Car();
        Hyundai.Make = 2023;
        Hyundai.Color = "Black";
        Hyundai.Transmission = "Manual";

        //calling methods in Car
        Hyundai.DisplayCharacteristics();
        Hyundai.accelerate();
        Hyundai.Brake();
    }

    public static class Car {
        String Color;
        String Transmission;
        int Make;
        int Tyres;
        int Doors;

        //Constructor
        public Car() {
            int Tyres = 4;
            int Doors = 4;

        }

        public void DisplayCharacteristics() {
            System.out.println("Make of the Car :" + Make);
            System.out.println("Color of the Car :" + Color);
            System.out.println("Transmission of the Car :" + Transmission);
            System.out.println("Tyres of the Car :" + Tyres);
            System.out.println("Doors of the Car :" + Doors);
        }

        //Accelerate
        public void accelerate() {
            System.out.println("Car is moving forward");
        }

        //Brake
        public void Brake() {
            System.out.println("Car has stopped");
        }
    }
}
