package eg1;

public class CalcMain {

	public static void main(String[] args) {

		CalculatoR calc = new CalculatoR("snowman");
		CalculatoR calc2 = new CalculatoR(22);
		CalculatoR calc3 = new CalculatoR(23, 65);
		System.out.println(calc3.add());
		System.out.println(calc3.multiply());

	}
}
