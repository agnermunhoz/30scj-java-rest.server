package fiap.scj.restful.ws.resources.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private Date dataCreation;

	public Date getDataCreation() {
		return dataCreation;
	}

	public void setDataCreation(Date dataCreation) {
		this.dataCreation = dataCreation;
	}

	@Override
	public String toString() {
		return "Message [text=" + text + ", dataCreation=" + dataCreation + "]";
	}

}
