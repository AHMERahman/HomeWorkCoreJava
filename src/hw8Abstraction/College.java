package hw8Abstraction;

public interface College {
	
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	public abstract void cmRoom();
	
	public static void comRomm() {
		
	}
	
	public default void labRom() {
		
	}


}
