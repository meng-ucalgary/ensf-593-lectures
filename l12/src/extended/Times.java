package extended;

public class Times extends BinaryOp{
	
	public Times(Expr l, Expr r) {
		super(l, r, "*");
//		this.op = "*";
	}

	@Override
	public double func(double x, double y) {
		// TODO Auto-generated method stub
		return x * y;
	}
}
