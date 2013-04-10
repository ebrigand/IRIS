//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.20 at 02:21:10 PM IST 
//

package com.temenos.messagingLayer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * A service send forms an outbound, one-way message from T24. May be a valid outbound message, or an ofsFault where
 * an error occured.
 * 
 * 
 * <p>
 * Java class for ofsml13ServiceSend complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ofsml13ServiceSend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ofsFault" type="{http://www.temenos.com/T24/OFSML/130}ofsml13Fault"/>
 *         &lt;element name="ofsBusinessEvent" type="{http://www.temenos.com/T24/OFSML/130}ofsml13BusinessEvent"/>
 *         &lt;element name="ofsReport" type="{http://www.temenos.com/T24/OFSML/130}ofsml13BusinessReport"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofsml13ServiceSend", propOrder = { "ofsFault", "ofsBusinessEvent", "ofsReport" })
public class Ofsml13ServiceSend {

	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected Ofsml13Fault ofsFault;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected Ofsml13BusinessEvent ofsBusinessEvent;
	@XmlElement(namespace = "http://www.temenos.com/T24/OFSML/130")
	protected Ofsml13BusinessReport ofsReport;

	/**
	 * Gets the value of the ofsFault property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13Fault }
	 * 
	 */
	public Ofsml13Fault getOfsFault() {
		return ofsFault;
	}

	/**
	 * Sets the value of the ofsFault property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13Fault }
	 * 
	 */
	public void setOfsFault(Ofsml13Fault value) {
		this.ofsFault = value;
	}

	/**
	 * Gets the value of the ofsBusinessEvent property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13BusinessEvent }
	 * 
	 */
	public Ofsml13BusinessEvent getOfsBusinessEvent() {
		return ofsBusinessEvent;
	}

	/**
	 * Sets the value of the ofsBusinessEvent property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13BusinessEvent }
	 * 
	 */
	public void setOfsBusinessEvent(Ofsml13BusinessEvent value) {
		this.ofsBusinessEvent = value;
	}

	/**
	 * Gets the value of the ofsReport property.
	 * 
	 * @return
	 *         possible object is {@link Ofsml13BusinessReport }
	 * 
	 */
	public Ofsml13BusinessReport getOfsReport() {
		return ofsReport;
	}

	/**
	 * Sets the value of the ofsReport property.
	 * 
	 * @param value
	 *            allowed object is {@link Ofsml13BusinessReport }
	 * 
	 */
	public void setOfsReport(Ofsml13BusinessReport value) {
		this.ofsReport = value;
	}

}