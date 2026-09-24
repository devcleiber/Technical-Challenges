package Challenge001.src;
import Challenge001.src.domain.Monkey;

public class Test01 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("Cesar");
        monkey.eatFood("Banana");
        monkey.eatFood("Apple");
        monkey.viewStomach();
        monkey.digestFood();
        monkey.viewStomach();

        Monkey monkey2 = new Monkey("Kong");
        monkey.eatFood("Fruit's");
        monkey.eatFood("Apple");
        monkey.eatFood("Oranges");
        monkey.eatFood("Banana");
    }
}
