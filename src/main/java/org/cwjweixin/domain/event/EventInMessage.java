package org.cwjweixin.domain.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.cwjweixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventInMessage extends InMessage{
	

	private static final long serialVersionUID = 1L;
	@XmlElement(name="Event")
	@JsonProperty("Event")
	private String event;
	@XmlElement(name="EeventKey")
	@JsonProperty("EeventKey")
	private String eventKey;
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	@Override
	public String toString() {
		return "EventInMessage [event=" + event + ", eventKey=" + eventKey + ", getToUSerName()=" + getToUSerName()
				+ ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMygType()=" + getMygType() + ", getMygId()=" + getMygId() + "]";
	}
	
}
