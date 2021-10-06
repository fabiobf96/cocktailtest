package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

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
		for (int i=0; i< array.length(); i++) {
			JSONObject json1 = (JSONObject)array.get(i);
			System.out.println(json1.toString());

		}
	}
	
}
