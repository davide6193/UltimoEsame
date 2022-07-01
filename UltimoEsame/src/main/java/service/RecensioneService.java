package service;

import entity.Recensione;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecensioneService {
    List<Recensione> getAllRecensioni();
    void save(Recensione recensione);
    void deleteById(long recensione);
    Recensione getReferenceById(long id);

    Object findById(Long id);

    List<Recensione> getSaveRecensione();

    List<Recensione> getAddRecensione();
}
