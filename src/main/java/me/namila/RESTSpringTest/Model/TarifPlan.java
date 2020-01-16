package me.namila.RESTSpringTest.Model;

import lombok.Getter;
import lombok.Setter;
import me.namila.RESTSpringTest.Model.Dictionary.System;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TARIFF_PLAN")
@Getter
@Setter
public class TarifPlan extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_tarif")
    @SequenceGenerator(name = "seq_tarif", sequenceName = "seq_tarif", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @NotNull
    @Column(name = "CODE")
    private String code;

    @NotNull
    @Column(name = "LABEL")
    private String label;

    @NotNull
    @Column(name = "DESCRIPTION")
    private String inn;

    @ManyToOne()
    @JoinColumn(name = "SYSTEM")
    private System system;
}
