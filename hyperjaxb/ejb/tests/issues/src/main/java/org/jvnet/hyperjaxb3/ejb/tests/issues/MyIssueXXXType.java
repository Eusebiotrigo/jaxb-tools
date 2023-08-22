//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.06.22 at 10:43:38 PM CEST 
//

package org.jvnet.hyperjaxb3.ejb.tests.issues;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for issueXXXType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="issueXXXType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myIssueXXXType")
@Entity(name = "org.jvnet.hyperjaxb3.ejb.tests.issues.MyIssueXXXType")
@Table(name = "MYISSUEXXXTYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class MyIssueXXXType implements Serializable, Equals, HashCode {

	@XmlAttribute
	protected String value;
	@XmlAttribute(name = "Hjid")
	protected Long hjid;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	@Basic
	@Column(name = "VALUE_")
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the hjid property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	@Id
	@Column(name = "HJID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getHjid() {
		return hjid;
	}

	/**
	 * Sets the value of the hjid property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setHjid(Long value) {
		this.hjid = value;
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator,
			Object object, EqualsStrategy strategy) {
		if (!(object instanceof MyIssueXXXType)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final MyIssueXXXType that = ((MyIssueXXXType) object);
		{
			String lhsValue;
			lhsValue = this.getValue();
			String rhsValue;
			rhsValue = that.getValue();
			if (!strategy.equals(LocatorUtils.property(thisLocator,
					"simpleSingle", lhsValue), LocatorUtils.property(thatLocator,
					"simpleSingle", rhsValue), lhsValue, rhsValue)) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(Object object) {
		final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
		return equals(null, null, object, strategy);
	}

	public void hashCode(HashCodeBuilder hashCodeBuilder) {
		hashCodeBuilder.append(this.getValue());
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theValue;
			theValue = this.getValue();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator,
					"value", theValue), currentHashCode, theValue);
		}

		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

}
