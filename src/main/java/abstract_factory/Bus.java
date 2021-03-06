package abstract_factory;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Bus extends Vehicle{
    private int seats;

    @Builder
    public Bus(int weight, String name, int power, int seats) {
        super(weight, name, power);
        this.seats = seats;
    }
}
