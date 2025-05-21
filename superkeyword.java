class Animal
{
    Animal(String name)
    {
    System.out.println(name);
    }
 
}

class Dog extends Animal
{
   Dog()
   {
    super("Kavin");  //super keyword is used to call to parent class constructor from the child class.
    System.out.print("child class");
   }
}





public class superkeyword {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        
    }
}
