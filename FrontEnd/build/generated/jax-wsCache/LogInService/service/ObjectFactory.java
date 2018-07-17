
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _LoginUsuario_QNAME = new QName("http://Service/", "LoginUsuario");
    private final static QName _LoginUsuarioResponse_QNAME = new QName("http://Service/", "LoginUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginUsuario }
     * 
     */
    public LoginUsuario createLoginUsuario() {
        return new LoginUsuario();
    }

    /**
     * Create an instance of {@link LoginUsuarioResponse }
     * 
     */
    public LoginUsuarioResponse createLoginUsuarioResponse() {
        return new LoginUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "LoginUsuario")
    public JAXBElement<LoginUsuario> createLoginUsuario(LoginUsuario value) {
        return new JAXBElement<LoginUsuario>(_LoginUsuario_QNAME, LoginUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "LoginUsuarioResponse")
    public JAXBElement<LoginUsuarioResponse> createLoginUsuarioResponse(LoginUsuarioResponse value) {
        return new JAXBElement<LoginUsuarioResponse>(_LoginUsuarioResponse_QNAME, LoginUsuarioResponse.class, null, value);
    }

}
