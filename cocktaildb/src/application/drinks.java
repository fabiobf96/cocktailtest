package application;

import java.util.ArrayList;

public class drinks {
	
	private int idDrink;
    private String strDrink;
    private String strCategory;
    private String strAlcoholic;
    private String strGlass;
    private String strInstructions;
    private String strDrinkThumb;
    //fare un parse è molto meglio di gson
    private ArrayList<String> ingredients;
    
//    private String strIngredient1;
//    private String strIngredient2;
//    private String strIngredient3;
//    private String strIngredient4;
//    private String strIngredient5;
//    private String strIngredient6;
//    private String strIngredient7;
//    private String strIngredient8;
//    private String strIngredient9;
//    private String strIngredient10;
//    private String strIngredient11;
//    private String strIngredient12;
//    private String strIngredient13;
//    private String strIngredient14;
//    private String strIngredient15;
    
    private ArrayList<String> measure;
   
//    private String strMeasure1;
//    private String strMeasure2;
//    private String strMeasure3;
//    private String strMeasure4;
//    private String strMeasure5;
//    private String strMeasure6;
//    private String strMeasure7;
//    private String strMeasure8;
//    private String strMeasure9;
//    private String strMeasure10;
//    private String strMeasure11;
//    private String strMeasure12;
//    private String strMeasure13;
//    private String strMeasure14;
//    private String strMeasure15;
    
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
	public ArrayList<String> getMeasure() {
		return measure;
	}
	public void setMeasure(ArrayList<String> measure) {
		this.measure = measure;
	}
}
