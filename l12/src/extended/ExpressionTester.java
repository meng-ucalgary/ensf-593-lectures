package extended;

import java.util.HashMap;
import java.util.Map;

public class ExpressionTester {

	public static void main(String[] args) {
		Expr e1 = new Times(new Const(3.0),
							new Plus(new Var("y"),
									new Var("x")));
		
		Expr e2 = new Plus(new Times(new Const(3.0),
									 new Var("y")),
						   new Var("x"));
		
		System.out.println(e1);
		System.out.println(e2);
		
		
		Map<String, Double> env = new HashMap<String, Double>();
		
		env.put("x", 2.0);
		env.put("y", 4.0);
		
		//18
		System.out.println("Expression 1: " + e1 + " with x=2, y=4 -> "+e1.eval(env));
		//14
		System.out.println("Expression 2: " + e2 + " with x=2, y=4 -> "+e2.eval(env));

	}

}
