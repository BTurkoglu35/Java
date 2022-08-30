package practice_08;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_HackerLanguage {

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("lutfen bir metin giriniz");
    String metin = scanner.nextLine();
    String[] metinArray = metin.split("");
    List<String> metinList= Arrays.asList(metinArray);
    String hack="";

    for (int i = 0; i <metinList.size(); i++) {
        if (metinList.get(i).equals("s")){
            metinList.set(i,"5");
        }if (metinList.get(i).equals("a")){
            metinList.set(i,"4");
        }if (metinList.get(i).equals("e")){
            metinList.set(i,"3");
        }if (metinList.get(i).equals("i")){
            metinList.set(i,"1");
        }if (metinList.get(i).equals("a")){
            metinList.set(i,"0");
        }
    }
    for (int i = 0; i <metinList.size(); i++)  {
        hack+=metinList.get(i);

    }
    System.out.println(hack);








}}
