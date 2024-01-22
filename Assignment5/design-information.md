					Reminders Design Information

1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.
	- This was implemented by creating a class ReminderList, where users have the option to add (addReminder(name)), delete (deleteReminders(name))
	  and edit (editReminders(name)) reminders.

2. The application must contain a database (DB) of reminders and corresponding data.
	- Shown in the UML diagram as a design by representinghtat it holds the database of Reminder and the corresponding datas but not modeled as an UML guideline.

3. Users must be able to add reminders to a list by picking them from a hierarchical list,
where the first level is the reminder type (e.g., Appointment), and the second level is the
name of the actual reminder (e.g., Dentist Appointment).
	- When user choose addReminder there is called ReminderType to choose from predefined reminder types.
	- Another class called Reminder which consists the main creation objects of a reminder.

4. Users must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar names and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB.
	- If the user wants to add a different type of reminder they can through ReminderType.
	  ReminderTypeGroup consists of the predefined types in a list. But it also lets users add 
	  their own new type of reminder with new name as well as remove the type. The save it.
	- ReminderTypeGroup also searches in the DB for similiar remainderType. 

5. The reminders must be saved automatically and immediately after they are modified.
	- After a new type is defined, saveNewtype method in ReminderTypeGroup saves that.
	- saveReminder method further saves all the changes into DB.
	   

6. Users must be able to check off reminders in the list (without deleting them).
	- Reminder class has isCheckedoff boolean type to check whther it is checked off or not.

7. Users must also be able to clear all the check-off marks in the reminder list at once.
	- ReminderList has a method which allows the users to clea the checked of reminders from the DB

8. Check-off marks for the reminder list are persistent and must also be saved immediately.
	- isCheckedoff attirbute in Remainder class instantly saves the changes and carries the object to DB.

9. The application must present the reminders grouped by type.
	- ReminderTypeGroup class gathers same type of reminders in a list which sorts the lists.

10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.
	- New class multipleList has a collection of objects to create,(re)name, select, and delete reminder lists.

11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior.
	- Reminder class has an object to set time for the reminder which redirects it to Alert which has 
	  a date and time attribute to choose date and time.
	- Alert also has a boolean (reminderRepeat) for user to check if they want to repeat the reminder or not. 

12. Extra Credit: Option to set up reminder based on location.
	- setLocation on Reminder class obtain user location through google maps API.

13. The User Interface (UI) must be intuitive and responsive.
	- Not considered because it does not affect the design directly.