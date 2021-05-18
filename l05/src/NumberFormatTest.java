import java.text.NumberFormat;
import java.util.Locale;
	
public class NumberFormatTest {
	

	public static void main(String[] args) {
		
		System.out.println("Original Locale: "+ Locale.getDefault());
		Locale.setDefault(Locale.CANADA);
		System.out.println("Set to: "+ Locale.getDefault());

		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		System.out.println( percent.format(0.0655));
		
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		System.out.println( number.format(0.0655));
		
		System.out.printf("%.2f%n", 0.0655);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println( currency.format(2500));
		
		currency = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println( currency.format(2500));
	}

}
