package alaaElmeleh.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Bevande {
    private String nome;
    private int calories;
    private double price;
}
