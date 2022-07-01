package service;


import entity.Articolo;
import entity.Recensione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RecensioneRepository;

import java.util.List;

@Service
public class RecensioneServiceImpl implements ArticoloService {

    @Autowired
    RecensioneRepository recensioneRepository;
    @Override
    public List<Recensione> getAllRecensioni() {
        return recensioneRepository.findAll();
    }
    @Override
    public void save(Recensione recensione) {
        recensioneRepository.save(recensione);
        System.out.println("La recensione è stata salvata correttamente");
    }

    @Override
    public List<Articolo> getAllArticoli() {
        return null;
    }

    @Override
    public void save(Articolo articolo) {

    }

    @Override
    public void deleteById(long recensione){
        recensioneRepository.deleteById(recensione);
    }
    @Override
    public Recensione getReferenceById(long id){
        return recensioneRepository.getReferenceById(id);
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