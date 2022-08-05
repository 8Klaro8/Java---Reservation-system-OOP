public class Airline {
    private Person[] seats;


    // Constr.
    public Airline(){
        this.seats = new Person[11];
    }

    // Get
    public Person getPerson(int index){
        for (int i = 0; i < seats.length; i++) {
            if (i == index) {
                return new Person(seats[i]);
            }
        }
        // Default return value
        return new Person(seats[1]);
    }

    public int getPersonNum(){
        int perons = this.seats.length;
        return perons;
    }

    public void getSeatsRange(){
        for (int i = 0; i < seats.length; i++) {
            System.out.println(i);
        }
    }

    // Set
    public void setPerson(Person person){
        int personsSeatNum = person.getSeatNumber();
        this.seats[personsSeatNum - 1] = new Person(person);
    }

    public void createReservation(Person person) {

        if (checkIfNull(person.getSeatNumber() - 1)){
            // Getting the seat number of the person, passed in as parameter
            int currSeatNum = person.getSeatNumber() - 1;
            // Setting the passed in person to the rleevant seat
            this.seats[currSeatNum] = new Person(person);
        
            // Person currentPerson = new Person(this.seats[person.getSeatNumber() - 1]);
            System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".");
        }
        else{
            // Run a while loop, while the chosen seat by the person is reserved
            while(!(checkIfNull(person.getSeatNumber() - 1))){
                System.out.println(person.getName() + ", this seat is reserved: " + (person.getSeatNumber()) + ". Please choose an other seat");
                person.chooseSeat();
            }
            System.out.println("This seat is free! You reserved: " + person.getSeatNumber());
            // Putting the person in to the choosen seat
            this.seats[person.getSeatNumber() - 1] = person;
        }
    }

    public boolean checkIfNull(int index){
        if (seats[index] == null){
            return true;
        }
        return false;
    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < seats.length ; i++) {
            try {
                temp += this.seats[i].toString() + "\n\n";
                
            } catch (Exception e) {
                temp += "Seat " + (i + 1) + " is Empty\n\n";
            }
            
        }
        return temp;
    }

}
