package fr.ipst.webcand.v2.webcand.util;

public class ReponseFichier {
    private String nom;
    private String url;
    private String type;
    private long taille;

    public ReponseFichier(String name, String url, String type, long size) {
        this.nom = name;
        this.url = url;
        this.type = type;
        this.taille = size;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTaille() {
        return taille;
    }

    public void setTaille(long taille) {
        this.taille = taille;
    }
}