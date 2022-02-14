import java.util.Scanner;

public class Calculator {
    //Fields
    private int firstNumber;
    private int secondNumber;
    private char operation;

    //Constructor
    public Calculator(){}


    //Methods
    public void working()
    {
        Scanner in = new Scanner(System.in);


        System.out.println("\033[H\033[2J");


        System.out.print("\nEnter first number: ");
        setFirstNumber(in.nextInt());

        System.out.print("\n\nEnter operation : ");
        while(true)
        {
            this.operation = in.next().charAt(0);
            
            if(setOperation(operation))
            {
                break;
            }
            else
            {
                System.out.print("\n\nPlease enter correctly: ");
            }
        }

        System.out.print("\n\nEnter second number: ");
        while(true)
        {
            this.secondNumber = in.nextInt();

            if(setSecondNumber(this.secondNumber))
            {
                break;
            }
            else
            {
                System.out.print("\n\nPlease enter correctly: ");
            }
        }



        calculate();
    }

    //Methods
    private void calculate()
    {
        switch(this.operation)
        {
            case '+':
                System.out.println("\n\nResult: " + (this.firstNumber + this.secondNumber));
                break;
            case '-':
                System.out.println("\n\nResult: " + (this.firstNumber - this.secondNumber));
                break;
            case '*':
                System.out.println("\n\nResult: " + (this.firstNumber * this.secondNumber));
                break;
            case '/':
                System.out.println("\n\nResult: " + (this.firstNumber / this.secondNumber));
                break;
            default:
                System.out.println("\n\nResult: " + (this.firstNumber + this.secondNumber));
                break;
        }
    }


    //Getters and Setters
    private boolean setOperation(char operation){
        if(operation == '+' || operation == '-' || operation == '*' || operation == '/'){
            this.operation = operation;
            return true;
        }
        return false;
    }

    private char getOperation(){
        return this.operation;
    }

    private void setFirstNumber(int firstNumber){
        this.firstNumber = firstNumber;
    }

    private boolean setSecondNumber(int secondNumber){
        if(getOperation() == '/' && secondNumber == 0)
            return false;
        return true;
    }


}
