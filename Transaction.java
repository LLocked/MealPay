public class Transaction {
    private int day;
    private int month;
    private int amount;
    public Transaction(int mymonth, int myday,int myamount){
        day = myday;
        month=mymonth;
        amount = myamount;

    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public double getAmount(){
        return amount;
    }
    public String toString(){
    return ("("+month +"/"+ day +":$"+ amount+") ");
    }
}
