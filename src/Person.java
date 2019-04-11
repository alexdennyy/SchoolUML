public class Person {

    private String name;
    private int id;
    private static int totalID = 0;

    public Person(String name){
        this.name = name;
        this.id = totalID;
        totalID++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getID(){
        return this.id;
    }

    public void setId (int newID){
        this.id = newID;
    }


}
