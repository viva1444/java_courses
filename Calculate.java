public class Calculate {
	
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double summ = first + second;
		double sub = first - second;
		double multi = first * second;
		double div = first / second;
		double pow = Math.pow(first, second);
		System.out.println("Sum " + summ);
		System.out.println("Sub " + sub);
		System.out.println("Multi " + multi);
		System.out.println("Div " + div);
		System.out.println("Pow " + pow);
		
	}
	
}