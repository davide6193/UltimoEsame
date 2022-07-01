package converter;

import entity.Articolo;
import entity.dto.ArticoloDto;
import org.springframework.stereotype.Component;

@Component
public class ArticoloConverter {


    public ArticoloDto convertArticolotoDto (Articolo articolo){

        ArticoloDto articoloDto = new ArticoloDto();

        articoloDto.setNome(articolo.getNome() + " " + articolo.getPrezzo());

        return articoloDto;


    }

}
