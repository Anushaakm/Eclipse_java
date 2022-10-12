package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Song;

public class SongRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1=new Song();
		song1.lang="Kannada";
		song1.lyricst="Hamsaleka";
		song1.name="premaloka dinda banda";
		song1.singer="S Janaki";
		System.out.println(song1.lang);
		System.out.println(song1.lyricst);
		System.out.println(song1.name);
		System.out.println(song1.singer);
	}

}
