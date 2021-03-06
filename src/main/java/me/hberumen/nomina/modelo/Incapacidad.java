package me.hberumen.nomina.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by hberumen on 30/11/16.
 */
@XmlRootElement(name="Incapacidad")
public class Incapacidad {

    private BigInteger idIncapacidad;
    private BigInteger idNomina;
    private Integer diasIncapacidad;
    private String tipoIncapacidad;
    private BigDecimal importeMonetario;

    public Incapacidad() {

    }

    @XmlAttribute
    public Integer getDiasIncapacidad() {
        return diasIncapacidad;
    }

    public void setDiasIncapacidad(Integer diasIncapacidad) {
        this.diasIncapacidad = diasIncapacidad;
    }

    @XmlAttribute
    public String getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    public void setTipoIncapacidad(String tipoIncapacidad) {
        this.tipoIncapacidad = tipoIncapacidad;
    }

    @XmlAttribute
    public BigDecimal getImporteMonetario() {
        return importeMonetario;
    }

    public void setImporteMonetario(BigDecimal importeMonetario) {
        this.importeMonetario = importeMonetario;
    }

    public BigInteger getIdIncapacidad() {
        return idIncapacidad;
    }

    public void setIdIncapacidad(BigInteger idIncapacidad) {
        this.idIncapacidad = idIncapacidad;
    }

    public BigInteger getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(BigInteger idNomina) {
        this.idNomina = idNomina;
    }
}
