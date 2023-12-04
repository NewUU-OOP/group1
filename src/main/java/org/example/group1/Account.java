package src.main.java.org.example.group1;

public abstract class Account {

    private String id;
    private String password;
    private AccountStatus status;
    private Person person;


    public boolean resetPassword() {
        return false;
    }
}
