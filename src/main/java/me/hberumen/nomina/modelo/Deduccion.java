package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Deduccion")
public class Deduccion {

    private BigInteger idDeduccion;
    private BigInteger idDeducciones;
    private String tipoDeduccion;
    private String clave;
    private String concepto;
    private BigDecimal importe;

    public Deduccion() {
    }

    @XmlAttribute
    public String getTipoDeduccion() {
        return tipoDeduccion;
    }

    public void setTipoDeduccion(String tipoDeduccion) {
        this.tipoDeduccion = tipoDeduccion;
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
    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigInteger getIdDeduccion() {
        return idDeduccion;
    }

    public void setIdDeduccion(BigInteger idDeduccion) {
        this.idDeduccion = idDeduccion;
    }

    public BigInteger getIdDeducciones() {
        return idDeducciones;
    }

    public void setIdDeducciones(BigInteger idDeducciones) {
        this.idDeducciones = idDeducciones;
    }
}
