package pe.com.cibertec.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {

	@Id
	@Column(name = "correo", nullable = false, length = 60)
	private String correo;

	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;

	@Column(name = "celular", nullable = false, columnDefinition = "CHAR(9)", length = 9, unique = true)
	private String celular;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "url_imagen")
	private String urlImagen;

}
