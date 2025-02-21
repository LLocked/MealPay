import java.util.ArrayList;
public class Manager {
    private ArrayList<Person> ppl;
    public Manager(){
        ppl= new ArrayList<Person>();
    }
    public Person get(int i){
        return ppl.get(i);
    }
    public String transactionsByDay(int month, int day){
        String s = "";
        for (int i = 0; i<ppl.size();i++){
            s+= ppl.get(i).TransactionsByDate(month, day);
        }
        return s;
    }
    public void displayByID(int num){
        for(int i = 0;i<ppl.size(); i++){
            if(ppl.get(i).getID()==num){
                ppl.get(i).displayPerson();
            }
            else if(i==ppl.size()){
                System.out.println("Sorry, there are no students with this ID");
            }
        }
    }
    public String displayNegativePeople(){
        String Negative = "";
        for(int i = 0;i<ppl.size(); i++){
            if(ppl.get(i).getBalance()<0){
                Negative+=ppl.get(i).toString();
                Negative+="\n";
            }
        }
        return Negative;
    }

    public void add(Person j){
        ppl.add(j);
    }
}
