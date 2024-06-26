package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator{
    int left, right;
    public Calculator(){}
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println(this.left+this.right);
    }
}
class SubstractionableCalculator extends Calculator{

    public SubstractionableCalculator(int left, int right){
        super(left,right); // 하위 클래스의 초키화는 상위 클래스의 호출 다음에 한다.
    }
    public void substract(){
        System.out.println(this.left-this.right);
    }
}
public class CalculatorConstructorDemo5{
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}