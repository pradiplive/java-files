package com.collections;

import java.util.*;

class Song{
	String songName;
	String composer;
	String lyricist;
	int no_of_instrument;
	public Song(String songName, String composer, String lyricist, int no_of_instrument) {
		super();
		this.songName = songName;
		this.composer = composer;
		this.lyricist = lyricist;
		this.no_of_instrument = no_of_instrument;
	}
	@Override
	public String toString() {
		return "Song [songName=" + songName + ", composer=" + composer + ", lyricist=" + lyricist
				+ ", no_of_instrument=" + no_of_instrument + "]";
	}
}

class Singer{
	String singerName;
	int age;
	String dOB;
	ArrayList<Song> songs;
	public Singer(String singerName, int age, String dOB, ArrayList<Song> songs) {
		super();
		this.singerName = singerName;
		this.age = age;
		this.dOB = dOB;
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "Singer [singerName=" + singerName + ", age=" + age + ", dOB=" + dOB + ", songs=" + songs + "]";
	}	
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Singer Name,Age of Singer, Date of Birth");
		String singerName = s.next();
		int age = s.nextInt();
		String dateOfBirth= s.next();
		System.out.println("Enter no of song sing by singer:");
		int count =s.nextInt();
		ArrayList<Song> v = new ArrayList<>();
		for (int i=0; i<count;i++)
		{
			System.out.println("Enter Song Name,Composer,Lyricist,No of Instrument");
			String songName =s.next();
			String composer = s.next();
			String Lyricist =s.next();
			int noOfInstrtu = s.nextInt();
			
			Song sc = new Song(songName, composer, Lyricist, i);
			v.add(sc);
//			v.addElement(sc);
		}
		
		
		Singer singer = new Singer(singerName, age, dateOfBirth, v);
		System.out.println("Singer Name:" + singer.singerName);
		System.out.println("Age of Singer:" + singer.age);
		System.out.println("Date of Birth:"+ singer.dOB);
		
		ArrayList<Song> songs = singer.songs;
		for( Song emp : songs)
		{
			System.out.println(emp);
		}
	}

}
