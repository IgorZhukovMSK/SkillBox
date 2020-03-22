public class Loader {
    public static void main(String[] args) {

        Integer DimaAge = 85;
        Integer MishaAge = 55;
        Integer VasyaAge = 18;


        Integer young = (DimaAge < MishaAge && DimaAge < VasyaAge) ? DimaAge : ((MishaAge < DimaAge && MishaAge < VasyaAge) ? MishaAge : VasyaAge);{
            System.out.println("Most young: " + young);}

        Integer middle = (DimaAge < MishaAge && DimaAge > VasyaAge) ? DimaAge : ((MishaAge < DimaAge && MishaAge > VasyaAge) ? MishaAge : VasyaAge);{
            System.out.println("Most middle: " + middle);}

        Integer old = (DimaAge > MishaAge && DimaAge > VasyaAge) ? DimaAge : ((MishaAge > DimaAge && MishaAge > VasyaAge) ? MishaAge : VasyaAge);{
            System.out.println("Most old: " + old);}
    }
}














