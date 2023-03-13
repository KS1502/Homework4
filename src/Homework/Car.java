package Homework;

public class Car {
  private  String model = "Track";
   private String colour = "Black";
   private  int productionDate = 2020;

   protected void setModel(String model){
       this.model = model;
   }
   protected String getModel(){
       return model;
   }
   protected void setColour(String colour){
       this.colour=colour;
   }
   protected String getColour(){
       return colour;
   }
   protected void setProductionDate(int productionDate){
       this.productionDate =productionDate;
   }
   protected int getProductionDate(){
       return productionDate;
   }
   public void drive(){
   }
   public void stop(){

   }

}
/*Создать класс Car, содержащий поля
        model
        colour
        productionDate
        а также конструктор и методы drive и stop.
        Создать дочерние классы PassengerCar и Track. Класс PassengerCar должен также содержать
        поле numberOfSeats(количество мест) а Класс Track поле loadCapacity (грузоподьемность).

        В методе main класса Main создать несколько обьектов этих классов и вывести в консоль их
        характеристики и результат работы методов*/
