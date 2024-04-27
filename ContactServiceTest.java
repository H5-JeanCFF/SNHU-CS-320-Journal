package main;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
        assertAll(
        		() -> assertTrue(contactService.addContact(contact)),
        		() -> assertTrue(contactService.contactExists("1234567899"))
        		);
        
        
    }

    @Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
        contactService.addContact(contact);
        assertAll(
        		() -> assertTrue(contactService.deleteContact("1234567899")),
        		() -> assertFalse(contactService.contactExists("1234567899"))
        		);
    }

    @Test
    public void testUpdateContactFirstName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
        contactService.addContact(contact);
        assertAll(
        		() -> assertTrue(contactService.updateContact("1234567899", "firstName", "Jane")),
        		() -> assertEquals("Jane", contactService.getContact("1234567899").getFirstName())
        		);
        }
    
    @Test
    public void testUpdateContactLastName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
        contactService.addContact(contact);
        assertAll(
        		() -> assertTrue(contactService.updateContact("1234567899", "lastName", "Fallu")),
        		() -> assertEquals("Fallu", contactService.getContact("1234567899").getLastName())
        		);
        }

    @Test
    public void testUpdateContactPhoneNumber() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
        contactService.addContact(contact);
        assertAll(
        		() -> assertTrue(contactService.updateContact("1234567899", "phoneNumber", "2123334444")),
        		() -> assertEquals("2123334444", contactService.getContact("1234567899").getPhoneNumber())
        		);
    }
    
    @Test
    public void testUpdateContactAddress() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
        contactService.addContact(contact);
        assertAll(
        		() -> assertTrue(contactService.updateContact("1234567899", "address", "1234 W Ecuador Blv")),
        		() -> assertEquals("1234 W Ecuador Blv", contactService.getContact("1234567899").getAddress())
        		);
    }
}
