abstract  class vehicle {
    
    abstract void speed();//Only function declarations are happens here the function definitions are given in the all child classes.
    
}

class Bike extends vehicle
{
    void speed()
    {
        System.out.println("the speed of the vehicle is 50km/hr");
    }
}

class Car extends vehicle
{
    void speed()
    {
        System.out.println("the speed of the vehicle is 60 km/hr");
    }
}

// class Lorry extends vehicle{


// }    //without the function definitions no child class will be there if that case it shows error.

public class Abstractclass
{
    public static void main(String[] args) {
        Bike obj1 = new Bike();
        obj1.speed();
    }
}