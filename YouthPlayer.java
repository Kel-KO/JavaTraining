public class YouthPlayer extends Player { //if we were using the interface for abstraction, we would use implements PlayerInterface and use this. instead of super.
    //INHERITANCE:SUBclass inheriting attributes and methods(functions) from SUPERclass Player  (extends, implements)
    private String agegroup;

    public YouthPlayer(String agegroup1, String name1, Integer age, Integer rating, String position){
        super(name1, age, rating, position);
        this.agegroup = agegroup1;
    }

    //POLYMORPHISM: allows us to use methods of a class in different manners based on the object that invokes it
    @Override //RUNTIME POLYMOPRPHISM (OVERRIDING)
    public String toString(){ //NOTE: getting attributes from super class need to be done with methods in this usage
        return "Youth Player name: " + getname() + " | Player age: " + getage() + " | Player position: " + getposition() + " | Player rating: " + getrating() + " | Youth Age Group: " + this.agegroup;
    }
}
