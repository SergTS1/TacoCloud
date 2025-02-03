package sia.tacocloud.domain.entyty;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name have to be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You have to choose at least 1 ingredient")
    private List<Ingredient> ingredientList;
}
