public class DogTeam {

    public static void main(String[] args) {
        // add some dogs
        RaceDog max = new RaceDog("Max", "Samoyed", 2014, "male", 35);
        RaceDog sofi = new RaceDog("Sofi", "Alaskan Malamute", 2021, "female", 41);
        RaceDog jewel = new RaceDog("Jewel", "Siberian Husdy", 2011, "female", 38);
        RaceDog olson = new RaceDog("Olson", "Chinook", 2009, "male", 40);

        RaceDog[] team = {max, sofi, jewel, olson};

        RaceDog fastestDog = team[0];
        for (int i = 1; i < team.length; i++) {
            if (team[i].getSpeed() > fastestDog.getSpeed()) {
                fastestDog = team[i];
            }
        }

        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i]);
        }


        // TODO: add code that makes use of the static method and constant you added to RaceDog
        System.out.println("Race dog longevity is "+RaceDog.LONGEVITY);

        System.out.println("Average speed with a top speed of 50 is: "+RaceDog.getRaceDogAvgSpeed(50));
        for(int i = 0; i<team.length; i++){
            System.out.printf("Average speed of "+team[i].getName()+" is %.2f\n",RaceDog.getRaceDogAvgSpeed(team[i].getSpeed()));
        }
    }
}