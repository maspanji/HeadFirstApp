package id.undip.headfirstapp;

public class Bab {
    private String namaBab;
    private String description;

    public static final Bab[] arrayBab = {
            new Bab("Bab 8","Aplikasi pada Bab 8"),
            new Bab("Bab 9", "Aplikasi pada Bab 9")
    };

    public Bab(String namaBab, String description){
        this.namaBab = namaBab;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNamaBab() {
        return namaBab;
    }

    public void setNamaBab(String namaBab) {
        this.namaBab = namaBab;
    }

    @Override
    public String toString() {
        return this.namaBab;
    }
}