package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ICandidatRepository extends JpaRepository<CandidatEntity, Long> {

    @Query(value = "SELECT * FROM candidatures where id_candidat = :id " , nativeQuery = true)
    List<Map<String,Object>> AfficherLesCandidaturesDuCandidat(long id);
}
