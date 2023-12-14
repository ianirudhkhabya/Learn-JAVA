# Mobile Phone Contact Management System

## Description

This program implements a simple mobile phone with the following capabilities:

- **Store, Modify, Remove, and Query Contact Names:** The mobile phone allows users to perform basic operations on contact names, such as storing, modifying, removing, and querying.

- **Contact Class:** A separate class named `Contact` is created to encapsulate contact information, including the name and phone number.

- **Master Class (MobilePhone):** The `MobilePhone` class serves as the master class, holding an ArrayList of Contact objects. This class provides functionality for managing contacts, as specified below.

- **Menu Options:**

  - **Quit:** Exit the program.
  - **Print List of Contacts:** Display the list of contacts.
  - **Add New Contact:** Add a new contact to the mobile phone.
  - **Update Existing Contact:** Modify information for an existing contact.
  - **Remove Contact:** Remove a contact from the mobile phone.
  - **Search/Find Contact:** Search for a contact by name.

- **Contact Existence Check:** When adding or updating contacts, the program checks if the contact already exists (based on the name).

- **Encapsulation:** The inner workings of the ArrayList are not exposed to the `MobilePhone` class. Operations are performed using Contact objects exclusively, without direct manipulation of the ArrayList.
