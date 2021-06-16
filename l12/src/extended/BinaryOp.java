package extended;

import java.util.Map;

public abstract class BinaryOp extends Expr{
	
	private Expr left;
	private Expr right;
	private String op;
	
	public BinaryOp(Expr l, Expr r, String o) {
		this.left = l;
		this.right = r;
		this.op = o;
	}
	
	@Override
	public String toString() {
		return "("+left.toString() + this.op + right.toString()+")";	
	}
	
	
	@Override
	public double eval(Map<String, Double> env) {
		// TODO Auto-generated method stub
		return this.func(left.eval(env), right.eval(env));
	}
	
	public abstract double func(double x, double y);

}
