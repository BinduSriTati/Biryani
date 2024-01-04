public class Ticket {
    public int number;
    public int seatNo;

    public Ticket(int number, int seatNo) {
        this.number = number;
        this.seatNo = seatNo;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", seatNo=" + seatNo +
                '}';
    }
}

