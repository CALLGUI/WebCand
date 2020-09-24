package fr.ipst.webcand.v2.webcand.entities;

import javax.persistence.*;

@Entity
@Table(name = "fichiers")
public class FichierEntity {

    @Id
    @Column(name = "id_document")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDocument;

    @Column(name = "nom_fichier")
    private String nomFichier;

    @Column(name = "type")
    private String type;

    //BLOB(binary) ou CLOB(txt)
    @Lob
    private byte[] data;

    @Column(name = "id_user")
    private Long idUser;

    public FichierEntity() {
    }

    public FichierEntity(String nomFichier, String type, byte[] data) {
        this.nomFichier = nomFichier;
        this.type = type;
        this.data = data;
    }

    public FichierEntity(String nomFichier, String type, byte[] data, Long idUser) {
        this.nomFichier = nomFichier;
        this.type = type;
        this.data = data;
        this.idUser = idUser;
    }

    public FichierEntity(Long idDocument, String nomFichier, String type, byte[] data, Long idUser) {
        this.idDocument = idDocument;
        this.nomFichier = nomFichier;
        this.type = type;
        this.data = data;
        this.idUser = idUser;
    }

    public Long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Long idDocument) {
        this.idDocument = idDocument;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}