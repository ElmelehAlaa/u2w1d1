package alaaElmeleh.u2w1d1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurazione {
    @Bean
    String getName(){
        return "Margherita";
    }
    @Bean
    double getPrice(){
        return 4.99;
    }
    @Bean
    Pizza margherita(){
        return new Pizza("Margherita",4.99,1100);
    }


}
