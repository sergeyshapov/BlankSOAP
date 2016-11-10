
package gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gen package. 
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

    private final static QName _User_QNAME = new QName("http://kz.sergeyshapov/user", "user");
    private final static QName _UserResponse_QNAME = new QName("http://kz.sergeyshapov/user", "userResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link UserDDD }
     * 
     */
    public UserDDD createUserDDD() {
        return new UserDDD();
    }

    /**
     * Create an instance of {@link UserResponse }
     * 
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDDD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kz.sergeyshapov/user", name = "user")
    public JAXBElement<UserDDD> createUser(UserDDD value) {
        return new JAXBElement<UserDDD>(_User_QNAME, UserDDD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kz.sergeyshapov/user", name = "userResponse")
    public JAXBElement<UserResponse> createUserResponse(UserResponse value) {
        return new JAXBElement<UserResponse>(_UserResponse_QNAME, UserResponse.class, null, value);
    }

}
