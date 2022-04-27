package br.com.bruno.pedro.hasfood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tbl_tipo_cozinha")
public class TIpoCozinha {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="nome")
	private String nome;

}
