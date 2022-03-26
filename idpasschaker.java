import java.util.Scanner;

public class idpasschaker{
    // this program is chaking user id and password 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to user id and password chaker");
        boolean userid = true;

        System.out.print("Enter Your User Name: ");
        while(userid){
            String newuser = sc.nextLine();
            if(newuser.equals("vivekkathrotiya")){
                System.out.print("Enter password: ");
                userid = false;
            }
            else{
                System.out.println("Invalid Username");
            }
        }

        boolean userpassword = true;
        while(userpassword){
            String newpassword = sc.nextLine();
            if(newpassword.equals("vivek911")){
                System.out.println("Welcome to the app");
                userpassword = false;
            }
            else{
                System.out.println("Invalid Password");
            } 
        }
    }

    
    
}
