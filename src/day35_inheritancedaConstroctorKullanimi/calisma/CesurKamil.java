package day35_inheritancedaConstroctorKullanimi.calisma;

public class CesurKamil extends BelaliAilesi {
    private String cesurKamilParolasi="CesurKamil privatedir";
    protected String cesurKamilSembolu="CesurKamil calisir";
    protected static String cesurKamilStaticSembolu="Static CesurKamil calisir";

    public CesurKamil(String asiretSembolu) {
        super(asiretSembolu);
        System.out.println("Cesur Kamil iyi calisir");
    }

    CesurKamil(){
        super(belaliAilesiStaticSembolu);
        System.out.println("Cesur Kamil rahat calisir");

    }

    public String getCesurKamilParolasi() {
        return cesurKamilParolasi;
    }

    public void setCesurKamilParolasi(String cesurKamilParolasi) {
        this.cesurKamilParolasi = cesurKamilParolasi;
    }

    public static void main(String[] args) {
      //  Asiret objAsrt=new Asiret();

      // BelaliAilesi objBela= new BelaliAilesi();
        /*
        CesurKamil objCsrKml=new CesurKamil();

        List<String> rakipler=new ArrayList<>();
        String[] arrRakip={"Ali","Veli","Deli","Kedi"};
        rakipler.addAll(Arrays.asList(arrRakip));

         */
        /*
        System.out.println(rakipler+"\n"+ """
                1-BelaliAilesi sembolleri : """+objBela.belaliAilesiSembolu+ """
                \n2-Asiret sembolleri : """+objAsrt.asiretSembolu+ """
                \n3-Cesur Kamil sembolu: """+objCsrKml.cesurKamilSembolu);

        System.out.println("""
                Asiret parolasi :"""+objAsrt.getGizliAsiretParolasi()+ """
                \nBelali Ailesi parolasi:  """+objBela.getBelaliAilesiParolasi()+ """
                \nCesur Kamil parolasi : """+objCsrKml.getCesurKamilParolasi());

         */


    }
}
