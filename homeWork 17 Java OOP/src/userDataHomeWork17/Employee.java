package userDataHomeWork17;

public class Employee extends User {

    public double salary = 1000;
    public Integer experience;

    Employee(String email, String password, String firstName, String lastName, String workPhone, String mobilePhone) {
        super(email, password, firstName, lastName, workPhone, mobilePhone);
    }

   Employee(String email, String password){
        super(email, password);
   }

    public void raiseSalary(){
        if (experience > 0 && experience < 2 ){
            salary = salary * 1.05;
        } else if (experience >= 2 && experience <= 5){
            salary = salary * 1.10;
        } else if (experience > 5){
            salary = salary * 1.15;
        }
    }

}
