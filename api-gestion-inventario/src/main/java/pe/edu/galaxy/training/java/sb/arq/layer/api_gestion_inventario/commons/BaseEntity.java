package pe.edu.galaxy.training.java.sb.arq.layer.api_gestion_inventario.commons;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    @Column(name = "AUD_REGISTRO_FECHA",nullable = false)
    private LocalDateTime audRegistroFecha;

    @Column(name = "AUD_REGISTRO_USUARIO",nullable = false)
    private String audRegistroUsuario;

    @Column(name = "AUD_ACTUALIZACION_FECHA",nullable = false)
    private LocalDateTime audActualizacionFecha;

    @Column(name = "AUD_ACTUALIZACION_USUARIO",nullable = false)
    private String audActualizacionUsuario;

    @Column(name = "ESTADO",nullable = false, length = 1)
    private String estado;
}
