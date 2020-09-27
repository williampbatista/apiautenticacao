package br.com.tarz.apiautenticacao.resource;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -5564100290355875712L;

	private final String jwttoken;

}