package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Percepcion")
public class Percepcion {

    private BigInteger idPercepcion;
    private BigInteger idPercepciones;
    private String tipoPercepcion;
    private String clave;
    private String concepto;
    private BigDecimal importeGravado;
    private BigDecimal importeExento;

    public Percepcion() {
    }

    @XmlAttribute
    public String getTipoPercepcion() {
        return tipoPercepcion;
    }

    public void setTipoPercepcion(String tipoPercepcion) {
        this.tipoPercepcion = tipoPercepcion;
    }

    @XmlAttribute
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @XmlAttribute
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @XmlAttribute
    public BigDecimal getImporteGravado() {
        return importeGravado;
    }

    public void setImporteGravado(BigDecimal importeGravado) {
        this.importeGravado = importeGravado;
    }

    @XmlAttribute
    public BigDecimal getImporteExento() {
        return importeExento;
    }

    public void setImporteExento(BigDecimal importeExento) {
        this.importeExento = importeExento;
    }

    public BigInteger getIdPercepcion() {
        return idPercepcion;
    }

    public void setIdPercepcion(BigInteger idPercepcion) {
        this.idPercepcion = idPercepcion;
    }

    public BigInteger getIdPercepciones() {
        return idPercepciones;
    }

    public void setIdPercepciones(BigInteger idPercepciones) {
        this.idPercepciones = idPercepciones;
    }
}
