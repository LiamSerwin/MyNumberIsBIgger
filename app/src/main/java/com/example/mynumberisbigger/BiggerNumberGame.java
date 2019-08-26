package com.example.mynumberisbigger;

public class BiggerNumberGame {
    private int number1;
    private int number2;
    private int score;
    private int lowerlimit;
    private int upperlimit;
    private int  bigNum;

    public BiggerNumberGame(int lowerlimit, int upperlimit) {
        this.lowerlimit = lowerlimit;
        this.upperlimit = upperlimit;
        generateRandomNumbers();
    }

    public void generateRandomNumbers() {
        number1 = (int)(Math.random() * (upperlimit - lowerlimit + 1) + lowerlimit);
        number2 = (int)(Math.random() * (upperlimit - lowerlimit + 1) +lowerlimit);
        while(number1 == number2) {
            number2 = (int)(Math.random() * (upperlimit - lowerlimit + 1) + lowerlimit);
        }
        if(number1 > number2) {
            bigNum = number1;

        }
        else{
            bigNum = number2;
        }
     // generate a number between the upper & lower limits inclusive
     //store that in number1
     //generate another number and make sure that it's different
     //store that in number2
    }

    public String checkAnswer(int answer){
       //determine if the answer is right
       //update the score accordingly
       ///return a relevant message
        if(answer == bigNum)
        {
            score += 50;
            return "nice.";
        }
        else {
            score -= 50;
            return "not nice.";
        }
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLowerlimit() {
        return lowerlimit;
    }

    public void setLowerlimit(int lowerlimit) {
        this.lowerlimit = lowerlimit;
    }

    public int getUpperlimit() {
        return upperlimit;
    }

    public void setUpperlimit(int upperlimit) {
        this.upperlimit = upperlimit;
    }
}
