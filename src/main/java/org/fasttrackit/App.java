package org.fasttrackit;

public class App 
{
    public static void main( String[] args ) throws Exception {
        Race race = new Race();
        race.setTrackFullLevel(50);
        race.setTrackLength(200);
        race.start();
    }
}
