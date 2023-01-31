package Autos;
import java.util.HashMap;
import java.util.Map;


public class MapMain {
	
	public static void Main (String[] args) {
		
		
		Map<String,String> autos = new HashMap<>();
		
		autos.put("308","nombre1");
		autos.put("alfa romeo","nombre2");
		autos.put("polo","nombre3");
		autos.put("golf","nombre4");
		
		System.out.println(autos);
		
		for(String key: autos.keySet()) { //Aca saca la clave(el nombre del auto)
			
			System.out.println(key);
		}
		
        for(String value: autos.values()) {//Aca saca el valor("nombre1")
			
			System.out.println(value);
		}
		
        for(Map.Entry<String,String> pair :  autos.entrySet()) {//Aca saca el par, clave, valor
			
			System.out.println(pair.getKey() + "/" + pair.getValue());
		}
		
		
	}

}
