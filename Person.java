import java.util.Arrays;
import java.util.Random;

class Person{
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    // Constr.
    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    // Copy Constr.
    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
        this.seatNumber = source.seatNumber;
    }

    // Get
    public String getName(){
        return this.name;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public String[] getPassporrt(){
        return Arrays.copyOf(this.passport, this.passport.length);
    }
    public int getSeatNumber(){
        return this.seatNumber;
    }

    // Set
    public void setName(String name){
        this.name = name;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setPassport(){
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }
    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }

    // tostring method
    public String toString(){
        return  "\nName: " + this.name +
                "\nNationality: " + this.nationality +
                "\nDate of Birth: " + this.dateOfBirth +
                "\nPassport: " + Arrays.toString(this.passport) +
                "\nSeat Number: " + this.seatNumber;
    }

    // Actions
    public boolean applyForPassport(){
        boolean application = false;
        Random rand = new Random();
        int randomIndex = rand.nextInt((1 - 0) + 1) + 0;

        if (randomIndex == 0){
            application = false;
            return application;
        }
        else{
            application = true;
            return application;
        }
    }

    public void chooseSeat(){
        int randomNum = (int)(Math.random() * (12 - 1) + 1);
        this.seatNumber = randomNum;
    }

}