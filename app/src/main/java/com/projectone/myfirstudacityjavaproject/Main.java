package com.projectone.myfirstudacityjavaproject;

class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact friendOne = new Contact();
        friendOne.name = "Vladimir";
        friendOne.phoneNumber = "14041930";
        myContactsManager.addContact(friendOne);

        Contact friendTwo = new Contact();
        friendTwo.name = "Viktor";
        friendTwo.phoneNumber = "0000000";
        myContactsManager.addContact(friendTwo);

        Contact result = myContactsManager.searchContact("Viktor");
        System.out.println(result.phoneNumber);

    }
}