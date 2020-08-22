package nikhil.springframework.services;

import nikhil.springframework.commands.IngredientCommand;
import nikhil.springframework.domain.Recipe;
import reactor.core.publisher.Mono;

/**
 * Created by jt on 6/27/17.
 */
public interface IngredientService {

    Mono<IngredientCommand> findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    Mono<IngredientCommand> saveIngredientCommand(IngredientCommand command);

    Mono<Recipe> deleteById(String recipeId, String idToDelete);
}
