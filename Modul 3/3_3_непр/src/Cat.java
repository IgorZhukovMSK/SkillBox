
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight =   weight - originWeight;

        System.out.println ("massfood " + weight );
        return;

    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public void gotray (Double amount)
    {
        weight = weight - amount;
        System.out.println ("mass after go tray " + weight );
    }

    public Double getWeight()
    {
        return weight;
    }

       public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}