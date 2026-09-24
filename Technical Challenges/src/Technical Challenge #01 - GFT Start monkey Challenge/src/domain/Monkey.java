package Challenge001.src.domain;

public class Monkey {
    private String name;
    private String stomach[] = new String[3];

    public Monkey(String name){
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null ||name.trim().isEmpty()){
            System.out.println(" This name is not empty");
            return;
        }
        this.name = name;
    }


    public void eatFood(String food) {

        boolean foodAdded = false;

        for (int i = 0; i < stomach.length; i++) {

            if (stomach[i] == null) {
                stomach[i] = food;
                foodAdded = true;
                break;
            }
        }

        if (!foodAdded) {
            System.out.println("Estômago cheio");
        }
    }
    public void viewStomach(){
        for (int i = 0; i <stomach.length; i++ ){
            System.out.println(stomach[i]);
        }
    }
    public void digestFood() {
        for (int i = 0; i < stomach.length; i++) {
            if (stomach[i] != null) {
                stomach[i] = null;
            }
        }
        System.out.println("monkey its a Digesting");
    }
}
