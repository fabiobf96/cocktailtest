package application;

import java.util.ArrayList;

public class Cocktail {
	
	private int idDrink;
    private String strDrink;
    private String strCategory;
    private String strAlcoholic;
    private String strGlass;
    private String strInstructions;
    private String strDrinkThumb;
 
    private ArrayList<String> ingredients;
    private ArrayList<String> measures;
    
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
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}
	public ArrayList<String> getMeasures() {
		return measures;
	}
	public void setMeasure(ArrayList<String> measures) {
		this.measures = measures;
	}
	
	public void PrintCocktail()
	{
		System.out.println(idDrink + "\n" + strDrink + "\n" + strCategory + "\n" + strAlcoholic + "\n" + strGlass
				+ "\n" + strInstructions + "\n" + strDrinkThumb + "\n" + ingredients + "\n" + measures);
	}
}

