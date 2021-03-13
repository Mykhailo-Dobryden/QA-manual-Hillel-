package userDataHomeWork17;

public class main {
    public static void main (String[] args){


        User user1 = new User("user1@mail.com", "12345678");
        /*System.out.println(user1.email + " " + user1.password);*/

       User user2 = new User( "user2@mail.com", "12341234", "Chack", "Norris",
               "048123456", "0631234567");
        /*System.out.println(user2.email + " " + user2.password);*/

        Employee employee1 = new Employee("employee1@mail.com", "1234567812", "Jack",
            "Connor", "048123456", "06345628");

        /*System.out.println(employee1.firstName + " " + employee1.lastName + " " + employee1.password);*/

        Employee employee2 = new Employee("employee2@mail.com", "qwerty12344");

        /*System.out.println(employee2.email + " " + employee2.password);*/

        employee1.experience = 3;
        employee1.salary = 2500;
        employee1.raiseSalary();
        System.out.println(employee1.firstName + "'s salary: " + employee1.salary + "$");




    }
}
