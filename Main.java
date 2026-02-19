public class Main {
    public void writePrimeNumbers(int n1, int n2) { 
        int i, pd;
        int suma = 0;
        boolean found;
        found = false;
        // Traverse the numbers between n1 and n2
		for (i = n1; i <= n2; i++){
			pd = 2;
			found = false;
			//For each number, chech if it is prime
			while (pd <= i - 1 && !found){
				found = i % pd == 0;
				pd++;
				
			}
			//If it is primer, sums it
			if (!found){
				suma += i;
			}
		}
		System.out.print(suma);
	}
    public static void main (String[] args) {
        Main p = new Main();
        p.writePrimeNumbers(1,100);
     }
}
