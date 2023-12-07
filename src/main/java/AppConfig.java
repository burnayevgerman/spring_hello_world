import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class AppConfig {
    private static int CAT_COUNTER = 0;

    @Bean(name="cat")
    @Scope(scopeName="prototype")
    public Cat getCat() {
        Cat someCat = new Cat();
        someCat.setName("Cat #" + ++CAT_COUNTER);
        someCat.setSize(new Random().nextFloat(0.5f, 40.f));
        return someCat;
    }
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
}