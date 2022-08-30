package day13_methodCreation;

public class C03_StringManipulations {
    public static void main(String[] args) {

        // Soru 1) String metotlarını kullanarak
        // “ Java ogrenmek123 Çok guzel@ ” String'ini
        // “Java ogrenmek cok guzel.” sekline.

        String str= " Java ogrenmek123 Çok guzel@ ";

        str=str.trim(); // Java ogrenmek123 Çok guzel@
        str=str.replaceAll("\\d","");// Java ogrenmek Cok guzel@
        str=str.replace("@",""); // Java ogrenmek Çok guzel
        str=str.replace("C","c"); // Java ogrenmek cok guzel
        str=str+"."; // Java ogrenmek cok guzel.

        System.out.println(str); // Java ogrenmek cok guzel.
    }
}
