public class Main {
    public static void main(String[] args) throws Exception {
        
        // Abstract
        // Car c = new Car();
        // c.CarType();

        //Concrete
        Cor = new Corolla();
        Civ = new Civic();

        Cor.CarType();
        Civ.CarType();

        Cor.SetMake("Toyota");
        Civ.SetMake("Honda");

        Cor.ShowCarMake();
        Civ.ShowCarMake();
    }
}
