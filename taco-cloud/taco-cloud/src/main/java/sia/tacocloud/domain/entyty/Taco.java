package sia.tacocloud.domain.entyty;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@Getter
public class Taco {

    private String name;

    private List<Ingredient> ingredientList;
}
