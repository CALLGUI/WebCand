package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.CandidatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICandidatureRepository extends JpaRepository<CandidatureEntity, Long> {
    /*@Transactional
    @Modifying(clearAutomatically=true, flushAutomatically = true)
    @Query(value =
            "INSERT INTO candidatures(date_candidature) " +
                    "VALUES (:jourJ)"
            , nativeQuery = true)
    void creationCandidature(String jourJ);

    @Modifying(clearAutomatically=true, flushAutomatically = true)
    @Query(value =
            "INSERT INTO candidature_session_associations( id_candidature, id_session_formation)" +
                    "VALUES (:idCandidature, :idSessionFormation)"
            , nativeQuery = true)
    void createCandidatureSessionAssociation(Long idCandidature, Long idSessionFormation);

    @Modifying(clearAutomatically=true, flushAutomatically = true)
    @Query(value =
            "INSERT INTO candidature_candidat_associations(id_candidature, id_candidat) " +
                    "VALUES ( :idCandidature, :idCandidat)"
            , nativeQuery = true)
    void createCandidatureCandidatAssociation(Long idCandidature, Long idCandidat);*/
}
