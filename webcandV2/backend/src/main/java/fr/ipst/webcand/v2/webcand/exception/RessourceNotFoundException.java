package fr.ipst.webcand.v2.webcand.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RessourceNotFoundException extends RuntimeException {

    private String nomRessource;
    private String nomAttribut;
    private Object valeurAttribut;

    public String getNomRessource() {
        return nomRessource;
    }

    public String getNomAttribut() {
        return nomAttribut;
    }

    public Object getValeurAttribut() {
        return valeurAttribut;
    }

    public RessourceNotFoundException(String nomRessource, String nomAttribut, Object valeurAttribut) {
        super(String.format("%s Pas trouvé %s : '%s'", nomRessource, nomAttribut, valeurAttribut));

        this.nomRessource = nomRessource;
        this.nomAttribut = nomAttribut;
        this.valeurAttribut = valeurAttribut;

    }

}
