public class Person {
    private String name;

    // returns the person's name
    public String getName(){
        return name;
    }
    // changes the name property to the passed value
    public Person(String inputName){
        this.name = inputName;
//        return name;
    }
    public void setName(String inputName){
        this.name = inputName;
//        return name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println(name + " says hello!");
    }
}
