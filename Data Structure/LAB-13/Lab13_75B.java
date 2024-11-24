// Write a program to simulate music player application using suitable data 
// structure. There is no estimation about number of music files to be managed by 
// the music player. Your program should support all the basic music player 
// operations to play and manage the playlist. 

import java.util.*;

class Song {
    String title;
    Song next;
    Song prev;

    Song(String title) {
        this.title = title;
        this.next = null;
        this.prev = null;
    }
}

public class Lab13_75B {
    private Song currentSong;
    private Song head;
    private Song tail;

    void MusicPlayer() {
        this.currentSong = null;
        this.head = null;
        this.tail = null;
    }

    // Add a song to the playlist
    void addSong(String title) {
        Song newSong = new Song(title);

        if (head == null) {
            head = newSong;
            tail = newSong;
            currentSong = newSong;
            newSong.next = newSong;
            newSong.prev = newSong;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            newSong.next = head;
            head.prev = newSong;
            tail = newSong;
        }
        System.out.println("Song added: " + title);
    }

    // Remove a song from the playlist
    void removeSong(String title) {
        if (head == null) {
            System.out.println("The playlist is empty.");
            return;
        }

        Song temp = head;
        do {
            if (temp.title.equals(title)) {
                if (temp == head && temp == tail) {
                    head = null;
                    tail = null;
                    currentSong = null;
                } else {
                    if (temp == head) {
                        head = head.next;
                        tail.next = head;
                        head.prev = tail;
                    } else if (temp == tail) {
                        tail = tail.prev;
                        tail.next = head;
                        head.prev = tail;
                    } else {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                    if (currentSong == temp) {
                        currentSong = head;
                    }
                }
                System.out.println("Song removed: " + title);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Song not found: " + title);
    }

    // Play the current song
    void playSong() {
        if (currentSong != null) {
            System.out.println("Playing: " + currentSong.title);
        } else {
            System.out.println("No songs in the playlist.");
        }
    }

    // Move to the next song
    void nextSong() {
        if (currentSong != null) {
            currentSong = currentSong.next;
            playSong();
        } else {
            System.out.println("No songs in the playlist.");
        }
    }

    // Move to the previous song
    void prevSong() {
        if (currentSong != null) {
            currentSong = currentSong.prev;
            playSong();
        } else {
            System.out.println("No songs in the playlist.");
        }
    }

    // Show the entire playlist
    void showPlaylist() {
        if (head == null) {
            System.out.println("The playlist is empty.");
            return;
        }

        Song temp = head;
        System.out.println("Playlist:");
        do {
            System.out.println(temp.title);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Lab13_75B player = new Lab13_75B();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Player Menu:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Play Song");
            System.out.println("4. Next Song");
            System.out.println("5. Previous Song");
            System.out.println("6. Show Playlist");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    player.addSong(title);
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    String removeTitle = scanner.nextLine();
                    player.removeSong(removeTitle);
                    break;
                case 3:
                    player.playSong();
                    break;
                case 4:
                    player.nextSong();
                    break;
                case 5:
                    player.prevSong();
                    break;
                case 6:
                    player.showPlaylist();
                    break;
                case 0:
                    System.out.println("Exiting Music Player.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
