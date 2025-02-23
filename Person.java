import java.util.ArrayList;

public class Person{

    //Construction
    private double balance;
    private int ID;
    private String name;
    private ArrayList<Transaction> Transactions;
    private static int IDgen;
    public Person(String myName){
        balance = 0;
        ID = IDgen;
        name=myName;
        IDgen++;
        Transactions = new ArrayList<Transaction>();
    }

    //Functions
    public int getID(){
        return ID;
    }

    public Double getBalance(){
        return balance;
    }


    public static int numofpeople(){
        return IDgen;
    }

    public void buy(int month, int day){
        balance -=7;
        Transactions.add(new Transaction(month,day,-7));
        System.out.println( name +" bought a lunch. "+name+" has $"+ balance+ " in their account.");
    }

    public void pay(int month, int day, int payment){
        balance +=payment;
        Transactions.add(new Transaction(month,day,payment));
        System.out.println( name + " has added $"+payment+" to their account. They have $"+ balance+ " in their account.");
    }

    public void displayPerson(){
            System.out.println("Student: "+ name+" ID: " +ID+" Balance: $"+balance+" Transactions: ");
            if(Transactions!=null){
                for(Transaction tf:Transactions){
                System.out.print(tf.toString());
            }
            }
    }
    public String TransactionsByDate(int month, int day){
        String x = "";
        if(Transactions!=null){
            for(int i = 0; i<Transactions.size();i++){
                if(Transactions.get(i).getMonth()== month && Transactions.get(i).getDay() == day){
                    x+=(Transactions.get(i).toString()+"by "+name+ " ID: "+ getID());
                    x+="\n";
                }
            }
        }
        return x;
    }
}