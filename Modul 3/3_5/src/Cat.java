
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;
    private static Integer count = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }
    public Cat (Double weight) {
        this.weight = weight;
        this.originWeight = weight;
        this.minWeight = 1000.0;
        this.maxWeight = 9000.0;
        this.count++;
    }

    public void meow(Double amount) {weight = weight + amount;}
//    {
//        weight = weight - 1;
//        System.out.println("Meow");
//    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }



    public static Integer getCount()
    {
        return count;
    }
    public String getStatus()
    {
        if(weight < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
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