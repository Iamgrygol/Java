package zad8;

import java.math.BigInteger;
/* ============================================================= */
/* =================== UWAGA! NIE KOMPILOWAÆ =================== */
/* Nawet przy nieskoñczonej pêtli BigInteger nie wyœwietla b³êdu */
/* ============================================================= */

public class zad_8 {

		   public static void main(String[] args) {
			   BigInteger liczba = BigInteger.valueOf(2);
			   long a = 1, b = 2;
			   BigInteger potega = liczba.add(liczba);

			   while(a < b)
			   {
				   potega = potega.add(potega);
				   a++;
				   b++;
				   System.out.print(a +": ");
				   System.out.println(potega);
			   } 
		   }
		}

