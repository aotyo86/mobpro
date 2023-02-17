public class Main {
    public static void main(String[] args) {
        Chatbot bot1 = new Chatbot();
        bot1.greeting();
        Chatbot bot2 = new Chatbot("iraiza");
        bot2.greeting();
        bot2.setName("osiris");
        bot2.greeting();
        bot2.setName("差別用語");
        bot2.greeting();
        bot2.setName("mark");
        bot2.greeting();
    }
}
