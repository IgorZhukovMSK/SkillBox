public class Kitty {


    private Double kittyWeight;


    public  Kitty()

    {
        kittyWeight = 200.0 + 100.0 * Math.random();
        }

        public void feed(Double amount)
    {
        kittyWeight = kittyWeight + amount;
    }

    public Double getKittyWeight ()
    {
        return kittyWeight;}



    }




