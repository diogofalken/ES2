package com.es2.whiteboxconditions;

public class Rating {

    public Rating() {
    }

    public String evaluateScoreTemperature(int score, int temperature) {
        String output = "I'm balanced";

        if(score >= 10 && temperature >= 35) {
            output = "It's hot out, and so am I";
        }
        else if(score < 5 || temperature <= 20) {
            output = "I'm in a bad mood";
        }

        return output;
    }

    public String evaluateIfCouldBeAcceptedAtDisco(int dressStyle, int talkSkill) {
        String output = "Not Accepted";

        if(dressStyle >= 8 && talkSkill >= 5) {
            output = "Accepted";
        }

        return output;
    }
}
