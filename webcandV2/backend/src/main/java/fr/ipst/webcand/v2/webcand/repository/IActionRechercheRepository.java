package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.ActionRechercheEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IActionRechercheRepository extends JpaRepository<ActionRechercheEntity, Long> {

    @Query(value =
            "SELECT nom_entreprise, date_contact, reponse_entreprise" +
            "FROM action_Recherche" +
            "WHERE id_candidat = :id", nativeQuery = true)
    List<Map<String,Object>> AfficherListeEntreprisesContacte(long id);

    @Query(value = "SELECT nom_entreprise, nom_contact, mail_contact, telephone_contact, date_contact, " +
            "reponse_entreprise, type_postuler, nom_poste, date_reponse " +
            "FROM actions_recherche " +
            "WHERE ar_candidat_id_candidat = :id", nativeQuery = true)
    List<Map<String,Object>> AfficherListeEntrepriseContacteDetails(long id);

}
