package Challenge02.src;
import Challenge02.src.domain.Employeer;

public class TechChallenge02 {
    public static void main(String[] args[]) {
        Employeer employeer = new Employeer("Gabriel", 25, 5000.0, "Developer");
        employeer.displayInfo();
        Employeer employer2 = new Employeer("Maria","Designer");
        employer2.displayInfo();
        Employeer employeer3 = new Employeer("Jean", 16, -900.0,""); // Invalid data test
        employeer3.displayInfo();

        employeer.addedAmount(20);
        employeer.displayInfo();

        employeer3.getAge();

        boolean isAdult = employeer3.isAdult();
        System.out.println("Is Jean an adult? " + isAdult);

        employeer3.setFunction("Engineer");
        employeer3.displayInfo();
    }
}
