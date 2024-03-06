package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.example.demo.entities.Song;

@Controller
public interface SongService {

	public void addSong(Song song);

	public List<Song> fetchAllSongs();

	public boolean songExits(String name);
	
	public void updateSong(Song song);


}
