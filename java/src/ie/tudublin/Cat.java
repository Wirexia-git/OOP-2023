package ie.tudublin;

public class Cat
{
	String name;
    private int numLives;
	
	public void setLives(int numLives)
	{
		this.numLives = numLives;
	}

    public int getLives()
	{
        return numLives;
	}
	
	public Cat()
	{
        numLives = 9;
	}
	
	
	public void kill()
	{
		if(numLives > 0)
        {
            numLives--;
            System.out.println("Ouch!");
        }

        else if(numLives == 0)
        {
            System.out.println("Dead");
        }
	}
}