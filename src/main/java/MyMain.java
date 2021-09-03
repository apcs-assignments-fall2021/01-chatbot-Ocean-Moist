import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey Whats ur name");
        String name = scan.nextLine();
        System.out.println("hello " + name + "\nare you a big baller");
        String answer = scan.nextLine();
        System.out.println(answer + "? I knew it\non a scale of 1-10 how cool are you");
        int answer2 = Integer.parseInt(scan.nextLine());
        System.out.println("Hmm I think you are a " + (answer2 - 1) + "\nIs the creator of this chatbot the best person ever?");
        String answer3 = scan.nextLine();
       /* while (!answer3.toLowerCase().contains("yes")) {
            System.out.println("Wrong Answer! Try again");
            answer3 = scan.nextLine();
        }*/
    }
}