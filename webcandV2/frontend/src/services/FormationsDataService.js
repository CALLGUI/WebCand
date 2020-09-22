import http from "../http-commun"

const FORMATIONS_API_URL = `/formations`;

class FormationsDataService {

    getAllFormation() {
        return http.get(`${FORMATIONS_API_URL}`);
    }

    getFormation(id) {
        return http.get(`${FORMATIONS_API_URL}/${id}`);
    }

    createFormation(data) {
        return http.post(`${FORMATIONS_API_URL}`, data)
    }

    updateFormation(id, data) {
        return http.put(`${FORMATIONS_API_URL}/${id}`, data)
    }

    deleteFormation(id) {
        return http.delete(`${FORMATIONS_API_URL}/${id}`);
    }

    deleteAllFormation() {
        return http.delete(`${FORMATIONS_API_URL}`)
    }

    findTitreFormation (title) {
        return http.get(`${FORMATIONS_API_URL}+/${title}`)
    }
}

export default new FormationsDataService();
