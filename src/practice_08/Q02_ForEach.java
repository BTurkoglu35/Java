package practice_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_ForEach {

    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meat", "milk"};
        //part 1]

        for (String each : list
             ) {

            System.out.print(each+"\t");
            System.out.print(each.length());
            System.out.println();
        }

        //part 2
        List<String> list2 = new ArrayList<String>();
        for (String each : list
             ) {
            System.out.println(each);
            if (!each.startsWith("v")){
                list2.add(each);
            }
        }String[]listYeni=new String[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            listYeni[i]=list2.get(i);

        }
        System.out.println(Arrays.toString(listYeni));







    }
}
