package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	
	private String version = "1";
	
	@FXML private TextField txtCkt;
	@FXML private Button btnSrc;
	
	private ArrayList<Cocktail> cocktails;
	private Cocktail cocktail;
	
	public void searchCocktailByName() throws JSONException, IOException {
;
		
		String url = "https://www.thecocktaildb.com/api/json/v1/" + version + "/search.php?s=" + txtCkt.getText();
		System.out.println(url);
		JSONObject json = JsonReader.readJsonFromUrl(url);
		JSONArray array = (JSONArray)json.get("drinks");
		cocktails = new ArrayList<>();

		for (int i=0; i< array.length(); i++) {
			JSONObject json1 = (JSONObject)array.get(i);
			cocktail = new Cocktail();
			cocktail = setInformation(json1);
			cocktails.add(cocktail);
			cocktail.printCocktail();
			}
		}
	
		public Cocktail setInformation(JSONObject json) {
			cocktail = new Cocktail();
			
			cocktail.setIdDrink(json.getInt("idDrink"));
			cocktail.setStrDrink(json.getString("strDrink"));
			cocktail.setStrCategory(json.getString("strCategory"));
			cocktail.setStrAlcoholic(json.getString("strAlcoholic"));
			cocktail.setStrGlass(json.getString("strGlass"));
			cocktail.setStrInstructions(json.getString("strInstructions"));
			cocktail.setStrDrinkThumb(json.getString("strDrinkThumb"));
			
			List<String> ingridients = insert("strIngredient", 1, json);
			cocktail.setIngredients(ingridients);
			
			List<String> measures = insert("strMeasure", 1, json);
			cocktail.setMeasure(measures);
			
			return cocktail;
			
		}
		
		public List<String> insert(String str, int i, JSONObject json) {
			List<String> strs = new ArrayList<>();
			String concatenation = str + i;
			
			while(!(json.isNull(concatenation))) {
				strs.add(json.getString(concatenation));
				i ++;
				concatenation = str + i;
			}
			return strs;
		}
	
	
	
}
