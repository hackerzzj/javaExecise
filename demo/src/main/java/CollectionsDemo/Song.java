package CollectionsDemo;

import java.util.Objects;

/**
 * @author:Administrator
 * @date:2021/3/23 0023 11:15
 */
public class Song {
    public String songName;
    public String songAuthor;

    public Song(String songName, String songAuthor) {
        this.songName = songName;
        this.songAuthor = songAuthor;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", songAuthor='" + songAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (songName != null ? !songName.equals(song.songName) : song.songName != null) return false;
        return songAuthor != null ? songAuthor.equals(song.songAuthor) : song.songAuthor == null;
    }

    @Override
    public int hashCode() {
        int result = songName != null ? songName.hashCode() : 0;
        result = 31 * result + (songAuthor != null ? songAuthor.hashCode() : 0);
        return result;
    }

    public Song() {
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongAuthor() {
        return songAuthor;
    }

    public void setSongAuthor(String songAuthor) {
        this.songAuthor = songAuthor;
    }
}
