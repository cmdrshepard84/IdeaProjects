package com.Ganzel;

public class Main {
    public static void main(String [] args){
        // Create the ContactsManager object
        ContactsManager myContactManager = new ContactsManager();

        //Create a new Contact object
        Contact friendMary = new Contact();
        friendMary.name = "Mary";
        friendMary.phoneNumber = "7155720601";
        friendMary.email = "mary.e.ganzel@gmail.com";
        //Add Contact to ContactsManager
        myContactManager.addContact(friendMary);

        //Create a new Contact object
        Contact friendLorelai = new Contact();
        friendLorelai.name = "Lorelai";
        friendLorelai.phoneNumber = "7153354499";
        friendLorelai.email = "lorelai.r.ganzel@gmail.com";
        //Add Contact to ContactsManager
        myContactManager.addContact(friendLorelai);

        //Create a new Contact object
        Contact friendBob = new Contact();
        friendBob.name = "Bob";
        friendBob.phoneNumber = "7155723341";
        friendBob.email = "RickyBobby@bigred.com";
        //Add Contact to ContactsManager
        myContactManager.addContact(friendBob);

        //Search for a Contact
        Contact result = myContactManager.searchContact("Lorelai");
        System.out.println(result.name + " " + result.phoneNumber + " " +result.email);
    }
}