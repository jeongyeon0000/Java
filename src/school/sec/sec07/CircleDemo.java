package school.sec.sec07;

import java.awt.image.CropImageFilter;

class Circle{
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public Circle(double radius){
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10.0);
        Circle yourCircle = new Circle(5.0);

        System.out.println("원의 개수 : " + Circle.numOfCircles); // 정적 변수의 사용
        System.out.println("원의 개수 : " + yourCircle.numCircles);
    }
}
