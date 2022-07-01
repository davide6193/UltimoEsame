package service;


import entity.Articolo;
import entity.Recensione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ArticoloRepository;

import java.util.List;

@Service
public class ArticoloServiceImpl implements ArticoloService {

    @Autowired
    ArticoloRepository articoloRepository;
    @Override
    public List<Articolo> getAllArticoli() {
        return articoloRepository.findAll();
    }
    @Override
    public void save(Articolo articolo) {
        articoloRepository.save(articolo);
        System.out.println("L'articolo è stato salvato correttamente");
    }
    @Override
    public void deleteById(long articolo){
        articoloRepository.deleteById(articolo);
    }
    @Override
    public Recensione getReferenceById(long id){
        return articoloRepository.getReferenceById(id);
    }

    @Override
    public Object findById(Long id) {
        return null;
    }

    @Override
    public List<Articolo> getSaveArticolo() {
        return null;
    }

    @Override
    public List<Articolo> getAddArticolo() {
        return null;
    }
}