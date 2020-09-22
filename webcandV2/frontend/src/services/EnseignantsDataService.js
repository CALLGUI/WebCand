import http from "../http-commun"

const ENSEIGNANTS_API_URL = `/enseignants`;

class EnseignantDataService {
    retrieveAllEnseignant() {
        return http.get(`${ENSEIGNANTS_API_URL}`);
    }

    retrieveUnEnseignant(id) {
        return http.get(`${ENSEIGNANTS_API_URL}/${id}`);
    }

    deleteUnEnseignant(id) {
        return http.delete(`${ENSEIGNANTS_API_URL}/${id}`);
    }
}

export default new EnseignantDataService();
