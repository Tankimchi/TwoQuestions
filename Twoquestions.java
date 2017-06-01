import java.util.Scanner;

public class TwoQuestions {
    public static void main (String[]args) {
        
        Scanner keyboard = new Scanner (System.in);
        
        
        System.out.print("TWO QUESTIONS! ");
        System.out.println();
        System.out.print("\nIs it animal, vegetable, or mineral? ");
        System.out.print("\n> ");
                String answer1 = keyboard.nextLine();
        
        System.out.println();
        System.out.print("\nIs it bigger than a breadbox? ");
        System.out.print("\n> ");
            String answer2 = keyboard.nextLine();
            
            if (answer1.equals("animal") && (answer2.equals("yes"))) {
                    System.out.println("\nMy guess is that you were thinking of a mouse. ");
            }   else if (answer1.equals("animal") && (answer2.equals("no"))) {
                    System.out.println("\nI would ask if i'm right, but I acutally don't care. ");
            }   else if (answer1.equals("vegetable") && (answer2.equals("yes"))) {
                    System.out.println("\nYou're thinking of bell peppers! ");
            }   else if (answer1.equals("vegetable") && (answer2.equals("no"))) {
                    System.out.println("I would ask if i'm right, but I acutally don't care. ");
            }   else if (answer1.equals("mineral") && (answer2.equals("yes"))) {
                    System.out.println("I assume you're thinking of a diamond. ");
            }   else if (answer1.equals("mineral") && (answer2.equals("no"))) {
                    System.out.println("\nI would ask if i'm right, but I acutally don't care. ");
            }
            
      }
}