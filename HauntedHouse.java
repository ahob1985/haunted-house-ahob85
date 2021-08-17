import java.util.Scanner;

/**
 * Write a description of class HauntedHouse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HauntedHouse
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Haunted House");
        System.out.println("By: Hidden Genius");
        System.out.println();
        System.out.println("You are standing in front of a spooky haunted house.");
        System.out.println("You hear what sounds like screaming coming from inside the house.");
        System.out.print("Will you enter the house? (yes or no): ");
        String enterHouse = sc.nextLine();
        if(enterHouse == "y" || enterHouse == "yes") {
            System.out.println("You nervously and very slowly approach the door...");
            System.out.println("You open the door and immediately see a ghost!");
            System.out.print("Will you punch the ghost? (yes or no): ");
            String punchGhost = sc.nextLine();
            if(punchGhost == "y" || punchGhost == "yes") {
                // your code here

            } else {
                // your code here

            }
        } else {
            System.out.println("You decide you'd rather go home. The house is too spooky.");
            System.out.println("However, as you turn to leave...");
            System.out.println("...you hear the door swing open behind you!");
            System.out.print("Will you run away? (yes or no): ");
            String run = sc.nextLine();
            if(run == "y" || run == "yes") {
                // your code here

            } else {
                // your code here 

            }
        }
        System.out.println("Thank you for playing!");
    }
}
