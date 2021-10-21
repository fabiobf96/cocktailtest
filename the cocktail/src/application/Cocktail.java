package application;

import java.util.List;

public class Cocktail {
	
	private int idDrink;
    private String strDrink;
    private String strCategory;
    private String strAlcoholic;
    private String strGlass;
    private String strInstructions;
    private String strDrinkThumb;
 
    private List<String> ingredients;
    private List<String> measures;
    
	public int getIdDrink() {
		return idDrink;
	}
	public void setIdDrink(int idDrink) {
		this.idDrink = idDrink;
	}
	public String getStrDrink() {
		return strDrink;
	}
	public void setStrDrink(String strDrink) {
		this.strDrink = strDrink;
	}
	public String getStrCategory() {
		return strCategory;
	}
	public void setStrCategory(String strCategory) {
		this.strCategory = strCategory;
	}
	public String getStrAlcoholic() {
		return strAlcoholic;
	}
	public void setStrAlcoholic(String strAlcoholic) {
		this.strAlcoholic = strAlcoholic;
	}
	public String getStrGlass() {
		return strGlass;
	}
	public void setStrGlass(String strGlass) {
		this.strGlass = strGlass;
	}
	public String getStrInstructions() {
		return strInstructions;
	}
	public void setStrInstructions(String strInstructions) {
		this.strInstructions = strInstructions;
	}
	public String getStrDrinkThumb() {
		return strDrinkThumb;
	}
	public void setStrDrinkThumb(String strDrinkThumb) {
		this.strDrinkThumb = strDrinkThumb;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public List<String> getMeasures() {
		return measures;
	}
	public void setMeasure(List<String> measures) {
		this.measures = measures;
	}
	
	public void printCocktail()
	{
		System.out.println(idDrink + "\n" + strDrink + "\n" + strCategory + "\n" + strAlcoholic + "\n" + strGlass
				+ "\n" + strInstructions + "\n" + strDrinkThumb + "\n" + ingredients + "\n" + measures);
	}
}

