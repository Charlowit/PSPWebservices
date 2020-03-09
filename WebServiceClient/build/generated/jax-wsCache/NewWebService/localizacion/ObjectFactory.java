
package localizacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localizacion package. 
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

    private final static QName _Hello_QNAME = new QName("http://localizacion/", "hello");
    private final static QName _Loginuser_QNAME = new QName("http://localizacion/", "loginuser");
    private final static QName _Calculator_QNAME = new QName("http://localizacion/", "calculator");
    private final static QName _CalculatorResponse_QNAME = new QName("http://localizacion/", "calculatorResponse");
    private final static QName _Random_QNAME = new QName("http://localizacion/", "random");
    private final static QName _SmtpResponse_QNAME = new QName("http://localizacion/", "smtpResponse");
    private final static QName _LoginuserResponse_QNAME = new QName("http://localizacion/", "loginuserResponse");
    private final static QName _Smtp_QNAME = new QName("http://localizacion/", "smtp");
    private final static QName _RandomResponse_QNAME = new QName("http://localizacion/", "randomResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://localizacion/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localizacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Loginuser }
     * 
     */
    public Loginuser createLoginuser() {
        return new Loginuser();
    }

    /**
     * Create an instance of {@link Calculator }
     * 
     */
    public Calculator createCalculator() {
        return new Calculator();
    }

    /**
     * Create an instance of {@link CalculatorResponse }
     * 
     */
    public CalculatorResponse createCalculatorResponse() {
        return new CalculatorResponse();
    }

    /**
     * Create an instance of {@link Random }
     * 
     */
    public Random createRandom() {
        return new Random();
    }

    /**
     * Create an instance of {@link SmtpResponse }
     * 
     */
    public SmtpResponse createSmtpResponse() {
        return new SmtpResponse();
    }

    /**
     * Create an instance of {@link LoginuserResponse }
     * 
     */
    public LoginuserResponse createLoginuserResponse() {
        return new LoginuserResponse();
    }

    /**
     * Create an instance of {@link Smtp }
     * 
     */
    public Smtp createSmtp() {
        return new Smtp();
    }

    /**
     * Create an instance of {@link RandomResponse }
     * 
     */
    public RandomResponse createRandomResponse() {
        return new RandomResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Loginuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "loginuser")
    public JAXBElement<Loginuser> createLoginuser(Loginuser value) {
        return new JAXBElement<Loginuser>(_Loginuser_QNAME, Loginuser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "calculator")
    public JAXBElement<Calculator> createCalculator(Calculator value) {
        return new JAXBElement<Calculator>(_Calculator_QNAME, Calculator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "calculatorResponse")
    public JAXBElement<CalculatorResponse> createCalculatorResponse(CalculatorResponse value) {
        return new JAXBElement<CalculatorResponse>(_CalculatorResponse_QNAME, CalculatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Random }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "random")
    public JAXBElement<Random> createRandom(Random value) {
        return new JAXBElement<Random>(_Random_QNAME, Random.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmtpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "smtpResponse")
    public JAXBElement<SmtpResponse> createSmtpResponse(SmtpResponse value) {
        return new JAXBElement<SmtpResponse>(_SmtpResponse_QNAME, SmtpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "loginuserResponse")
    public JAXBElement<LoginuserResponse> createLoginuserResponse(LoginuserResponse value) {
        return new JAXBElement<LoginuserResponse>(_LoginuserResponse_QNAME, LoginuserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Smtp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "smtp")
    public JAXBElement<Smtp> createSmtp(Smtp value) {
        return new JAXBElement<Smtp>(_Smtp_QNAME, Smtp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "randomResponse")
    public JAXBElement<RandomResponse> createRandomResponse(RandomResponse value) {
        return new JAXBElement<RandomResponse>(_RandomResponse_QNAME, RandomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localizacion/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
