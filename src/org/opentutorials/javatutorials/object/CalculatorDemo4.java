package org.opentutorials.javatutorials.object;

class  Calculator{
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class CalculatorDemo4 {
    public static void main(String[] args) {
       Calculator c1 = new Calculator(); // Calculator 변수를 만들어, c1(Calculator 라는 객체를 담을수 있는 데이터 형식을 지닌)에 담는다.
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(); // 인스턴스
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
    }
}
