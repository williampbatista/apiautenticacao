package br.com.tarz.apiautenticacao.resource;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4660287067750770446L;
	private String username;
	private String password;
}
