public class Passport {
    public int number;
    public int expiryDate;

    public Passport(int number, int expiryDate) {
        this.number = number;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
