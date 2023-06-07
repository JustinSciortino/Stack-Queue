//Justin Sciortino 40247931 Individual Question 1 and 2

//Main.java is the driver file for both Ass1_Q1 and Ass1_Q2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Ass1_Q1 arr = new Ass1_Q1();

        Scanner scanner = new Scanner(System.in);

        //Question 1 Code
        System.out.println("Question 1 Program:\n");
        arr.enqueue(-5);
        arr.enqueue(-1);
        arr.enqueue(0);
        arr.enqueue(2);
        arr.getMin();

        arr.dequeue();
        arr.getMin();
        arr.dequeue();
        arr.getMin();
        arr.dequeue();
        arr.getMin();
        arr.dequeue();
        arr.getMin();

        System.out.println("Question 2 Program:\n");
        int option = 0;
        while(option != 2){
            System.out.println("(1) - Enter a string, (2) - Exit");
            System.out.print("Enter a number: ");
            option = scanner.nextInt();
            if(option == 1){
                System.out.print("Enter a string: ");
                String brackets = scanner.next();
                boolean isBal = Ass1_Q2.Balanced(brackets);

                if(isBal){
                    System.out.println("Balanced");
                }else{
                    System.out.println("Not balanced");
                }
            }
            if(option == 2){
                System.out.println("Exiting Question 2...");
            }
        }
    }
}
