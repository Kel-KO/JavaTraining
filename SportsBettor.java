import java.util.ArrayList;
import java.util.List;

public class SportsBettor {
    private String name;
    private float balance;

    private List<Character> last3bets = new ArrayList<>(); //could use linked list for dynamic popping and pushing as it is faste runtime. update later

    //Constructor
    public SportsBettor(String name1, float balance1){
        this.name = name1;
        this.balance = balance1;
    }

    //update name
    public void updateName(String newname){
        this.name = newname;
    }

    //get name
    public String getName(){
        return this.name;
    }

    //update balance
    public void updateBalance(float newbal){
        this.balance = newbal;
    }

    //get balance
    public float getBalance(){
        return this.balance;
    }

    //update bethistory
        //if length greater than 3 remove oldest bet and add latest (acts as a queue)
    public void updateHistory(Character latestbet){
        if (this.last3bets.size() >= 3){
            //pop from end of last3bets and insert new bet into start of list
            this.last3bets.remove(this.last3bets.size() - 1);
            this.last3bets.add(0, latestbet);
        }
        else{
            this.last3bets.add(0, latestbet);
        }
    }

    //get bet history
    public List<Character> getHistory(){
        return this.last3bets;
    }

}
