public class Macchina {
    private String targa;
    private String modello;
    private String marca;
    private int cilindrata;
public Macchina(String targa,String modello,String marca,int cilindrata){
    this.targa = targa;
    this.modello = modello;
    this.marca = marca;
    this.cilindrata = cilindrata;;
}

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Macchina{" +
                "targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }
}
