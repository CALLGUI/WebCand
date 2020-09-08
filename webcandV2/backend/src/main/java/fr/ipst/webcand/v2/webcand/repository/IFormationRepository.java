package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.FormationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IFormationRepository extends JpaRepository<FormationEntity, Long> {
                                           // , FormationRepositoryCustom {

    @Query(value = "SELECT nom_Formation FROM formations " , nativeQuery = true)
    List<Map<String,Object>> testa();
}
