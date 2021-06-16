package video;

import java.util.Map;

public class Const extends Expr{
	
	private double val;
	
	public Const(double v) {
		this.val = v;
	}
	
	@Override
	public String toString() {
		return ""+this.val;
	}

	@Override
	public double eval(Map<String, Double> env) {
		// TODO Auto-generated method stub
		return this.val;
	}

}
