import java.util.ArrayList;

public class MealPayProject {
        public static void main(String[] args) {
            Manager allPeople = new Manager();
            allPeople.add(new Person("James"));
            allPeople.add(new Person("Emma"));
            allPeople.add(new Person("Callum"));
            allPeople.get(1).displayPerson();
            allPeople.get(1).displayPerson();
            allPeople.get(2).displayPerson();
            int testmonth = 1;
            int testday = 10;
            allPeople.get(0).pay(testmonth, testday, 10);
            allPeople.get(0).pay(testmonth, testday, 100);
            allPeople.get(0).pay(testmonth, testday, 1000);
            allPeople.displayByID(1);

        }
    }