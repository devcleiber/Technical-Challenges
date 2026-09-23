package Challenge04.src;

import Challenge04.src.domain.GameClass;

public class Technical04 {
    public static void main(String[] args) {
        GameClass person1 = new GameClass("Peter-Parker(Otto)","9970157" , "spspdm@gmail.com", "Superior-Spiderman", "Os Vingadores");
        person1.displayinfo();

        GameClass person2 = new GameClass("Bruce Wayne", "Death-Red ", "dfthrd@hotmail.com");
        person2.setPhone("135798");
        person2.setGuild("A Liga da Justiça");
        person2.displayinfo();

        GameClass personerror = new GameClass(" ", "0", " ", " ", "The 7");
        personerror.displayinfo();

    }
}
