package com.dsa.queue.nightclub;

public class Main {

    public static void main(String[] args) {

        NightClub hipHopNightGoersQueue = new NightClub();
        hipHopNightGoersQueue.joinQueue(new HipHopNightGoers(100000, 100, "Matthew Maconahay", 43, true));
        hipHopNightGoersQueue.joinQueue(new HipHopNightGoers(100001, 95, "James Baldwin", 43, true));
        hipHopNightGoersQueue.joinQueue(new HipHopNightGoers(100002, 90,"Lamar Maker", 43, true));
        hipHopNightGoersQueue.joinQueue(new HipHopNightGoers(100003, 87,"Oruni Wilson", 43, true));
        hipHopNightGoersQueue.joinQueue(new HipHopNightGoers(100004, 77,"Monica Esta", 43, true));
        hipHopNightGoersQueue.joinQueue(new HipHopNightGoers(100005, 70,"Winni Po", 43, true));
    }
}
