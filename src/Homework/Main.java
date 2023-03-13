package Homework;

public class Main {
    public static void main(String[] args){

        Car car = new Car();
        System.out.println(" Colour :"+car.getColour());
        System.out.println(" Model :" +car.getModel());
        System.out.println(" Production Date :"+car.getProductionDate());
        car.drive();
        car.stop();

        Track track = new Track();
        System.out.println(" Load Capacity :"+track.loadCapacity);

        PassengerCar passengerCar = new PassengerCar();
        System.out.println(" Number of Seats :"+passengerCar.numberOfSeats);

        /*Colour :Black
 Model :Track
 Production Date :2020
 Load Capacity :3
 Number of Seats :5
*/
    }
}
