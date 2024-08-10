package desafiosPoo.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Phone {
   
	private String mark;
	private String model;
	private List<Contact> contatos=new ArrayList();
	
	public abstract void makeCall(String number);
	public abstract void registerCall();
	public abstract void saveContact(Contact contact);
	public abstract void answerCall();
	public abstract void startVoiceMail();
	
}
