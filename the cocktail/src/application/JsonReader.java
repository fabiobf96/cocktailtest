package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {
	
	private JsonReader() {
		throw new IllegalStateException("Utility class");
	}
	
	private static String readAll(Reader rd) throws IOException {
	StringBuilder sb = new StringBuilder();
	int cp;
	
	while ((cp = rd.read()) != -1) {
		sb.append((char) cp);
	}
	
	return sb.toString();
	
	}
	
	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		
		java.io.InputStream is = new URL(url).openStream();
	    
		try {
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
	        String jsonText = readAll(rd);
	        JSONObject json = new JSONObject(jsonText);
	        is.close();
	        return json;
	        
		} catch(Exception e){
			//TODO someting
	    }
		is.close();
		return null;
		
	}
	  
}
