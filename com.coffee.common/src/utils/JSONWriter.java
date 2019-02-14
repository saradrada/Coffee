package utils;
import java.util.Collection;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriter{
	private JSONObject json;
	private JSONArray array;
	
	public JSONWriter() {
		json= new JSONObject();
		
	}
	
	@SuppressWarnings("unchecked")
	public  void put(String key, String value) {
		json.put(key, value);
	}
	
	@SuppressWarnings("unchecked")
	public  void putAll(Map map) {
		json.putAll(map);
	}
	
	public void newArray() {
		array= new JSONArray();
	}
	
	@SuppressWarnings("unchecked")
	public void arrayAdd(String value) {
		array.add(value);
	}
	
	@SuppressWarnings("unchecked")
	public void arrayAddAll(Collection c) {
		array.addAll(c);
	}
	
	@SuppressWarnings("unchecked")
	public void putArray(String key) {
		json.put(key, array);
	}

}
