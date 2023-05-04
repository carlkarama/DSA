package com.dsa.queue.nightclub;

import java.util.PriorityQueue;
import java.util.Queue;

public class NightClub {

    public Queue<HipHopNightGoers> hipHopNightGoersQueue = new PriorityQueue<>();

    public boolean joinQueue(HipHopNightGoers hipHopNightGoers) {
        return this.hipHopNightGoersQueue.add(hipHopNightGoers);
    }

    public HipHopNightGoers leaveQueue() {
        return this.hipHopNightGoersQueue.remove();
    }
}
