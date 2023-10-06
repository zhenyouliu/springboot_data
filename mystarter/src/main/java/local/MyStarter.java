package local;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "mystarter.enabled", matchIfMissing = true)
public class MyStarter {
    static {
        System.out.println("MyStarter init...");
    }

    @Bean
    public TestBean createTestBean() {
        return new TestBean();
    }
}
