package service;

import entity.Articolo;
import entity.Recensione;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticoloService {
    List<Recensione> getAllRecensioni();

    void save(Recensione recensione);

    List<Articolo> getAllArticoli();
    void save(Articolo articolo);
    void deleteById(long articolo);
    Recensione getReferenceById(long id);

    Object findById(Long id);

    List<Articolo> getSaveArticolo();

    List<Articolo> getAddArticolo();
}
