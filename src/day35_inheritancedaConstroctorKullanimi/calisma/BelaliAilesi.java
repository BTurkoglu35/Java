package day35_inheritancedaConstroctorKullanimi.calisma;

public class BelaliAilesi extends Asiret{

    private String belaliAilesiParolasi="BelaliAilesi privatedir";
    protected String belaliAilesiSembolu="BelaliAilesi calisir";
    protected static String belaliAilesiStaticSembolu="Static BelaliAilesi calisir";

    public BelaliAilesi(String asiretSembolu) {
        super(asiretSembolu);
        System.out.println(belaliAilesiSembolu);
    }
    BelaliAilesi(){
        this(asiretStaticSembolu);
        System.out.println(belaliAilesiParolasi);

    }

    public String getBelaliAilesiParolasi() {
        return belaliAilesiParolasi;
    }
}

