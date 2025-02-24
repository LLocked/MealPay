import java.util.ArrayList;

public class MealPayProject {
        public static void main(String[] args) {
            
            System.out.println("Welcome to the MealPay program!");
            Person James = new Person("James");
            Person Emily = new Person("Emily");
            Person Callum = new Person("Callum");
            Manager allPeople = new Manager();
            System.out.println("Adding students to the program...");
            allPeople.add(James);
            allPeople.add(Emily);
            allPeople.add(Callum);
            System.out.println("Displaying students...");
            allPeople.get(0).displayPerson();
            allPeople.get(1).displayPerson();
            allPeople.get(2).displayPerson();
            int testmonth = 1;
            int testday = 10;
            System.out.println("Making a couple payments...");
            allPeople.get(0).pay(testmonth, testday, 10);
            allPeople.get(0).pay(testmonth, testday, 100);
            allPeople.get(0).pay(testmonth, testday, 1000);
            allPeople.get(0).buy(1,9);
            allPeople.get(1).buy(1,9);
            allPeople.get(1).buy(1,9);
            allPeople.get(1).buy(1,9);
            allPeople.get(1).pay(1,9,10);
            

            System.out.println("Displaying just those with negative balances...");
            allPeople.displayNegativePeople();
            

            System.out.println("Looking up student with ID number of 0:");
            allPeople.displayByID(0);

            System.out.println("Displaying all transactions made on 1/9");
            System.out.println(allPeople.transactionsByDay(1, 9));

            System.out.println("Displaying students...");
            allPeople.get(0).displayPerson();
            allPeople.get(1).displayPerson();
            allPeople.get(2).displayPerson();
            

        }
    }