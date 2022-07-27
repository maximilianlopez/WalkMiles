//*******************************************************************
//
//   File: WalkMiles.java
//
//   Author: maximilian
//
//   Class: WalkMiles
// 
//   --------------------
//      This program generates variations of the 500 miles song.
//
//*******************************************************************

public class WalkMiles
{
    public static void main (String[] args)
    {   
        //Distance Variables
        int first = 77;
        int second = 80;

        printSong(first, second);
        
    }

    public static void printSong(int x, int y) {
        //500 miles (by The Proclaimers) chorus:
        System.out.println("But I would walk " + x + " miles");
        System.out.println("And I would walk " + y + " more");
        System.out.println("Just to be the man who walks " + (x + y) + " miles");
        System.out.println("To fall down at your door");

    }
}
