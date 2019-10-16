package elamanFarkiniBul;


public class Main {

	public static void main(String[] args) {
		  DizilerdeFarkiBul farkiBul = new DizilerdeFarkiBul(); 
		  int aDizisi[] = { 12, 8, 64, 33, 34, 50 ,67}; 
	      int bDizisi[] = { 12, 44, 33, 1, 50 ,51};  
	      int n = aDizisi.length; 
	      int m = bDizisi.length; 
	      farkiBul.farkiBul(aDizisi, bDizisi, n, m); //Adizisinin BDizisindenden farki 
	      System.out.println();
	      farkiBul.farkiBul(bDizisi, aDizisi, m, n);  //Bdizisinin ADizisindenden farki
	      
	}

}
