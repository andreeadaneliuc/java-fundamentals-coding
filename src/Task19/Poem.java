package Task19;

public class Poem {
    Author creator;
    int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    @Override
    public String toString() {
        return "{ " +
                "creator = " + creator +
                ", stropheNumbers = " + stropheNumbers +
                " }";
    }
}
