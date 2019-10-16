package fonksiyonDondur;

public class FonksiyonCevir {

	/* fonksiyon soldan itibaren nElamanliDizi dizininin dBaslangic dan itibaren sıralama yapan metod */
    void soldanCevir(int arr[], int dBaslangic, int nElamanliDizi) 
    { 
        for (int i = 0; i < dBaslangic; i++) 
        	soldanBirAdimDondur(arr, nElamanliDizi); 
    } 
  
    void soldanBirAdimDondur(int arr[], int nElamanliDizi) 
    { 
        int i, Gecicitemp; 
        Gecicitemp = arr[0]; 
        for (i = 0; i < nElamanliDizi - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = Gecicitemp; 
    } 
  
    /* İşlem sonucunu consola yazdirma */
    void sonucuGoster(int arr[], int nElamanliDizi) 
    { 
        for (int i = 0; i < nElamanliDizi; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
	
}
