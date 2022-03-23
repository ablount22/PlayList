package Playlist;

import java.util.ArrayList;

public class PlayList {
	
	public String name;
	
	ArrayList<String> playList = new ArrayList<String>();
	

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<String> getPlayList() {
			return playList;
		}

		public void setPlayList(ArrayList<String> playList) {
			this.playList = playList;
		}
		
		public void printsong() {
			System.out.println(playList);
		}
			
		 boolean findSong (String song) {
				
				if(this.findSong(song)) {
					return this.getName().equals(song);
			
				}
				System.out.println("Choose a different song");
				return false;
				
	}
}

