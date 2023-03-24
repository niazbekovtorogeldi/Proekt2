package classs;

import interfaceImpl.Contact;

public class Profile extends Contact {
    private int id;
    private String userName;
    private long phoneNumber;
    private String password;
    private String status;
    private String imege;
   private  String messeg;


    public Profile(int id, String userName, long phoneNumber, String password, String status, String imege, String messeg) {
        this.id = id;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.status = status;
        this.imege = imege;
        this.messeg = messeg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImege() {
        return imege;
    }

    public void setImege(String imege) {
        this.imege = imege;
    }

    public String getMesseg() {
        return messeg;
    }

    public void setMesseg(String messeg) {
        this.messeg = messeg;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", imege='" + imege + '\'' +
                ", messeg='" + messeg + '\'' +
                '}';
    }
}