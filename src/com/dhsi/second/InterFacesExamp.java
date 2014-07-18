package com.dhsi.second;

public interface InterFacesExamp {
	void musicPlayer();
	void powerWindows();

}

class Suzuki implements InterFacesExamp
{

	@Override
	public void musicPlayer() {
		// TODO Auto-generated method stub
		System.out.println("having sony music player in suzuki");
	}

	@Override
	public void powerWindows() {
		// TODO Auto-generated method stub
		System.out.println("having powerwindows in suzuki");
	}
	
	
		public static void main(String[] args) {
			 Suzuki s= new Suzuki();
			 s.musicPlayer();
			 s.powerWindows();
			/*sony son= new sony();
			son.powerWindows();
			son.musicPlayer();*/
		}	
	
	
	
}
