package me.namila.RESTSpringTest.Model;

import lombok.*;
import me.namila.RESTSpringTest.Model.Dictionary.Position;

import javax.persistence.*;

@Entity
@Table(name = "LEADERSHIP")
@Setter
@Getter

public class Leaders  extends AbstractEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_client")
	@SequenceGenerator(name = "seq_client", sequenceName = "seq_client", allocationSize = 1)
	@Column(name = "ID", updatable = false, nullable = false)
	private long id;

	@Column(name = "CODE")
	private String code;

	@Column(name = "FIO")
	private String fio;

	@Column(name = "ISFIRSTSIGN")
	private Boolean description;

	@ManyToOne()
	@JoinColumn(name = "CLIENT", nullable = false)
	private Client client;

	@ManyToOne()
	@JoinColumn(name = "POSITION", nullable = false)
	private Position position;

}
