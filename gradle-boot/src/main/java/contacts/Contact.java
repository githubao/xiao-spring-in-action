package contacts;

/**
 * 联系人类
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/30 20:34
 */

public class Contact {
    private Long id;
    private String PhoneNumber;
    private String userName;

    public Contact(Long id, String phoneNumber, String name) {
        this.id = id;
        PhoneNumber = phoneNumber;
        this.userName = name;
    }

    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
