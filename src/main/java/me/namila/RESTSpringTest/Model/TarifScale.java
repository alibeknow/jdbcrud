package me.namila.RESTSpringTest.Model;

import lombok.Getter;
import lombok.Setter;
import me.namila.RESTSpringTest.Model.Dictionary.System;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TARIFF_SCALE")
@Getter
@Setter

public class TarifScale extends AbstractEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_tarif")
    @SequenceGenerator(name = "seq_tarif", sequenceName = "seq_tarif", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @NotNull
    @Column(name = "VALUE_WITH")
    private String value_with;

    @NotNull
    @Column(name = "VALUE_BY")
    private String value_by;

    @NotNull
    @Column(name = "SUM")
    private Integer sum;

    @NotNull
    @Column(name = "TYPE")
    private String type;

    @ManyToOne()
    @JoinColumn(name = "TARIFF_ID")
    private Tarif tarif;

}
