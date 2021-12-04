//Реализовать иерархию классов "Геометрические фигуры". Код программы должен содержать следующее
interface Moveable{
public void move(float dx,float dy);
public void resize(float koeff);
}
abstract class Figure{
float x,y;
Figure(float x,float y) {
this.x = x;
this.y = y;
}
abstract public float getArea();
abstract public float getPerimeter();
}

class Rectangle extends Figure implements Moveable{
float height,width,centerx,centery;
Rectangle(float x,float y, float height, float width) {
super(x,y);
this.height = height;
this.width = width;
}
public float getPerimeter() {
return 2*(height+width);
}
public float getArea(){
return height*width;
}
public void move(float dx, float dy) {
x += dx;
y += dy;
}
public void resize(float koeff) {
height *= koeff;
width *= koeff;
}
public String toString(){
centerx = x+width/2;
centery = y+height/2;
return ("Rectangle\n"+"Center: (" + centerx + ", " + centery + ")\nHeight: " + height + "\nWidth: " + width);
}
}

class Circle extends Figure implements Moveable {
float radius;
Circle(float x,float y, float radius) {
super(x,y);
this.radius = radius;
}
public float getPerimeter() {
return 2*radius*(float)Math.PI;
}
public float getArea(){
return (float)Math.PI*radius*radius;
}
public void move(float dx, float dy) {
x += dx;
y += dy;
}
public void resize(float koeff) {
radius *= koeff;
}
    public String toString(){
    return ("Circle\n"+"Center: (" + x + ", " + y + ")\nRadius: " + radius);
}
}
