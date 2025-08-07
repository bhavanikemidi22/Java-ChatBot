package chatbot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (input.equalsIgnoreCase("hello")) {
            System.out.println("Hi! How can I help you?");
        } else {
            System.out.println("I don't understand that.");
        }

        scanner.close();
    }
}

