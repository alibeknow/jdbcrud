package me.namila.RESTSpringTest.Model;

import lombok.*;
import me.namila.RESTSpringTest.Model.Dictionary.State;
import me.namila.RESTSpringTest.Model.Dictionary.System;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "contract")
@Setter
@Getter
public class Contract extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_client")
    @SequenceGenerator(name = "seq_client", sequenceName = "seq_client", allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @Column(name = "code")
    @NotNull
    private String code;

    @Column(name = "label")
    @NotNull
    private String label;

    @Column(name = "description")
    @NotNull
    private String description;

    @ManyToOne( )
    @JoinColumn(name = "SYSTEM")
    private System system;

    @ManyToOne( )
    @JoinColumn(name = "STATE")
    private State state;

    @ManyToOne( )
    @JoinColumn(name = "CLIENT")
    private Client client;
}
