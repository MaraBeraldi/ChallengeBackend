package com.example.DesafioFolcode.Models.Entities;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Table(name = "Compra")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCompra", columnDefinition = "INT(11) UNSIGNED")
    Integer id;
    @Column(name = "fecha", columnDefinition = "DATE")
    LocalDate fecha;
    @Column(name = "metodo_pago", columnDefinition = "VARCHAR(45)")
    String metodoPago;
    @Column(name = "idpaquete", columnDefinition = "INT(11)")
    Integer id_paquete_Turistico;
    @Column(name = "idusuario", columnDefinition = "INT(11)")
    Integer id_usuario;

    @OneToOne ()
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name="idpaquete",referencedColumnName = "idPaqueteTuristico",insertable = false,updatable = false)
    public Paquete paquete;

    @OneToOne ()
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name="idusuario",referencedColumnName = "idUsuario",insertable = false,updatable = false)
    public Usuario usuario;

}
