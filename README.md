
303.8 Practice SBA

Points:100
Assignment Type: Non-graded (This assignment does not count toward the final grade.),  Complete/Incomplete
Submission Type: 
GitHub Link 
Instructions: Include the following deliverables in your submission:
Submit your GitHub Link using the Start Assignment button in the top-right corner of the assignment page in Canvas.






Parking System





Rates


Time
Price
5am -5pm
 morning rate 
5pm -12am 
 nightly rate 
12am -5am 
 twentyFour rate 





Times are integer values using the 24-hour clock format . 0-24


Create an interface called ParkingSystem with three fields of type double  NIGHTLY = 30; MORNING = 20; TWENTY_FOUR = 45;
Create a method called processTicket() that returns a double.


Create a class called HospitalParking that implements ParkingSystem with two fields , one of type int named time and one of type double named surcharge with a value of 20%. Create a constructor with the time field.  Calculate the value of the int named time. Add the surcharge percentage to the ticket. 


Create a class called MallParking that implements ParkingSystem with two fields , one of type int named time and one of type double named surcharge with a value of 10%.  Create a constructor with the time field. Calculate the values of the int named time. Add the surcharge percentage to the ticket.


Example: If the ticket is from hospital parking and the time is between 5am - 5pm. The price would 20% * 20 + 20 = $24.00


Example: If the ticket is from mall parking and the time is between 5am - 5pm. The price would 10% * 20 + 20 = $22.00
 
	Override the toString method to show the price for the ticket below using both the mall and hospital parking objects . 


	Example: Price for mall parking is $xx.xx
      Price for hospital  parking is $xx.xx


