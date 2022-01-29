
import java.util.Scanner;

public class Login {
    
    public static String username;
    public static String password;
    
    public static void main(String [] args) {
        register();
        Login();
    }public static void register(){
            
            System.out.println("----------------Regiter-----------------");
        
        Scanner str = new Scanner(System.in);
        
        
        while(true) {
            
            System.out.print("Enter Username : ");
         username = str.nextLine();
        
        System.out.print("Enter password : ");
         password = str.nextLine();
            
            if (username.contains(" ") || password.contains(" "))
        {
          System.out.println("----------------------------");
                System.out.println("Input again.");
                System.out.println("----------------------------");
                break;
        }
     
            if (username.length() >= 5 && password.length() == 9)
            {
                System.out.println("----------------------------------");
                System.out.println("register success!");
                System.out.println("----------------------------------");
               break;
            }
            else
            {
                System.out.println("----------------------------------");
                System.out.println("Fail!!!!!!");
                System.out.println("your username should be 5 or more character.");
                System.out.println("your password should be 9 character.");
                System.out.println("----------------------------------");
            }
    }
  
}
        
        
        public static void Login(){
            
            System.out.println("--------------Login----------------");
            
            Scanner str = new Scanner(System.in);
            
            while (true)
            {
                System.out.print("Enter username : ");
                String user = str.nextLine();
                
                System.out.print("Enter password : ");
                String pass = str.nextLine();
                
                 if (user.contains(" ") || pass.contains(" "))
                 {
                System.out.println("----------------------------");
                System.out.println("Invalid username and password.");
                System.out.println("----------------------------");
                break;   
            }
                 if (user.equals(username) && pass.equals(password))
                 {
                System.out.println("----------------------------------");
                System.out.println("Hi " + user);
                System.out.println("welcome to String class.");
                System.out.println("----------------------------------");
                break;
                 }
                 else
                 {
                     System.out.println("----------------------------");
                    System.out.println("Invalid username and password.");
                    System.out.println("----------------------------");
                 }
        }
  }
}
