package contactList;
public class Contact {
    //class properties
    private String name;
    private String pohnNo;
    private String email;
    //constructor with two parametre 
    public Contact(String name, String phnNo){
        this.name=name;
        this.pohnNo=phnNo;
    }
    //constructor with thre parametre
    public Contact (String name,String phnNo, String email){
        this.name=name;
        this.pohnNo=phnNo;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPohnNo() {
        return pohnNo;
    }

    public void setPohnNo(String pohnNo) {
        this.pohnNo = pohnNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", pohnNo=" + pohnNo + ", email=" + email + '}';
    }
}
