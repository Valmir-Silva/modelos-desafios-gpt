import java.util.Scanner;

public class Cobaia {

	public static void main(String[] args) {
		double n, i, qte, tcob, tsap = 0, tcoe = 0, trat = 0;
		double psap, pcoe, prat;
		String tipcob;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos casos serao digitados?");
		n = sc.nextDouble();

		for (i = 1; i <= n; i++) {
			System.out.println("Qauntidade de cobaias:");
			qte = sc.nextDouble();

			System.out.println("tipo de cobaia:");
			tipcob = sc.next();

			if ("r".equals(tipcob)) {
				trat = trat + qte;
				
			} else if ("s".equals(tipcob)) {
				tsap = tsap + qte;

			} else if ("c".equals(tipcob)) {
				tcoe = tcoe + qte;

			}
		} 
		tcob = tsap + trat + tcoe;
		
		prat = trat / tcob * 100;
		psap = tsap / tcob * 100;
		pcoe = tcoe / tcob * 100;
		
		System.out.println("Relatorio final:");
		System.out.println("total de coelhos " + tcoe);
		System.out.println("total de sapos " + tsap);
		System.out.println("total de ratos " + trat);
		System.out.println("percentual coelhos " + pcoe);
		System.out.println("percentual de sapos " + psap);
		System.out.println("percentual de ratos " + prat);
		

	}

}

