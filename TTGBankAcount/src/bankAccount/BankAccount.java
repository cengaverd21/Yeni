package bankAccount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankAccount {
	 private static final int DEFAULTVALUE = 0;
	
	 public void sonucuYazdir(List<Map<String, Integer>> islemSonucMap) {
	        for (int i = 0; i < islemSonucMap.size(); i++) {
	            Map<String, Integer> stringIntegerMap = islemSonucMap.get(i);
	            Set<Map.Entry<String, Integer>> girisDegerler = stringIntegerMap.entrySet();
	            girisDegerler.forEach(giris -> {
	                System.out.print(giris.getKey());
	                System.out.print(" ");
	                System.out.print(giris.getValue());
	                System.out.print("\n");
	            });
	            if (i != islemSonucMap.size() - 1) {
	                System.out.print("\n");
	            }
	        }
	    }

	    public  List<Map<String, Integer>> islemGirisDegerleri(List<String> satirSira) {
	        String ilkSatir = satirSira.remove(0).trim();
	        int testSayaci = Integer.parseInt(ilkSatir);
	        List<Map<String, Integer>> islemSonucMap = new ArrayList<>();
	        for (int i = 0; i < testSayaci; i++) {
	            Map<String, Integer> testİslemSonuctMap = new TreeMap<>();
	            int girisDegeri = Integer.parseInt(satirSira.remove(0).trim());
	            for (int j = 0; j < girisDegeri; j++) {
	                String key = satirSira.remove(0);
	                Integer yeniDeger = testİslemSonuctMap.getOrDefault(key, DEFAULTVALUE);
	                testİslemSonuctMap.put(key, yeniDeger + 1);
	            }
	            if (!satirSira.isEmpty() && satirSira.get(0).equals("")) {
	            	satirSira.remove(0);
	            }
	            islemSonucMap.add(testİslemSonuctMap);
	        }
	        return islemSonucMap;
	    }

	    public  List<String> dosyaOku() {
	        String fileName = "deneme.txt";
	        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
	            return stream.collect(Collectors.toList());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return Collections.emptyList();
	    }

}
