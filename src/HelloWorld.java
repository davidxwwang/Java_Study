

public class HelloWorld implements HelloWorldInterface{
    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public HelloWorld() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello(String name){
        System.out.println("hello " + name);
    }
}
