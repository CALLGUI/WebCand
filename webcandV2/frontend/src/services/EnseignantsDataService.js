import axios from "axios";


const INDEX_API_URL = "http://localhost:8081/api";
const ENSEIGNANTS_API_URL = `${INDEX_API_URL}/enseignants`;

class EnseignantDataService {
    retrieveAllEnseignant() {
        return axios.get(`${ENSEIGNANTS_API_URL}`);
    }

    retrieveUnEnseignant(id) {
        return axios.get(`${ENSEIGNANTS_API_URL}/${id}`);
    }

    deleteUnEnseignant(id) {
        return axios.delete(`${ENSEIGNANTS_API_URL}/${id}`);
    }
}

export default new EnseignantDataService();
