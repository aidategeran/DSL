package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line;

        while (!"quit".equalsIgnoreCase(line = scanner.nextLine())) {
            String [] expr = line.split(" ");
            if (expr.length != 3) {
                System.out.println("Invalid expression received: " + line);
                continue;
            }
            try{
                String operator = expr[0];
                int operand1 = Integer.parseInt(expr[1]);
                int operand2 = Integer.parseInt(expr[2]);

                int result = evaluate(operator, operand1, operand2);
                System.out.println(result);

            } catch (NumberFormatException e) {
                System.out.println("Invalid number received: " + line);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int evaluate(String operator, int operand1, int operand2)  {
        switch (operator) {
            case "ADD":
                return operand1 + operand2;
            case "SUB":
                return operand1 - operand2;
            case "MUL":
                return operand1 * operand2;
            case "DIV":
                if (operand2 == 0) {
                        throw new IllegalArgumentException("Can't divide by zero");
                    }
                return operand1 / operand2;
            case "MOD":
                return operand1 % operand2;






            case "POW":
                return (int) Math.pow(operand1, operand2);
            default:
                throw new UnsupportedOperationException("Operation not supported");

        }







    }

}