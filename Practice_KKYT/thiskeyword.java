
  class Teacher{

    // String myname;
     String myname = "this is belongs to the teacher main function";

     Teacher()
    {
        myname = "Hello";
        System.out.print("i am a constructor \n");
        System.out.print(myname);
    }

    String setmark(String myname){
        this.myname=myname;

        return myname;
    }
   //System.out.print(myname);
}





public class thiskeyword {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        // t1.setmark("Navin");
        System.out.print( t1.setmark("Navin"));
        System.out.print( t1.myname);

        
    }
    
}
