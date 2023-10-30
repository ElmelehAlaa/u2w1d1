package alaaElmeleh.u2w1d1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

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

    @Bean
    public List<Toppings> hawaiiToppings() {
        Toppings prosciutto = new Toppings("Prosciutto", 100, 2.99);
        Toppings ananas = new Toppings("Ananas", 50, 1.49);

        return Arrays.asList(prosciutto, ananas);
    }@Bean
    public List<Toppings> boscaiolaToppings() {
        Toppings salsiccia = new Toppings("salsiccia", 400, 3.99);
        Toppings funghi = new Toppings("funghi", 100, 1.79);

        return Arrays.asList(salsiccia, funghi);
    }

    @Bean
    public Pizza boscaiola(){return new Pizza("Boscaiola",5.50,1500,boscaiolaToppings());}
    @Bean
    Pizza Hawaii(){return new Pizza("Hawaii",5.99,1300,hawaiiToppings());}

}
