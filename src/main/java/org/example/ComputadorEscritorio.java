package org.example;

public class ComputadorEscritorio extends Dispositivo {
    private String gpu;
    private String psu;
    private String gabinete;
    private String marcaPantalla;
    private String modeloPantalla;
    private String anioPantalla;

    public ComputadorEscritorio(String marca, String modelo, String procesador, String ram, String almacenamiento, int precio, int anio, int stock, String gpu, String psu, String gabinete, String marcaPantalla, String modeloPantalla, String anioPantalla) {
        super(marca, modelo, procesador, ram, almacenamiento, precio, anio, stock);
        this.gpu = gpu;
        this.psu = psu;
        this.gabinete = gabinete;
        this.marcaPantalla = marcaPantalla;
        this.modeloPantalla = modeloPantalla;
        this.anioPantalla = anioPantalla;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getMarcaPantalla() {
        return marcaPantalla;
    }

    public void setMarcaPantalla(String marcaPantalla) {
        this.marcaPantalla = marcaPantalla;
    }

    public String getModeloPantalla() {
        return modeloPantalla;
    }

    public void setModeloPantalla(String modeloPantalla) {
        this.modeloPantalla = modeloPantalla;
    }

    public String getAnioPantalla() {
        return anioPantalla;
    }

    public void setAnioPantalla(String anioPantalla) {
        this.anioPantalla = anioPantalla;
    }

    @Override
    public String toString() {
        return "ComputadorEscritorio{" +
                "gpu='" + gpu + '\'' +
                ", psu='" + psu + '\'' +
                ", gabinete='" + gabinete + '\'' +
                ", marcaPantalla='" + marcaPantalla + '\'' +
                ", modeloPantalla='" + modeloPantalla + '\'' +
                ", anioPantalla='" + anioPantalla + '\'' +
                "} " + super.toString();
    }
}
