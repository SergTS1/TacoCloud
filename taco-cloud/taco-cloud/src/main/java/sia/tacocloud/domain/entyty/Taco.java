package sia.tacocloud.domain.entyty;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 5, message = "Name have to be at least 5 characters long")
    private String name;

    @ManyToMany
    @Size(min = 1, message = "You have to choose at least 1 ingredient")
    private List<Ingredient> ingredientList = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        this.ingredientList.add(ingredient);
    }
}
