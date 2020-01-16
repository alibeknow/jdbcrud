package me.namila.RESTSpringTest.Model.Dictionary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.Model.Tarif;
import me.namila.RESTSpringTest.Model.Trn;



@Entity
@Table(name = "DICT_PAYTYPE")
@Getter
@Setter
public class PayType extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_dict")
    @SequenceGenerator(name = "seq_dict", sequenceName = "seq_dict", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @NotNull
    @Column(name = "CODE")
    private String code;

    @JoinColumn(name = "DESCRIPTION")
    private String description;

    @NotNull
    @JoinColumn(name = "LABEL")
    private String label;

    @ManyToOne()
    @JoinColumn(name = "SYSTEM")
    private System system;

    @JsonIgnore
    @OneToMany(mappedBy = "payType", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Tarif> tarifList;

    @JsonIgnore
    @OneToMany(mappedBy = "payType", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Trn> trnList;
}
