package alaaElmeleh.u2w1d1.entities;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@ToString

public class Pizza {
    private String nome;
    private Double price;
    private int calories;
    private List<Toppings> toppings;


    public Pizza(String margherita, double price, int calories) {
    }
}
