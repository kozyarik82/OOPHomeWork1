import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1987,"Максим","Минск","бренд-менеджер");
        Human anna = new Human(1993,"Аня","Москва",  "методист образовательных программ");
        Human kate = new Human(1994,"Катя", "Калининград",  "продакт-менеджер");
        Human artyom = new Human(1995,"Артем", "Москва",  "директор по развитию бизнеса");

        maksim.greetings();
        anna.greetings();
        kate.greetings();
        artyom.greetings();



    }
}
