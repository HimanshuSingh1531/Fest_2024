import java.util.Scanner;

public class chatbot {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Hello! I'm Chatbot. How can I assist you today?");
        
        // Simulating chat loop
        while (true) {
            System.out.print("You: ");
            input = scanner.nextLine();

            // Exit the chat
            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Simulate response based on input
            String response = generateResponse(input);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

    // Basic logic to simulate responses
    public static String generateResponse(String input) {
        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        } else if (input.contains("how are you")) {
            return "I'm just a program, but thanks for asking! How about you?";
        } else if (input.contains("name")) {
            return "I am your friendly Chatbot!";
        } else if (input.contains("java")) {
            return "Java is a versatile programming language. Do you have any specific questions?";
        } else {
            return "Sorry, I didn't understand that. Can you please rephrase?";
        }
    }
}
