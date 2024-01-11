package Task19;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Author autor1 = new Author("Creanga", "romana");
        Author autor2 = new Author("Arghezi", "romana");
        Author autor3 = new Author("Armand", "italian");

        Author[] autori = {autor1, autor2, autor3};

        Poem carte1 = new Poem( autor1, 20);
        Poem carte2 = new Poem (autor2, 50);
        Poem carte3 = new Poem (autor3, 100);

        Poem[] carti = {carte1, carte2, carte3};

        System.out.println(Arrays.toString(carti));
        System.out.println(Arrays.toString(autori));

        printAuthorNameOfLargestPoem(carti);
    }

    public static void printAuthorNameOfLargestPoem (Poem[] carti) {
        Poem maxPoem = carti[0];
        for (Poem carte: carti) {
            if (maxPoem.stropheNumbers < carte.stropheNumbers) {
                maxPoem = carte;
            }
        }
        System.out.println(maxPoem.creator.surname);
    }
}


