/*  QB 264:
Music player playlist: Write a program that simulates a music player playlist using an 
ArrayDeque. The program should allow the user to add songs to the playlist, play the next or 
previous song in the playlist, and shuffle the playlist. The program should keep track of the 
songs in the playlist using an ArrayDeque, where each element in the deque represents a 
song. When the user adds a song, you can use the addLast method to add it to the end of 
the playlist. When the user plays the next or previous song, you can use the removeFirst or 
removeLast method, respectively, to remove the current song from the front or back of the 
deque and add it to the end or beginning of the deque. When the user shuffles the playlist, 
you can use the shuffle method to randomly reorder the songs in the deque.
 */

// TASKS OF THIS PROGRAM:

/*
Add Song
Play Next Song
Play Previous Song
Shuffle Songs
Display Song List
Exit
 */

import java.util.*;

class MusicPlayer {
    public static void main(String[] args) {
        ArrayDeque<String> playlist = new ArrayDeque<String>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("~~~WELCOME TO MUSIC WORLD~~~");
            System.out.println(
                    "1) Add Song. \n 2) PlayNext \n 3) PlayPrevious \n 4) Shuffle Songs \n 5) Display Playlist \n 6) Exit.");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Song Name: ");
                    String song = sc.nextLine();
                    playlist.addLast(song);
                    System.out.println("Song Added Succesfully..");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("PlayList is Empty..");
                    } else {
                        String nextSong = playlist.removeFirst();
                        System.out.println("Playing Next: " + nextSong);
                        playlist.addLast(nextSong);
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println("PlayList is Empty..");
                    } else {
                        String previousSong = playlist.removeLast();
                        System.out.println("Playing Previous: " + previousSong);
                        playlist.addFirst(previousSong);
                    }
                    break;

                case 4:
                    if (playlist.isEmpty()) {
                        System.out.println("PlayList is Empty..");
                    } else {
                        ArrayList<String> al = new ArrayList<String>(playlist);

                        Collections.shuffle(al);

                        System.out.println("..........PlayList Shuffled........");
                    }

                case 5:
                    if (playlist.isEmpty()) {
                        System.out.println("PlayList is Empty..");
                    } else {
                        Iterator itr = playlist.iterator();
                        while (itr.hasNext()) {
                            System.out.println(itr.next());

                        }
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice !!");
                    break;
            }
        } while (true);

    }
}
