package designpattern.comportamentais;

public class Quarto {
    private int numberRoom;
    private boolean status;

    public Quarto(int number, boolean status)
    {
        this.numberRoom = number;
        this.status = status;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
