
package IMBService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nacimiento" type="{http://Service/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="fem" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMB", propOrder = {
    "nacimiento",
    "fem",
    "peso"
})
public class IMB {

    protected LocalDate nacimiento;
    protected boolean fem;
    protected double peso;

    /**
     * Gets the value of the nacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Sets the value of the nacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setNacimiento(LocalDate value) {
        this.nacimiento = value;
    }

    /**
     * Gets the value of the fem property.
     * 
     */
    public boolean isFem() {
        return fem;
    }

    /**
     * Sets the value of the fem property.
     * 
     */
    public void setFem(boolean value) {
        this.fem = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

}
