package contactList;
import java.util.ArrayList;
import java.util.Scanner;
public class myContactListApp {
    public static Scanner sc= new Scanner(System.in); 
    public static void main(String[] args) {
        ContactList contactList= new ContactList();
        int menuItemNumber=0;
        do{
           menu();
           menuItemNumber= sc.nextInt();
           switch(menuItemNumber){
               case 1: 
                   Contact contact = createNewContact();
                   contactList.createContact(contact);
                   System.out.println("Successfully Created...");
                   System.out.println();
                   break;
               case 2: 
                   showAllContacts(contactList.getContacts());
                   break;
               case 3: 
                   searchList(contactList);
                   break;
               case 4: 
                   deleteContact(contactList);
                   break;
               case 5:
                   System.exit(0);
               default: 
                   System.out.println("Select a Number Between 1 & 5...");
           } 
        }while(menuItemNumber!=5);  
    }
    //menu view method
    private static void menu(){
        System.out.println(String.format("%5s%3s%s","1.","","Create Contact"));
        System.out.println(String.format("%5s%3s%s","2.","","View Contact"));
        System.out.println(String.format("%5s%3s%s","3."," ","Search Contact"));
        System.out.println(String.format("%5s%3s%s","4."," ","Delete Contact"));
        System.out.println(String.format("%5s%3s%s","5."," ","Exit"));
        System.out.println("________________________");
        System.out.print("Enter Your Choice: ");   
    }
    //create contact method
    private static Contact createNewContact(){
        Contact contact;
        sc.nextLine();
        System.out.println("fill the bellow form correctly...");
        
        System.out.print("Enter Name : ");
        String name= sc.nextLine();
        
        System.out.print("Enter Phonr No : ");
        String phnno= sc.nextLine();
        
        System.out.print("Enter Email(type N if not available) : ");
        String email= sc.nextLine();
        
        if(email.equalsIgnoreCase("n")){
            contact = new Contact(name, phnno);
        }
        else{
            contact = new Contact(name, phnno,email);
        }
        return contact;
    }
    //show all contact method
    private static void showAllContacts(ArrayList<Contact> contacts){
        int i=0;
        System.out.println("All Contacts...");
        System.out.println("-------------------");
        for(Contact contact: contacts){
            String email=contact.getEmail();
            System.out.println(String.format("%-5d%-30s%-30s%-30s",i++, contact.getName(),contact.getPohnNo(),email==null?"N/A":email));
        }
         System.out.println("-------------------");
    }
    //search contact method
    private static void searchList(ContactList contactList){
        sc.nextLine();
        System.out.print("Enter Name to Search: ");
        String name= sc.nextLine();
        Contact contact = contactList.searchContact(name);
        
        if(contact!=null){
            String email= contact.getEmail();
            System.out.println("<<<<<Contact  Found>>>>>");
            System.out.println(String.format("%-30s%-30s%-30s", contact.getName(),contact.getPohnNo(),email==null?"N/A":email)); 
            System.out.println("-------------------");
        }else{
            System.out.println("-------------------");
            System.out.println("Contact Not Found!!!!!");
            System.out.println("-------------------");
        }
    }
    //delete contact method
    private static void deleteContact(ContactList contactList){
        showAllContacts(contactList.getContacts());
        System.out.print("Enter index No: ");
        int index= sc.nextInt();
        contactList.removeContact(index);
        System.out.println("Successfully remove..."); 
    }
}