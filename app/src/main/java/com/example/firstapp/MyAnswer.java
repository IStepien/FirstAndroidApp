package com.example.firstapp;

import java.util.Random;

public class MyAnswer {

    public String [] myAnswers = { "red", "black","pink","blue","yellow"};

    public String getMyAnswer() {
        String answer = " ";
        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(myAnswers.length);

        answer = myAnswers[randomNumber];

        return answer;
    }

}
