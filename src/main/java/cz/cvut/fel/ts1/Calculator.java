package cz.cvut.fel.ts1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
// TODO: implementujte tuto metodu
        return a - b;
    }
    public int multiply(int a, int b) {
// TODO: implementujte tuto metodu
        return a * b;
    }
    public int divide(int a, int b) {
// TODO: implementujte tuto metodu
        if(b == 0){
            return 0;
        }else {
            return a / b;
        }
    }
}
