/**
 * Created by DELL on 9/20/2015.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private Boolean status; // room allotment status

    public Room() {
        //do noting
    }

    public Room(String hall, int no) {
        hallName = hall;
        roomNo = no;
        status = false;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hall) {
        hallName = hall;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int no) {
        roomNo = no;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean state) {
        status = state;
    }

    public void print() {
        if (getStatus()) {
            System.out.println("Room No, " + getRoomNo() + " of " + getHallName() + " Hall is currently alloted.");
        } else {
            System.out.println("Room No, " + getRoomNo() + " of " + getHallName() + " Hall is currently available for allotment.");
        }

    }
}
