package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
 	Scanner scanner = new Scanner(System.in());
	System.out.println("Enter 1st number");
	int a = scanner.nextInt();
	System.out.println("Enter 2st number");
	int b = scanner.nextInt();
	System.out.println("Sum is " + a+b);
    }

    private final String getMessage() {
        return message;
    }

}
