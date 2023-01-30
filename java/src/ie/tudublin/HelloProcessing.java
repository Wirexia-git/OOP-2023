package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
	
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		stroke(255);
		line(10, 10, 100, 100); //x1, y1, x2, y2
		circle(300, 250, 70); //cx, cy (center x and center y), d (diameter)
		fill(0, 255, 0);
		rect(10, 300, 20, 100); //tlx, tly (tope left x and y), w (width), h (height)
		stroke(127);
		fill(0, 0, 255);
		noStroke();
		noFill();
		strokeWeight(1);
		triangle(40, 90, 300, 20, 80, 70); 
		fill(0, 0, 255);
	}
}
