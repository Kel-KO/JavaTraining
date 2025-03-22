import java.util.List;
import java.util.ArrayList;

public class PlayerList { /**NOTE: if we use ABSTRACTION by making this class abstract(public abstract class PlayerList), abstraction tells us we cannot make a instrence(object) of this class. Must only make instances of its subclasses */
    //holds all our players and their info (list of our "Player" items)
    private ArrayList<Player> playerList;

    public PlayerList(){
        this.playerList = new ArrayList<Player>();
    }

    public void  addPlayer(Player player){
        this.playerList.add(player);
    }

    public void  removePlayer(Player player){
        this.playerList.remove(/*index of player*/0);//to do
    }

    public Player getPlayer(){
        return this.playerList.get(/*index of player */0); //to do 
    }

    public void printPlayerList(){ //print each player item from playerlist
        for (Player player: this.playerList){ //to print necessary subclasses correctly we use RUN POLYMORPHISM(METHOD OVERRIDING) in our Player class 
            System.out.println(player.toString());
        }
    }

    //STATIC COMPILE TIME POLYMORPHISM (METHOD OVERLOADING): overload a method by adding a method with same name that takes in different parameters.
        //add item overloading | based on the parameters when the method is called in main, the method with matching parameters will be invoked
    public void addPlayer(String name, Integer age, Integer rating, String position){
        this.playerList.add(new Player(name, age, rating, position));
    }
    public void addPlayer(String agegroup, String name, Integer age, Integer rating, String position){
        this.playerList.add(new YouthPlayer(agegroup, name, age, rating, position));
    }

    //ABSTRACTION: if we were to use abstraction as a method. Like the class, it would be a method that is only called by subclasses aka overriden by subcalsses
    //Ex:
    //public abstract void printPlayer();
}
