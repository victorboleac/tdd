package org.example;

public class Kata6 {
    public String willCheese(String race, int catSpeed, int mouseSpeed){
        if (!race.isEmpty()) {
            if (catSpeed ==0 && mouseSpeed!=0) {
                return "Cheese";
            }
            else if (catSpeed !=0 && mouseSpeed==0) {
                return "No cheese";
            }
            else if (catSpeed !=0){

                int catPosition = race.indexOf("K");
                int mousePosition = race.indexOf("M");
                int cheesePosition = race.indexOf("C");

                int catCheeseDistance = cheesePosition-catPosition;
                int mouseCheeseDistance = cheesePosition - mousePosition;

                int catTime = catCheeseDistance/catSpeed;
                int mouseTime = mouseCheeseDistance/mouseSpeed;

                if (catTime<mouseTime) return "No cheese";
                if (catTime>mouseTime) return "Cheese";
                return "Cheese party!";

            }
        }


        return "";
    };


}
