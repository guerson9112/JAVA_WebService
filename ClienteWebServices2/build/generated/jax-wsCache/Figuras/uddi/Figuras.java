
package uddi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Figuras", targetNamespace = "http://UDDI/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Figuras {


    /**
     * 
     * @param lado1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cuadrado", targetNamespace = "http://UDDI/", className = "uddi.Cuadrado")
    @ResponseWrapper(localName = "cuadradoResponse", targetNamespace = "http://UDDI/", className = "uddi.CuadradoResponse")
    @Action(input = "http://UDDI/Figuras/cuadradoRequest", output = "http://UDDI/Figuras/cuadradoResponse")
    public Double cuadrado(
        @WebParam(name = "lado1", targetNamespace = "")
        double lado1);

    /**
     * 
     * @param lado2
     * @param lado1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rectangulo", targetNamespace = "http://UDDI/", className = "uddi.Rectangulo")
    @ResponseWrapper(localName = "rectanguloResponse", targetNamespace = "http://UDDI/", className = "uddi.RectanguloResponse")
    @Action(input = "http://UDDI/Figuras/rectanguloRequest", output = "http://UDDI/Figuras/rectanguloResponse")
    public Double rectangulo(
        @WebParam(name = "lado1", targetNamespace = "")
        double lado1,
        @WebParam(name = "lado2", targetNamespace = "")
        double lado2);

    /**
     * 
     * @param lado2
     * @param lado1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "triangulo", targetNamespace = "http://UDDI/", className = "uddi.Triangulo")
    @ResponseWrapper(localName = "trianguloResponse", targetNamespace = "http://UDDI/", className = "uddi.TrianguloResponse")
    @Action(input = "http://UDDI/Figuras/trianguloRequest", output = "http://UDDI/Figuras/trianguloResponse")
    public Double triangulo(
        @WebParam(name = "lado1", targetNamespace = "")
        double lado1,
        @WebParam(name = "lado2", targetNamespace = "")
        double lado2);

}