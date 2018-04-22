package contactList;
import java.util.ArrayList;
public class ContactList {
  // ArrayList<Contact> contacts = new ArrayList<>();
   public ArrayList<Contact> contacts;
   
   public ContactList(){
       contacts= new ArrayList<>(); 
   }
   
   public void createContact(Contact contact){
       contacts.add(contact);
   }
   
   public int getTotalContect(){
       return contacts.size();
   }
   
   public void removeContact(int index){
        contacts.remove(index);
   }
   
   public Contact searchContact(String name){
       for(Contact c : contacts){
           if(c.getName().equalsIgnoreCase(name)){
               return c;
           }
       }
       return null;
   }
   
   public ArrayList<Contact> getContacts(){
       return contacts;
   }

    @Override
    public String toString() {
        return "ContactList{" + "contacts=" + contacts + '}';
    }
}
