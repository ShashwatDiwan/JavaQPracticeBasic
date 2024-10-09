/*. "Write a program, to implement the following hierarchy.
Displays information of each class the rectangle represents the classes.
The classes Movie and MusicVideo inherits all the members of the class VideoTape.
"*/

package QuestionBank;

class VideoTape{
    String Title = "Harry Potter";
    String Length = "3hours";
    String Available = "YES";

    void show(){
        System.out.println("Title :" + Title);
        System.out.println("Length :" + Length);
        System.out.println("Available :" + Available);
    }
}

class Movie extends VideoTape{
    String director = "J.K.Rowling";
    double rating = 8.8;

    @Override
    public void show(){
        System.out.println("Director : " + director);
        System.out.println("Rating : " + rating);
    }
}

class MusicVideo extends VideoTape{
    String ArtistCategory = "SciFi";

    @Override
    public void show(){
        System.out.println("Artist Category : " + ArtistCategory);
    }
}


public class Hierarchy {
    public static void main(String[] args) {
        VideoTape videoTape = new Movie();
        VideoTape videoTape1 = new MusicVideo();

        videoTape1.show();
        videoTape.show();
    }
}
