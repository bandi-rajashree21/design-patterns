package com.demo;

public class PlayMusicCommand implements Command {
    private MusicSystem musicSystem;

    public PlayMusicCommand(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public void execute() {
        musicSystem.playMusic();
    }
}

