import axios from "axios";


const INDEX_API_URL = "http://localhost:8081/api";
const FORMATIONS_API_URL = `${INDEX_API_URL}/formations/`;

class FormationsDataService {
    retrieveAllFormations() {
        return axios.get(`${FORMATIONS_API_URL}`);
    }
    retrieveUneFormations( id ) {
        return axios.get(`${FORMATIONS_API_URL}/${id}`);
    }
}

export default new FormationsDataService();
