package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Bullet 
{
    float x, y;
    float speed;
    PVector forward;
    PApplet p;
    int c;

    public Bullet(float x, float y, float rot, int c PApplet p)
    {

    }

    void move()
    {
        forward.x = PApplet.sin(rot);
        forward.y = PApplet.cos(rot);

        pos.add(PVector.mult(forward, speed));
        
    }
}
