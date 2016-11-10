
package gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserDDD" type="{http://kz.sergeyshapov/user}UserDDD"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userDDD"
})
@XmlRootElement(name = "getUser", namespace = "http://kz.sergeyshapov/user")
public class GetUser {

    @XmlElement(name = "UserDDD", namespace = "http://kz.sergeyshapov/user", required = true)
    protected UserDDD userDDD;

    /**
     * Gets the value of the userDDD property.
     * 
     * @return
     *     possible object is
     *     {@link UserDDD }
     *     
     */
    public UserDDD getUserDDD() {
        return userDDD;
    }

    /**
     * Sets the value of the userDDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDDD }
     *     
     */
    public void setUserDDD(UserDDD value) {
        this.userDDD = value;
    }

}
