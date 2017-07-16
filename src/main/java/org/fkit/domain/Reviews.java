package org.fkit.domain;

import java.io.Serializable;

public class Reviews implements Serializable {
	private int id;
	private int order_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	private String content;
	private int logistics;
	private int quality;
	private int service;
	public int getLogistics() {
		return logistics;
	}
	public void setLogistics(int logistics) {
		this.logistics = logistics;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Reviews [id=" + id + ", order_id=" + order_id + ", content=" + content + ", logistics=" + logistics
				+ ", quality=" + quality + ", service=" + service + "]";
	}


}
