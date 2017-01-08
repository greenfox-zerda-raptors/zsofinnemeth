import com.greenfoxacademy.java.lesson.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("HelloWorldConfig");

        Boolean setMe = new Boolean();
        setMe = false;

        HelloWorld helloWorld =  ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

       // WithFries withFries = new WithFries (false); //ctx.getBean(WithFries.class, false);
        WithFries withFries = (WithFries) ctx.getBean(WithFries.class, setMe);
        System.out.println(withFries.toString());
        withFries.toggleFlSalted();
        System.out.printf("Just toggled withFries and now they are '%s'.", withFries.toString());
/*
        String greet = (String) ctx.getBean("greet","joe");
        System.out.println(greet);
*/    }
}
