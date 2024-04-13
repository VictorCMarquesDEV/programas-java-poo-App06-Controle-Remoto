package App06;

public class ControleRemoto implements Controlador{
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	public ControleRemoto(){
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isTocando() {
		return tocando;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	public void ligar() {
		this.setLigado(true);
	}
	public void desligar() {
		this.setLigado(false);
	}
	public void abrirMenu() {
		if (this.isLigado()) {
			System.out.println("----- Menu -----");
			System.out.println("Está ligado? " + this.isLigado());
			System.out.println("Está tocando? " + this.isTocando());
			System.out.println("Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i++) {
				System.out.print("|");
			}
		}
	}
	public void fecharMenu() {
		System.out.println("\nFechando Menu...");
	}
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 1);
		}
	}
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}
	public void fecharMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
	}
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
	}
}