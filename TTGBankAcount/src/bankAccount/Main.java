package bankAccount;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

   

    public static void main(String[] args) {
       
        BankAccount bankAccount= new BankAccount();
        List<String> satirSira =  bankAccount.dosyaOku();
        List<Map<String, Integer>> islemSonucMap =bankAccount.islemGirisDegerleri(satirSira);
        bankAccount.sonucuYazdir(islemSonucMap);
    }

}