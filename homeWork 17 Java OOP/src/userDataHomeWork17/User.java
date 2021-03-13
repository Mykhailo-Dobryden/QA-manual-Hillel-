package userDataHomeWork17;

public class User {
    public String firstName;
    public String lastName;
    public String workPhone;
    public String mobilePhone;
    public String email;
    public String password;

    User(String email, String password){
        this.email = validateEmail(email);
        this.password = validatePassword(password);
    }


    User(String email, String password, String firstName, String lastName, String workPhone, String mobilePhone){
        this.email = validateEmail(email);
        this.password = validatePassword(password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.workPhone = workPhone;
        this.mobilePhone = mobilePhone;

    }

    public String validatePassword(String password){
        if (password.length() < 8 || password.length() > 16){
            throw new IllegalArgumentException("Password length might be min 8 and max 16!");
        }
        return password;
    }

    public String validateEmail(String email){
        char symbolAt = email.charAt(0);
        int i = 0;
        while (i < email.length()){
            symbolAt = email.charAt(i);
            ++i;
            if (symbolAt == '@'){
                break;
            }
        }

        if (symbolAt != '@'){
            throw new IllegalArgumentException("The wrong email, should be contained '@' symbol");
        }
        return email;
    }


}
