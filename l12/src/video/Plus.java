package video;

import java.util.Map;

public class Plus extends Expr{
	
	private Expr left;
	private Expr right;
	
	public Plus(Expr l, Expr r) {
		this.left = l;
		this.right = r;
	}

	@Override
	public String toString() {
		return "("+left.toString() + "+" + right.toString()+")";	
	}
	
	
	@Override
	public double eval(Map<String, Double> env) {
		// TODO Auto-generated method stub
		return left.eval(env) + right.eval(env);
	}

}
