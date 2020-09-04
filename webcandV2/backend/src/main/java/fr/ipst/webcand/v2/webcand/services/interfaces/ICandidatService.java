package fr.ipst.webcand.v2.webcand.services.interfaces;

import fr.ipst.webcand.v2.webcand.entities.CandidatEntity;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICandidatService {
    List<CandidatEntity> getAll();
    //DataTablesOutput<CandidatEntity> findAll(DataTablesInput input);
    CandidatEntity findById(Long id);
    CandidatEntity save(CandidatEntity CandidatEntity);
    CandidatEntity update(CandidatEntity CandidatEntity);
    void deleteById(Long id);
}
