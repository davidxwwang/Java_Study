
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiibai.output.IOutputGenerator;
import com.yiibai.output.impl.CsvOutputGenerator;
import com.yiibai.output.OutputHelper;

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


//        IOutputGenerator output = new CsvOutputGenerator();
//        output.generateOutput();


        try{
            //只需要改变 SpringDavidConfig.xml文件使用不同的输出生成器(json/csv)。
            //只修改 SpringDavidConfig.xml文件而不需要无码修改。标签是'ref'
            OutputHelper output2 = (OutputHelper) context.getBean("OutputHelper");
            output2.generateOutput();

        }catch(Exception e){
            System.out.println("catch block");
        }






    }


}
