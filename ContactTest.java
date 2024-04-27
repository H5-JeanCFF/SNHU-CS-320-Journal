package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    public void testInvalidContactID() {
    	assertAll(
    			() -> assertThrows(IllegalArgumentException.class, () ->  new Contact("12345678991", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd")),
    			() -> assertThrows(IllegalArgumentException.class, () ->  new Contact(null, "Jean", "Farfan", "4843334444", "6665 S Hello World Rd"))
    			);
    	
    }

    @Test
    public void testInvalidFirstName() {
    	assertAll(
    			() -> assertThrows(IllegalArgumentException.class, () -> new Contact("1234567899", "Jean1234567", "Farfan", "4843334444", "6665 S Hello World Rd")),
    			() -> assertThrows(IllegalArgumentException.class, () -> new Contact("1234567899", null, "Farfan", "4843334444", "6665 S Hello World Rd"))
    			);
    	
    }

    @Test
    public void testInvalidLastName() {
    	assertAll(
    			() -> assertThrows(IllegalArgumentException.class, () ->  new Contact("1234567899", "Jean", "Farfan12345", "4843334444", "6665 S Hello World Rd")),
    			() -> assertThrows(IllegalArgumentException.class, () ->  new Contact("1234567899", "Jean", null, "4843334444", "6665 S Hello World Rd"))
    			);
    	
    }

    @Test
    public void testInvalidPhoneNumber() {
    	assertAll(
    			() -> assertThrows(IllegalArgumentException.class, () -> new Contact("1234567899", "Jean", "Farfan", "48433344445", "6665 S Hello World Rd")),
    			() -> assertThrows(IllegalArgumentException.class, () -> new Contact("1234567899", "Jean", "Farfan", null, "6665 S Hello World Rd"))
    			);
    }

    @Test
    public void testInvalidAddress() {
    	assertAll(
    			() -> assertThrows(IllegalArgumentException.class, () -> new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd123456789123456789123456789")),
    			() -> assertThrows(IllegalArgumentException.class, () -> new Contact("1234567899", "Jean", "Farfan", "4843334444", null))
    			);
    }
    
    @Test
    public void testGetId() {
    	Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
    	
    	assertEquals("1234567899", contact.getId());
    }
    
    @Test
    public void testGetAndSetFirstName() {
    	Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
    	contact.setFirstName("Jane");
    	assertEquals("Jane", contact.getFirstName());
    }
    
    @Test
    public void testGetAndSetLastName() {
    	Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
    	contact.setLastName("Fallu");
    	assertEquals("Fallu", contact.getLastName());
    }
    
    @Test
    public void testGetAndSetPhoneNumber() {
    	Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
    	contact.setPhoneNumber("2123334444");
    	assertEquals("2123334444", contact.getPhoneNumber());
    }
    
    @Test
    public void testGetAndSetAddress() {
    	Contact contact = new Contact("1234567899", "Jean", "Farfan", "4843334444", "6665 S Hello World Rd");
    	contact.setAddress("5555 W hi world Blv");
    	assertEquals("5555 W hi world Blv", contact.getAddress());
    }
}
