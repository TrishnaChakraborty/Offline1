/**
 * Created by DELL on 9/20/2015.
 */
public class Student {
    private String studentName;
    private String studentNo;
    private Room room;

    public Student(){
        //do noting
    }
    public Student(String name, String no, Room r) {
        studentName = name;
        studentNo = no;
        room = r;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name){
        studentName = name;
    }
    public String getStudentNo() {
        return studentNo;
    }
    public void setStudentNo(String no){
        studentNo = no;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room r){
        room = r;
    }
    public void print(){
        System.out.println ("Student No: " + getStudentNo() + ", " + getStudentName() + ", resides on " + room.getHallName() + " Hall, Room no, " + room.getRoomNo());
    }
}
