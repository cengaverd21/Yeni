package fonksiyonDondur;


public class Main {

	public static void main(String[] args) {
		  FonksiyonCevir fonksiyonCevir = new FonksiyonCevir(); 
	        int arr[] = { 1, 22, 13, 40, 5, 63, 87 }; 
	        fonksiyonCevir.soldanCevir(arr, 2, 7); // 7 elamanlı array'in kaçıncı elmaınından itibaren döndürmek istiyorsak arr,(2)den yani 3. elamandan itibaren gibi
	        fonksiyonCevir.sonucuGoster(arr, 7); // işlem sonucu array consolda geçici olarak oluşturulan temp array elemanalarını konsola yazdırıyoruz. 
			
	}

}
