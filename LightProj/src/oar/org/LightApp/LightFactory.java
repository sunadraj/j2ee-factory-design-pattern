package oar.org.LightApp;

public class LightFactory 
{
	//object creation logic
	public static ISwitch getLight(String type) 
	{
		if(type.equalsIgnoreCase("tubelight")) 
		{
			return new TubeLightImpl();
		}
		else if (type.equalsIgnoreCase("ledlight")) {
			return new LedLightImpl();
		}
		else {
			System.err.println("No light found");
		}
		return null;
	}
	
}
