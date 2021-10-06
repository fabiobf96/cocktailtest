package application;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	
	private String version = "1";
	
	@FXML
	TextField txtCkt;
	@FXML
	Button btnSrc;
	
	public void SearchCocktailByName(Event e) throws JSONException, IOException {
		
		String url = "https://www.thecocktaildb.com/api/json/v1/" + version + "/search.php?s=" + txtCkt.getText().toString();
		System.out.println(url);
		JSONObject json = JsonReader.readJsonFromUrl(url);
		JSONArray array = (JSONArray)json.get("drinks");
		System.out.println(json.toString());
		ArrayList<Cocktail> cocktails = new ArrayList<Cocktail>();
		for (int i=0; i< array.length(); i++) {
			JSONObject json1 = (JSONObject)array.get(i);
			Cocktail cocktail = SetInformation(json1);
			cocktails.add(cocktail);
			System.out.println(json1.toString());
			}
		

		}
		public Cocktail SetInformation(JSONObject json) {
			Cocktail cocktail = new Cocktail();
			
			cocktail.setIdDrink(json.getInt("idDrink"));
			cocktail.setStrDrink(json.getString("strDrink"));
			cocktail.setStrCategory(json.getString("strCategory"));
			cocktail.setStrAlcoholic(json.getString("strAlcoholic"));
			cocktail.setStrGlass(json.getString("strGlass"));
			cocktail.setStrInstructions(json.getString("strInstructions"));
			cocktail.setStrDrinkThumb(json.getString("strDrinkThumb"));
			
			ArrayList<String> ingridients = new ArrayList<>();
			
			String ingredient = "strIngredient";
			
			int i = 1;
			
			String concatenation = ingredient + i;
			
			while(!(json.isNull(concatenation))) {
				ingridients.add(json.getString(concatenation));
				i ++;
				concatenation = ingredient + i;
				System.out.println(ingridients);
			}
			cocktail.setIngredients(ingridients);
			
			ArrayList<String> measures = new ArrayList<>();
			
			String measure = "strMeasure";
			
			i = 1;
			
			concatenation = measure + i;
			
			while(!(json.isNull(concatenation))) {
				measures.add(json.getString(concatenation));
				i ++;
				concatenation = measure + i;
				System.out.println(measures);
			}
			cocktail.setMeasure(measures);
			
			return cocktail;
	}
	
	
	
}
