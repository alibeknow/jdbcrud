package me.namila.RESTSpringTest.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import me.namila.RESTSpringTest.Model.Dictionary.PayType;
import me.namila.RESTSpringTest.Model.Dictionary.State;
import me.namila.RESTSpringTest.Model.Dictionary.System;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "TRN")
@Getter
@Setter

public class Trn  extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_trn")
    @SequenceGenerator(name = "seq_trn", sequenceName = "seq_trn", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @NotNull
    @Column(name = "VALUE")
    private String value_with;

    @ManyToOne()
    @JoinColumn(name = "SYSTEM")
    private System system;

    @ManyToOne()
    @JoinColumn(name = "PAYTYPE")
    private PayType payType;

    @ManyToOne()
    @JoinColumn(name = "CLIENT")
    private Client client;

    @ManyToOne()
    @JoinColumn(name = "STATE")
    private State state;

    @JsonIgnore
    @OneToMany(mappedBy = "trn", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Indicators> indicatorsList;
}
