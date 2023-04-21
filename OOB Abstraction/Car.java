public abstract class Car {

    String CarMake;
    /*
    void CarType(){
        System.out.println("Please Override This method");
    }
     */

    abstract void CarType();
    
    void ShowCarMake(){
        System.out.println("Car Maker: " + CarMake);
    }

    void SetMake(String CarMake){
        this.CarMake = CarMake;
    }
}
