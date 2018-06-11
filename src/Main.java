
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args){

//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("david");

        // 加载Spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringDavidConfig.xml");

        try{
            HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
            helloWorld.sayHello("david");

        }catch(Exception e){
            System.out.println("catch block");
        }



    }


}
