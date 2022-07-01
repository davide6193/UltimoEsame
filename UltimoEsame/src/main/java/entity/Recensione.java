package entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Recensione")
public class Recensione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String testo;

    @Column
    private String articolo;

    private Long idArticolo;

    private String NomePrezzo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdArticolo(Long idArticolo) {
        Long idArticolo1 = this.idArticolo;

    }


    public void setNomePrezzoe(String NomePrezzo) {
        this.NomePrezzo = NomePrezzo;
    }

    public Long getIdDocente() {

        return idArticolo;

    }
    }