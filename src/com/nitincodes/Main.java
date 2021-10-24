package com.nitincodes;

public class Main {
    /* create a class having properties manufacturer and price. create three instances of the class and display
    the details of the car which is the most expensive:
     */
    public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();
    car1.price = 2000000;
    car2.price = 1000000;
    car3.price = 1500000;
    car1.manufacturer = "BMW";
    car2.manufacturer = "AUDI";
    car3.manufacturer = "HONDA";
    if(car1.price> car2.price){
    if(car1.price> car3.price){
        car1.details();
    }
    else{
        car3.details();
    }
    }
    else{
        if(car2.price> car3.price){
            car2.details();
        }
        else{
            car3.details();
        }
    }
    }
}
class Car{
    String manufacturer;
    long price;

    public void details(){
        System.out.println("the cost of "+manufacturer+ " is "+price+" which is the most expensive");
    }
    }

    // this will help you in printing the prices in sorted form
// in a result the output wil be in sorted form and the details will get printed in descending order