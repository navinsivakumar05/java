// class Hello
// {
//     public static void main(String[] args) {
//         // for(int i=0;i<1000;i++)
//         {  
//             System.out.println("Hello world");
//             String name ="navin";
//             System.out.println(name.toUpperCase());
//     }
      
// }
// }
// import java.util.Scanner;
 
// public class Test { 
//     public static void main(String[] args) { 
//       Scanner sc = new Scanner(System.in); 
//       System.out.print("Enter a string: "); 
//       String input = sc.nextLine(); 
//       char ch; 
//       String nstr = ""; 
//       for (int i = 0; i < input.length(); i++) { 
//            ch = input.charAt(i); 
//            nstr = ch + nstr; 
//         } 
            
//     }
// }
import java.util.Scanner;
  
public class Main { 
    public static void main(String[] args) { 
    System.out.println("Enter the String"); 
    Scanner sc = new Scanner(System.in); 
    String s = sc.nextLine(); 
    int count = 1; 
    for (int i = 0; i < s.length() - 1; i++) { 
    if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) { 
    count++; 
    } 
    } 
    System.out.println("Number of words in a string: " +);   } 
    } 