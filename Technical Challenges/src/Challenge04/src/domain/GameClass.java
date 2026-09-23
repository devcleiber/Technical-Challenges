package Challenge04.src.domain;
public class GameClass{
    private String name;
    private String phone;
    private String email;
    private String nickName;
    private String guild;

    //construtores:
    public GameClass(String name, String phone, String email, String nickName, String guild){ //full construtor
        setName(name);
        setPhone(phone);
        setEmail(email);
        setNickName(nickName);
        setGuild(guild);
    }

    public GameClass(String name, String nickName, String email) { //simple construtor
        setName(name);
        setNickName(nickName);
        setEmail(email);
    }

        //setters and getters:
    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            System.out.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
    if (phone == null || phone.trim().isEmpty() || phone.trim().equals("0") || phone.trim().equals("-0")) {
        System.out.println("Invalid Phone!");
        return;
    }
    this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        if(email == null || email.trim().isEmpty()){
            System.out.println("E-mail cannot be empty");
            return;
        }
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setNickName(String nickName) {
        if(nickName == null || nickName.trim().isEmpty()){
            System.out.println("Nickname cannot be empty");
            return;
        }
        this.nickName = nickName;
    }
    public String getNickName() {
        return nickName;
    }

    public void setGuild(String guild) {
        if (!"Os Vingadores".equals(guild) && !"A Liga da Justiça".equals(guild)) {
            System.out.println("Invalid Class");
            return;
        }
        this.guild = guild;
    }
    public String getGuild() {
        return guild;
    }

    public void displayinfo(){
        System.out.println("Player's info: ");
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.phone);
        System.out.println("Email: " + this.email);
        System.out.println("NickName: " + this.nickName);
        System.out.println("Guild Class: " + this.guild);
    }


}