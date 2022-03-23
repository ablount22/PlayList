package Playlist;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		PlayList obj = new PlayList();
		
		ArrayList<String> PlayList = new ArrayList<String>();
		
		PlayList.add("Since You've Been Gone");
		PlayList.add("Off");
		PlayList.add("Money");
		PlayList.add("Mhmm");
		PlayList.add("Thirsty");
		
		System.out.println(PlayList);
		
		//System.out.println(PlayList.findSong()); <-- isn't working
		
		
		
	}

}
