/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gezgin_kargocu_problemi;

/**
 *
 * @author berka
 */
public class Stopwatch {
    private long startTime;
    private long stopTime;

    /**
     starting the stop watch.
    */
    public void start(){
          startTime = System.nanoTime();
    }

    /**
     stopping the stop watch.
    */
    public void stop()
    {     stopTime = System.nanoTime(); }

    /**
    elapsed time in nanoseconds.
    */
    public long time(){
          return (stopTime - startTime);
    }

    public String toString(){
        return "elapsed time: " + time() + " nanoseconds.";
    }
}
