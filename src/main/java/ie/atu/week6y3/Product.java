package ie.atu.week6y3;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(50) @Max(value = 500, message = "ID's begin at 50 and end at 500")
    private int id;
    @NotNull(message = "Name cannot be blank")
    private String name;
    @Min(value = 1, message = "Price cannot be below 1.")
    private double price;
}
