
package IMBService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the IMBService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IMB_QNAME = new QName("http://Service/", "IMB");
    private final static QName _IMBResponse_QNAME = new QName("http://Service/", "IMBResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: IMBService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IMB }
     * 
     */
    public IMB createIMB() {
        return new IMB();
    }

    /**
     * Create an instance of {@link IMBResponse }
     * 
     */
    public IMBResponse createIMBResponse() {
        return new IMBResponse();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "IMB")
    public JAXBElement<IMB> createIMB(IMB value) {
        return new JAXBElement<IMB>(_IMB_QNAME, IMB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "IMBResponse")
    public JAXBElement<IMBResponse> createIMBResponse(IMBResponse value) {
        return new JAXBElement<IMBResponse>(_IMBResponse_QNAME, IMBResponse.class, null, value);
    }

}
