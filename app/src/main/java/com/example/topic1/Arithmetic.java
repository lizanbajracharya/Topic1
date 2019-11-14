package com.example.topic1;

public class Arithmetic {
    private String action;

    public Arithmetic(String action) {
        this.action = action;
    }


    public boolean Check() {
        if (action == "Plus") {
            return true;
        } else if (action == "Sub") {
            return true;
        } else if (action == "Multiply") {
            return true;
        } else if (action == "Divide") {
            return true;
        } else {
            return false;
        }
    }

    public Float Calculate(Float number,Float number2)
    {
        if (action == "Plus")
        {
            return number + number2;
        }
        else if (action == "Sub")
        {
                return number - number2;
            }
        else if (action == "Multiply")
        {
                return number * number2;
            }
        else if (action == "Divide")
        {
                return number / number2;
        }
        else
        {
            return number2;
        }
    }

}
