package Task19;

public class Author {
    String surname;
    String nationality;

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }


    @Override
    public String toString() {
        return "{ surname = " + this.surname + ", nationality = " + this.nationality + " }";
    }
}
