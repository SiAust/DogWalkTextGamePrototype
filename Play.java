import java.util.Scanner;

public class Play {

    private Scanner scanner = new Scanner(System.in);
    private Dog dog = new Dog();

    private OutputLogger outputLogger = new OutputLogger();

    public Play() {

    }

    public void start() {
        outputLogger.printAndLog("and some more");
        System.out.println(
                "It is a pleasent day, you decide to go for a walk with your dog.\nYou love your dog so much you game them the beauiful name ...");
        String name = getUserInput();
        System.out.printf("**%s waggs their tail**", name);
    }

    public String getUserInput() {
        return scanner.nextLine();
    }
}
