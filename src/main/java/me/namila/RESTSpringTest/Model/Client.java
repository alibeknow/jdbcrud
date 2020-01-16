package me.namila.RESTSpringTest.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import me.namila.RESTSpringTest.Model.Dictionary.State;
import me.namila.RESTSpringTest.Model.Dictionary.System;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "CLIENT")
@Getter
@Setter
public class Client extends AbstractEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_client")
	@SequenceGenerator(name = "seq_client", sequenceName = "seq_client", allocationSize = 1)
	@Column(name = "ID", updatable = false, nullable = false)
	private long id;

	@NotNull
	@Column(name = "CODE")
	private String code;

	@NotNull
	@Column(name = "LABEL")
	private String label;

	@NotNull
	@Column(name = "INN")
	private String inn;

	@ManyToOne()
	@JoinColumn(name = "STATE")
	private State state;

	@ManyToOne()
	@JoinColumn(name = "SYSTEM")
	private System system;

	@JsonIgnore
	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Contract> contractList;

	@JsonIgnore
	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Trn> trnsList;

	@JsonIgnore
	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Leaders> leadersList;

	@JsonIgnore
	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Address> addressesList;

}
