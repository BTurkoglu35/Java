package day22_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class CalismaReplitArrays10 {
    public static void main(String[] args) {


        //    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
        //    Test Data:
        //    sentence -> "Java is fun"
        //    reversed **-> "**fun is Java**"**

        String str = "java is fun";
        String[] strSplit = str.split(" ");
        List<String> ters = new ArrayList<String>();
        String tersCumle = "";
        for (int i = strSplit.length - 1; i >= 0; i--) {
            // ters.add(strSplit[i]);
            tersCumle += strSplit[i] + " ";
        }

    }


}
