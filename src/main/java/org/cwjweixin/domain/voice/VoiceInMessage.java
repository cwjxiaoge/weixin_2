package org.cwjweixin.domain.voice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.cwjweixin.domain.InMessage;


@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class VoiceInMessage extends InMessage{
	private static final long serialVersionUID = 1L;
	
	
	@XmlElement(name="MediaId")
	private String mediaId;
	
	@XmlElement(name="Format")
	private String format;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return "VoiceInMessage [mediaId=" + mediaId + ", format=" + format + ", getToUSerName()=" + getToUSerName()
				+ ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMygType()=" + getMygType() + ", getMygId()=" + getMygId() + "]";
	}
	
}
