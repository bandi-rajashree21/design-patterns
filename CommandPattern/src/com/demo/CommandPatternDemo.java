package com.demo;

public class CommandPatternDemo {
      public static void main(String[] args)
      {
    	  Light light = new Light();
          MusicSystem musicSystem = new MusicSystem();

          // Commands
          Command lightOn = new LightOnCommand(light);
          Command lightOff = new LightOffCommand(light);
          Command playMusic = new PlayMusicCommand(musicSystem);
          Command stopMusic = new StopMusicCommand(musicSystem);

          // Invoker
          RemoteControl remote = new RemoteControl();

          // Execute commands
          remote.setCommand(lightOn);
          remote.pressButton();

          remote.setCommand(playMusic);
          remote.pressButton();

          remote.setCommand(stopMusic);
          remote.pressButton();

          remote.setCommand(lightOff);
          remote.pressButton();
      }
}
