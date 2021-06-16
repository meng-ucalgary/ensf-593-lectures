package extended;

public class Plus extends BinaryOp{
	
	
	public Plus(Expr l, Expr r) {
		super(l, r, "+");
//		this.op = "+";
	}

	@Override
	public double func(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	

}
