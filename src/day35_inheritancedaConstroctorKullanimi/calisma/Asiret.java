package day35_inheritancedaConstroctorKullanimi.calisma;

public class Asiret {
    private String gizliAsiretParolasi="Asiret privatedir";
    protected String asiretSembolu="Asiret calisir";
    protected static String asiretStaticSembolu="Static asiret calisir";

    Asiret(String asiretSembolu) {
        System.out.println(asiretSembolu);
    }

    Asiret() {

        System.out.println(gizliAsiretParolasi);
    }

    public String getGizliAsiretParolasi() {

        return gizliAsiretParolasi;
    }

}
