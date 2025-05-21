class Animal
{
    int value = 245;
    Animal(String name)
    {
    System.out.println(name);
    }
    
    void sub()
    {
        System.out.println("this is from parent class method");
    }
}

class Dog extends Animal
{
   Dog()
   {
    super("Kavin");  //super keyword is used to call to parent class constructor from the child class.
    super.sub();  // we can acces the parent class functions.
    System.out.print("child class \n");
    System.out.println(super.value); //we can acces the parent class values.
   }
}





public class superkeyword {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        
    }
}
