package video;

import java.util.Map;

public class Var extends Expr{
	
	private String name;
	
	public Var(String n) {
		this.name = n;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public double eval(Map<String, Double> env) {
		// TODO Auto-generated method stub
		return env.get(this.name);
	}

}
