package day26_Construtor;

public class Oyuncak {
    public String name="belrtilmemis";
    public String tur="belrtilmemis";
    public int adet;
    public int fiyat;
    public String devamiVarMi="hayir";

   public Oyuncak(){

     System.out.println(devamiVarMi);

  }
  public Oyuncak(String name, String tur, int adet, int fiyat) {
      this.name = name;
      this.tur = tur;
      this.adet = adet;
      this.fiyat = fiyat;
  }

  public Oyuncak(String name, String tur) {
      this.name = name;
      this.tur = tur;
  }

  public Oyuncak(String car) {
      this();
  }

  @Override
  public String toString() {
      return
              "name=" + name +
              " tur=" + tur +
              " adet=" + adet +
              " fiyat=" + fiyat ;

  }
}
