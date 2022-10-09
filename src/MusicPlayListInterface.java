import java.io.File;

/**
 * Public methods for a program that maintains a music play list in a csv file.
 * @author ureel
 * Class: CS1131 Accelerated Introduction to Programming
 * Week 6
 */
public interface MusicPlayListInterface {
   /**
    * Add an entry to the end of the play list.
    * Duplicates are not allowed.
    *
    * @param artistName the name of the artist or band.
    * @param songTitle the title of the song.
    * @param albumTitle the title of the album the song is from.
    * @throws IllegalArgumentException if any of the parameters is null.
    * @return true if this entry was added, false otherwise
    */
   public boolean addEntry( String artistName, String songTitle, String albumTitle);

   /**
    * Deletes the first entry matching the artistName, songTitle, and albumTitle.
    * @param artistName the name of the artist or band.
    * @param songTitle the title of the song.
    * @param albumTitle the title of the album the song is from.
    * @throws IllegalArgumentException if any of the parameters is null.
    * @return true if this entry was deleted, false otherwise
    */
   public boolean deleteEntry( String artistName, String songTitle, String albumTitle);

   /**
    * Save the playlist to a CSV file.
    * @param file file to save the data to
    * @return the number of records saved or -1 if an error occurs.
    * @throws IllegalArgumentException if the file is not a CSV file.
    */
   public int save( File  file ) throws IllegalArgumentException;

   /**
    * Load the playlist from a CSV file.
    * The load operation destroys all previous records.
    * @param file - file to load the data from
    * @return the number of records loaded or -1 if an error occurs.
    * @throws IllegalArgumentException if the file is not a CSV file.
    */
   public int load( File  file ) throws IllegalArgumentException;
}
