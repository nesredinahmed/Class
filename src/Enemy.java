import java.util.Scanner;

public class Enemy {
    int level;
    String name;

    public void Talk(){
        System.out.println("I want To Kill You");
    }
    public void Input (){
        Scanner scan = new Scanner(System.in);
        System.out.println("What You Going To Do?");
        String answer = scan.nextLine();
        System.out.println("Nice Try");


    }
    public void Respons (){
        System.out.println("Do Not Kill Me!");
    }

}
