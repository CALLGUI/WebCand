package fr.ipst.webcand.v2.webcand.repository;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatRepo extends JpaRepository<CandidatEntity, Long> {
    //, DataTablesRepository<CandidatEntity, Long> {
}
