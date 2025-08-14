package gr.cf.bax.pg1;

public class UserMain {

    public static void main(String[] args) {
        User user = new User(1001, "Dinos", "Tades");

        System.out.println("{" + user.getId() + "," + user.getFirstname() + "," + user.getLastname() +"}");
    }


}
