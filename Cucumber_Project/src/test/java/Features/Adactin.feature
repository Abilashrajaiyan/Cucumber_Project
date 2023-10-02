Feature: Hotel Booking Application
Scenario: User Login
Given User Enter The Valid URL
When User enter the Username in the "R Abilash" field
And User Enter the Password in the "Abilash 04" field
And user click the login button
Then login should be sucess and navigate to next page

And user enter the location in the "Sydney" field
And user enter the Hotel in the "Hotel Creek" field
And user enter the Room Type in the "Deluxe" field
And user enter the room nos in the "2 - Two" field
And user enter the room adult_room in the "2 - Two" field 
