/**
 * Created by false on 2016. 12. 21..
 */
import com.greenfoxacademy.java.lesson.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

        WithFries withFries = ctx.getBean(WithFries.class, true);
        System.out.println(withFries.toString());
        withFries.toggleFlSalted();
        System.out.printf("Just toggled withFries and now they are '%s'.", withFries.toString());

    }
}
