import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> chatbot = new HashMap<>();

        // Knowledge Base
        chatbot.put("hi", "Hello! How can I help you?");
        chatbot.put("hello", "Hi! Nice to meet you.");
        chatbot.put("java", "Java is an Object-Oriented Programming Language.");
        chatbot.put("oop", "OOP stands for Object-Oriented Programming.");
        chatbot.put("inheritance", "Inheritance allows one class to inherit another.");
        chatbot.put("polymorphism", "Polymorphism means one interface with many implementations.");
        chatbot.put("abstraction", "Abstraction hides implementation details.");
        chatbot.put("encapsulation", "Encapsulation hides data.");
        chatbot.put("internship", "Internship provides industrial experience.");
        chatbot.put("company", "Horizon Tech is an IT company.");
        chatbot.put("bye", "Goodbye! Have a nice day.");

        System.out.println("====================================");
        System.out.println("      AI CHATBOT");
        System.out.println("====================================");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            boolean found = false;

            for (String key : chatbot.keySet()) {

                if (input.contains(key)) {

                    System.out.println("Bot: " + chatbot.get(key));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Bot: Sorry, I don't understand that.");
            }

        }

        sc.close();
    }
}