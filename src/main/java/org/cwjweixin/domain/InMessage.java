package org.cwjweixin.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class InMessage implements Serializable {
	private static final long seriaVersionUID=1L;
	
	@XmlElement(name="ToUserName")
	private String toUSerName;
	@XmlElement(name="FromUserName")
	private String fromUserName;
	@XmlElement(name="CreateTime")
	private long createTime;
	@XmlElement(name="MygType")
	private String mygType;
	@XmlElement(name="MygId")
	private long mygId;
	public String getToUSerName() {
		return toUSerName;
	}
	public void setToUSerName(String toUSerName) {
		this.toUSerName = toUSerName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public String getMygType() {
		return mygType;
	}
	public void setMygType(String mygType) {
		this.mygType = mygType;
	}
	public long getMygId() {
		return mygId;
	}
	public void setMygId(long mygId) {
		this.mygId = mygId;
	}
	abstract public String toString();
}
