package entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Articolo")
public class Articolo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String nome;

    @Column
    private String prezzo;

    private Long idRecensione;

    private String nomeTestoArticolo;

    private String TestoArticolo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setTestoArticolo(String TestoArticolo) {
        this.TestoArticolo = TestoArticolo;
    }

    public Long getIdArticolo() {

        return idRecensione;
    }

    public void setidRecensione(Long idRecensione) {
        Long idRecensione1 = this.idRecensione;

    }


}
