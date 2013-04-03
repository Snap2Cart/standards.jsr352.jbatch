//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-11/28/2011 06:21 AM(foreman)- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.26 at 11:25:40 AM EDT 
//


package com.ibm.jbatch.jsl.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chunk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chunk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reader" type="{http://xmlns.jcp.org/xml/ns/javaee}ItemReader"/>
 *         &lt;element name="processor" type="{http://xmlns.jcp.org/xml/ns/javaee}ItemProcessor" minOccurs="0"/>
 *         &lt;element name="writer" type="{http://xmlns.jcp.org/xml/ns/javaee}ItemWriter"/>
 *         &lt;element name="checkpoint-algorithm" type="{http://xmlns.jcp.org/xml/ns/javaee}CheckpointAlgorithm" minOccurs="0"/>
 *         &lt;element name="skippable-exception-classes" type="{http://xmlns.jcp.org/xml/ns/javaee}ExceptionClassFilter" minOccurs="0"/>
 *         &lt;element name="retryable-exception-classes" type="{http://xmlns.jcp.org/xml/ns/javaee}ExceptionClassFilter" minOccurs="0"/>
 *         &lt;element name="no-rollback-exception-classes" type="{http://xmlns.jcp.org/xml/ns/javaee}ExceptionClassFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="checkpoint-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="item-count" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time-limit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="skip-limit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="retry-limit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chunk", propOrder = {
    "reader",
    "processor",
    "writer",
    "checkpointAlgorithm",
    "skippableExceptionClasses",
    "retryableExceptionClasses",
    "noRollbackExceptionClasses"
})
@Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
public class Chunk {

    @XmlElement(required = true)
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected ItemReader reader;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected ItemProcessor processor;
    @XmlElement(required = true)
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected ItemWriter writer;
    @XmlElement(name = "checkpoint-algorithm")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected CheckpointAlgorithm checkpointAlgorithm;
    @XmlElement(name = "skippable-exception-classes")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected ExceptionClassFilter skippableExceptionClasses;
    @XmlElement(name = "retryable-exception-classes")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected ExceptionClassFilter retryableExceptionClasses;
    @XmlElement(name = "no-rollback-exception-classes")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected ExceptionClassFilter noRollbackExceptionClasses;
    @XmlAttribute(name = "checkpoint-policy")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String checkpointPolicy;
    @XmlAttribute(name = "item-count")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String itemCount;
    @XmlAttribute(name = "time-limit")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String timeLimit;
    @XmlAttribute(name = "skip-limit")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String skipLimit;
    @XmlAttribute(name = "retry-limit")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected String retryLimit;

    /**
     * Gets the value of the reader property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReader }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public ItemReader getReader() {
        return reader;
    }

    /**
     * Sets the value of the reader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReader }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setReader(ItemReader value) {
        this.reader = value;
    }

    /**
     * Gets the value of the processor property.
     * 
     * @return
     *     possible object is
     *     {@link ItemProcessor }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public ItemProcessor getProcessor() {
        return processor;
    }

    /**
     * Sets the value of the processor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemProcessor }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setProcessor(ItemProcessor value) {
        this.processor = value;
    }

    /**
     * Gets the value of the writer property.
     * 
     * @return
     *     possible object is
     *     {@link ItemWriter }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public ItemWriter getWriter() {
        return writer;
    }

    /**
     * Sets the value of the writer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemWriter }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setWriter(ItemWriter value) {
        this.writer = value;
    }

    /**
     * Gets the value of the checkpointAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link CheckpointAlgorithm }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public CheckpointAlgorithm getCheckpointAlgorithm() {
        return checkpointAlgorithm;
    }

    /**
     * Sets the value of the checkpointAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckpointAlgorithm }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setCheckpointAlgorithm(CheckpointAlgorithm value) {
        this.checkpointAlgorithm = value;
    }

    /**
     * Gets the value of the skippableExceptionClasses property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionClassFilter }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public ExceptionClassFilter getSkippableExceptionClasses() {
        return skippableExceptionClasses;
    }

    /**
     * Sets the value of the skippableExceptionClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionClassFilter }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setSkippableExceptionClasses(ExceptionClassFilter value) {
        this.skippableExceptionClasses = value;
    }

    /**
     * Gets the value of the retryableExceptionClasses property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionClassFilter }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public ExceptionClassFilter getRetryableExceptionClasses() {
        return retryableExceptionClasses;
    }

    /**
     * Sets the value of the retryableExceptionClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionClassFilter }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setRetryableExceptionClasses(ExceptionClassFilter value) {
        this.retryableExceptionClasses = value;
    }

    /**
     * Gets the value of the noRollbackExceptionClasses property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionClassFilter }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public ExceptionClassFilter getNoRollbackExceptionClasses() {
        return noRollbackExceptionClasses;
    }

    /**
     * Sets the value of the noRollbackExceptionClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionClassFilter }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setNoRollbackExceptionClasses(ExceptionClassFilter value) {
        this.noRollbackExceptionClasses = value;
    }

    /**
     * Gets the value of the checkpointPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getCheckpointPolicy() {
        return checkpointPolicy;
    }

    /**
     * Sets the value of the checkpointPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setCheckpointPolicy(String value) {
        this.checkpointPolicy = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setItemCount(String value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the timeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the value of the timeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setTimeLimit(String value) {
        this.timeLimit = value;
    }

    /**
     * Gets the value of the skipLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getSkipLimit() {
        return skipLimit;
    }

    /**
     * Sets the value of the skipLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setSkipLimit(String value) {
        this.skipLimit = value;
    }

    /**
     * Gets the value of the retryLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public String getRetryLimit() {
        return retryLimit;
    }

    /**
     * Sets the value of the retryLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-26T11:25:40-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setRetryLimit(String value) {
        this.retryLimit = value;
    }

    /*
     * Appended by build tooling.
     */  
	public String toString() {
	    StringBuffer buf = new StringBuffer(250);
	    String chkAlgStr = checkpointAlgorithm == null ? "null" : checkpointAlgorithm.getRef();
	    buf.append("Chunk: checkpointAlgorithm = " + chkAlgStr);
	    buf.append(", skippableExceptions = " + skippableExceptionClasses);
	    buf.append(", retryableExceptions = " + retryableExceptionClasses);
	    buf.append(", reader = " + reader);
	    buf.append(", processor = " + processor);
	    buf.append(", writer = " + writer);
	    buf.append(", checkpointPolicy = " + checkpointPolicy);
	    buf.append(", itemCount = " + itemCount);
	    buf.append(", timeLimit = " + timeLimit);
	    buf.append(", skipLimit = " + skipLimit);
	    buf.append(", retryLimit = " + retryLimit);
	    buf.append("\n");
	    return buf.toString();
    }
}