package org.example;

public class Kata4 {

    public enum Outcomes {
        LIKE,
        DISLIKE,
        NEUTRAL
    }

    public Outcomes findOutcome(String[] inputLikeDislike) {
        if (inputLikeDislike.length < 1) return Outcomes.NEUTRAL;
        int numLikes = 0;
        int numDislikes = 0;
        for (String button : inputLikeDislike) {
            if (button.equals("LIKE")) numLikes += 1;
            else if (button.equals("DISLIKE")) numDislikes += 1;
        }

        if (numLikes % 2 == 0 && numDislikes % 2 == 0) return Outcomes.NEUTRAL;
        else if (numLikes % 2 == 1 && numDislikes % 2 == 1) return Outcomes.NEUTRAL;
        else if (numLikes % 2 == 1 && numDislikes % 2 == 0) return Outcomes.LIKE;
        return Outcomes.DISLIKE;

    }
}
