package elamanFarkiniBul;

import java.util.HashSet;

public class DizilerdeFarkiBul {

	static void farkiBul(int aDizisi[], int bDizisi[],   
            int n, int m)  
{  
  
// İkinci dizi ile karşilaştırma  
HashSet<Integer> sTekrarlanan = new HashSet<>();  
sTekrarlanan.clear();
for (int i = 0; i < m; i++)  
	sTekrarlanan.add(bDizisi[i]);  

// Birinci dizideki tüm elamanlar
// ikinci dizide olmayan elemani buluyoruz 
for (int i = 0; i < n; i++)  
   if (!sTekrarlanan.contains(aDizisi[i])) 
       System.out.print(aDizisi[i] + " ");  
}  
	
}
