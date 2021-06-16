package video;

import java.util.Map;

public abstract class Expr {
	
	public abstract double eval(Map<String, Double> env);

}
