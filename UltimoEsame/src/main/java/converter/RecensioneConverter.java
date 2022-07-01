package converter;

import entity.Recensione;
import entity.dto.RecensioneDto;
import org.springframework.stereotype.Component;

@Component
public class RecensioneConverter {


    public RecensioneDto convertRecensionetoDto (Recensione recensione){

        RecensioneDto recensioneDto = new RecensioneDto();

        recensioneDto.setTesto(recensione.getTesto() + " " + recensione.getArticolo());

        return recensioneDto;


    }

}
