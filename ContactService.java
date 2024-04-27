package main;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

	List<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
	}

	public boolean addContact(Contact contact) {
		
		if (contact != null && !contactExists(contact.getId())) {
			contacts.add(contact);
			return true;
		}
		return false;
	}

	public boolean deleteContact(String contactId) {
		
		for (Contact contact : contacts) {
			
			if (contact.getId().equals(contactId)) {
				contacts.remove(contact);
				return true;
			}
		}
		return false;
	}

	public boolean updateContact(String contactId, String field, String value) {
		
		for (Contact contact : contacts) {
			
			if (contact.getId().equals(contactId)) {
				switch (field) {
				case "firstName":
					contact.setFirstName(value);
					break;
				case "lastName":
					contact.setLastName(value);
					break;
				case "phoneNumber":
					contact.setPhoneNumber(value);
					break;
				case "address":
					contact.setAddress(value);
					break;
				default:
					return false;
				}
				return true;
			}
		}
		return false;
	}

	public boolean contactExists(String contactId) {
		for (Contact contact : contacts) {
			if (contact.getId().equals(contactId)) {
				return true;
			}
		}
		return false;
	}
	
	public Contact getContact(String contactId) {
		
		for (Contact contact : contacts) {
			if (contact.getId().equals(contactId)) {
				return contact;
			}
		}
		return null;
	}
}
