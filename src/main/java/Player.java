public class Player {
    private String name;
    private boolean isWinner;

    public String getName(){
        return name;
    }

    public boolean getWinner(){
        return isWinner;
    }

    public boolean setWinner(){
        return isWinner = true;
    }

    public Player(String name, boolean isWinner){
        this.name = name;
        this.isWinner = isWinner;
    }

    public void guessNumber(int guessedNumber, int secretNumber){
        if(guessedNumber == secretNumber){
            System.out.println(this.name + " guessed the secret number!");
            this.setWinner();
        } else {
            System.out.println("Sorry, " + this.name + " try again.");
        }
    }

}
