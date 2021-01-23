package Adapter;
//Addapter does all the stuff that ContactManager can't do
import java.awt.*;

public class Adapter implements TableData {
    public ContactManager contactManager;

    public Adapter(ContactManager cm) {
        contactManager = cm;

        Contact contact = new Contact();
        contact.setEmail("yousexythang@gmail.com");
        contact.setFirstName("Hot");
        contact.setLastName("Chocolate");
        contact.setPhone("80187654321");

        Contact contact1 = new Contact("Joe", "Shmoe", "7898765432", "get@me.com");
        contactManager.addContact(contact);
        contactManager.addContact(contact1);

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return contactManager.getContactCount();
    }

    @Override
    public int getColumnSpacing() {
        return 1;
    }

    @Override
    public int getRowSpacing() {
        return 0;
    }

    @Override
    public char getHeaderUnderline() {
        return 0;
    }

    @Override
    public String getColumnHeader(int col) {
        String[] headers = new String[] {
                "First Name",
                "Last Name",
                "Phone Num",
                "Email"
        };
        return headers[col];
    }

    @Override
    public int getColumnWidth(int col) {
        String[] headers = new String[] {
                "First Name",
                "Last Name",
                "Phone Num",
                "Email"
        };
        return headers[col].length();
    }

    @Override
    public Justification getColumnJustification(int col) {
        return Justification.Left;
    }

    @Override
    public String getCellValue(int row, int col) {
        Contact c = contactManager.getContact(row);
        StringBuilder sb = new StringBuilder();
        switch (col) {
            case 0:
                sb.append(c.getFirstName());
                break;
            case 1:
                sb.append(c.getLastName());
                break;
            case 2:
                sb.append(c.getPhone());
                break;
            case 3:
                sb.append(c.getEmail());
                break;
            default:

        }
        return sb.toString();
    }
}
