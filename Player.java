//simple OOP (Classes and Objects Usage)

public class Player{
    private String name;
    private Integer age;
    private Integer rating;
    private String position;

//ENCAPSULATION: private/public act as access modifiers that protect the contents of this Class. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //private vals can only be accessed within this class
        //public methods can be accessed outside the class
    
    //public void setname(String name){
    //    this.name = name; //set the Player name
    //}
    //public void setage(Integer age){
    //    this.age = age; //set the Player age
    //}
    //public void setrating(Integer rating){
    //    this.rating = rating; //set the Player rating
    //}
    //public void setposition(String position){
    //    this.position = position; //set the Player position
    //}
    //
    // can replace all this ^ with a Constructor v

    public Player(String name1, Integer age1, Integer rating1, String position1){
        this.name = name1;
        this.age = age1;
        this.rating = rating1;
        this.position = position1;
    }

    public String getname(){
        return name;
    }
    public Integer getage(){
        return age;
    }
    public Integer getrating(){
        return rating;
    }
    public String getposition(){
        return position;
    }

    //POLYMORPHISM: allows us to use methods of a class in different manners based on the object that invokes it
    @Override //RUNTIME POLYMOPRPHISM (OVERRIDING)
    public String toString(){
        return "Player name: " + this.name + " | Player age: " + this.age + " | Player position: " + this.position + " | Player rating: " + this.rating;
    }
    
    //Example of overriding abstract method in PlayerList
    //@Override
    //public void printPlayer(){
    //    System.out.println("Player name: " + this.name + " | Player age: " + this.age + " | Player position: " + this.position + " | Player rating: " + this.rating);
    //}
}
