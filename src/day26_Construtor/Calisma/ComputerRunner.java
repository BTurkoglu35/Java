package day26_Construtor.Calisma;

import java.util.ArrayList;
import java.util.List;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer1=new Computer("Asus","Aspire");
        Computer computer2=new Computer("casper","s500",2017,"japonya");
        Computer computer3=new Computer();
        Computer computer4=new Computer("mac","mac1",2021,"amerika");
        Computer computer5=new Computer("lenova",2020);
        Computer computer6=new Computer("acer","stick",2022);


    List<Computer> computerList=new ArrayList<Computer>(List.of(computer1, computer2, computer3, computer4, computer5, computer6));
    computerList.add(new Computer("toshiba","satellite",2018,"japonya"));

        for (int i = 0; i <computerList.size(); i++)  {
            if (computerList.get(i).uretimYili>2020){
                System.out.println(computerList.get(i).isim);
            }


        }

        for (int i = 0; i <computerList.size(); i++)  {
            System.out.println(computerList.get(i).uretimYeri);
        }






    }



}
