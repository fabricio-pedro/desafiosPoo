package desafiosPoo.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

public class Iphone extends Phone implements MusicPlayer, Broswer {

	@Getter @Setter
	private String SoVersion;
	private String selectedMusic;
	private List<String> musicas=new ArrayList();
	
	@Override
	public void makeCall(String number) {
		System.out.println("Fazendo uma ligação para o numero:"+number);
		
	}

	@Override
	public void registerCall() {
		System.out.println("registrando uma chamada");
		
	}

	@Override
	public void saveContact(Contact contact) {
	 this.getContatos().add(contact);
		
	}

	@Override
	public void answerCall() {
		System.out.println("Atendendo uma ligação");
		
	}

	@Override
	public void startVoiceMail() {
		System.out.println("iniciando o correio de voz");
		
	}

	@Override
	public void selectMusic(String name) {
	 Optional<String> selectMusicOpt=this.musicas.stream().
		filter(x->x.equals(name))
	    .findFirst();
	    if (selectMusicOpt.isPresent()) {
	    	this.selectedMusic=selectMusicOpt.get();
	    }else {
	    	
	    	throw new IllegalArgumentException("Musica não encontrada");
	    	
	    }
	   		
		
	}

	@Override
	public void play() {
		System.out.println("Musica selecionada sendo tocada:"+selectedMusic);
		
	}

	@Override
	public void stopPlay() {
		System.out.println("A musica foi parada");
		
	}

	@Override
	public void showPage(String url) {
		System.out.println("Conteudo da pagina com url:" +url);
		
	}

	@Override
	public void refreshPage() {
		
		System.out.println("Conteudo esta sendo atualizado");
		
	}

	@Override
	public void addNewTab() {
		System.out.println("Uma nova é aberta");
		
	}

}
