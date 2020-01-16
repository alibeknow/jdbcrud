package me.namila.RESTSpringTest.Model.Dictionary;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.Model.Tarif;


@Entity
@Getter
@Setter
@Table(name = "DICT_TARIF_TYPE")
public class TarifType extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_dict")
    @SequenceGenerator(name = "seq_dict", sequenceName = "seq_dict", allocationSize = 1)
    private long id;

    @Column(name = "CODE")
    @NotNull
    private String code;

    @Column(name = "LABEL")
    @NotNull
    private String label;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TYPE")
    @NotNull
    private String type;

//    @JsonIgnore
//    @OneToMany(mappedBy = "tarif_type", cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity = Tarif.class)
//    private List<Tarif> tarifsList;

}
