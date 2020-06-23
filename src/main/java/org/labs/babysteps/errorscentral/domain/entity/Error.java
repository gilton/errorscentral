package org.labs.babysteps.errorscentral.domain.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idError")
public class Error {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idError;
	
	private String title;
	private Long qtdError;
	
	private List<Event> eventos;
	
}
