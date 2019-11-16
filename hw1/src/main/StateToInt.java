package main;

import java.util.HashMap;
import java.util.Map;

public class StateToInt {
	static public Map<String, Integer> mapForIDENT = new HashMap<String, Integer>()
	{
		{
			put("x", 70);
		}
	};
	
	static public int get(String id)
	{
		return mapForIDENT.get(id);
	}
}
