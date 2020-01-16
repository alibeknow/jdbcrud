package me.namila.RESTSpringTest.Model.Dictionary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.Model.Leaders;
import me.namila.RESTSpringTest.Model.Trn;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "DICT_POSITIONTYPE")

public class Position  extends AbstractEntity {
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

    @JsonIgnore
    @OneToMany(mappedBy = "position", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Leaders> leadersList;

}
