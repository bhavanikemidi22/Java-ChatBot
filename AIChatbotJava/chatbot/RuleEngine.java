package chatbot;

public class RuleEngine {
    public static String getResponse(String input) {
        input = input.toLowerCase();
        if (input.contains("hello")) return "Hi there!";
        if (input.contains("how are you")) return "I'm a bot, I'm always good!";
        return "Sorry, I don't understand.";
    }
}
