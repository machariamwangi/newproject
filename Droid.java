package code2;

public class Droid{
	  int batteryLevel;
	  String name;
	  public String toString() {
	    return "Hello, I'm the droid: " + name;
	  }
	  public void performTask(String task){
	    batteryLevel = batteryLevel -10;
	    System.out.println( name + " is performing task" + task);  
	  }
	  public Droid(String droidName){
	    batteryLevel = 100;
	      name = droidName;
	  }
	  
	  
	  
	  
	  public static void main(String[] arggs){
	    Droid codey = new Droid("codey");
	    System.out.println(codey);
	    codey.performTask("dancing");
	    codey.performTask("coding");
	  }
	}