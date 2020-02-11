package com.cliff.recipe.services;

import com.cliff.recipe.domain.Recipe;

import java.util.Set;
public interface RecipeService {
     Set<Recipe> getRecipes();
}
