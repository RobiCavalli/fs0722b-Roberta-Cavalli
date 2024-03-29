package com.GestioneDispositivi3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "dispositivi")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dispositivo {
	@Id
	//@SequenceGenerator(name = "be_service_roles_id_seq", sequenceName = "be_service_roles_id_seq", allocationSize = 1)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "be_service_roles_id_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_dispositivo;
	@Enumerated(EnumType.STRING)
	private StatoDispositivo statodispositivo;
	private TipoDispositivo tipodispositivo;

}
