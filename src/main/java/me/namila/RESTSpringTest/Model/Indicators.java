package me.namila.RESTSpringTest.Model;


import lombok.Getter;
import lombok.Setter;
import me.namila.RESTSpringTest.Model.Dictionary.IndicatorsType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "INDICATORS")

public class Indicators extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_trn")
    @SequenceGenerator(name = "seq_trn", sequenceName = "seq_trn", allocationSize = 1)
    private long id;

    @Column(name = "CODE")
    @NotNull
    private String code;

    @Column(name = "LABEL")
    @NotNull
    private String label;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VAL_TEXT")
    @NotNull
    private String val_text;

    @ManyToOne()
    @JoinColumn(name = "INDICATOR_TYPE")
    private IndicatorsType indicatorsType;

    @ManyToOne()
    @JoinColumn(name = "PARENT_TRN")
    private Trn trn;
}
