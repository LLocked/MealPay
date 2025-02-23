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
                System.out.println("\n");
            }
            else if(i==ppl.size()){
                System.out.println("Sorry, there are no students with this ID");
                System.out.println("\n");
            }
        }
    }
    public void displayNegativePeople(){
        for(int i = 0;i<ppl.size(); i++){
            if(ppl.get(i).getBalance()<0){
                ppl.get(i).displayPerson();
                System.out.println("\n");
            }
        }
    }

    public void add(Person j){
        ppl.add(j);
    }
}
