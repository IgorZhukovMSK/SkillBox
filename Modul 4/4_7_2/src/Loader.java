public class Loader {
    public static void main(String[] args) {
        String text = "There are different kinds of animals on our planet, and all of them are very important for it. For example, everybody knows that the sharks are dangerous for people, but they are useful for cleaning seawater. There are two types of animals: domestic (or pets) and wild. People keep pets in their homes. And some wild animals are very dangerous. Domestic animals live next to people, whereas wild animals’ “homes” are forests, jungles, oceans and so on.\n" +
                "Giraffes are very beautiful and unusual animals. They are the tallest land animals in the world. Giraffes can reach a height of 5,5 m and a weight of 900 kg. They are famous for their long necks. But does anybody know, that giraffes have a very long tongue? They even can clean the ears with it! Giraffes are usually yellow or light brown with dark stains. Giraffes live in African savannas. They can live from 20 to 30 years. It is interesting to know, that giraffes sleep only for a few minutes at a time. They sit down on the ground and bend their long neck down.\n" +
                "Giraffes do not hunt. They eat leaves, grass, and fruit. Due to their long neck, they can reach the highest leaves on the trees that other animals cannot eat.\n" +
                "You can often meet giraffes in city Zoos. They are very friendly and all the children like them very much.";


        String fragments [] = text.split("\\s* \\s*");

        int fragmentsCount = fragments.length;

                    for (int i = 0; i < fragmentsCount; i++) {
                    fragments[i] = fragments[i].replaceAll("[^a-zA-Z \\w \\d]", ""); // почему не удаляются цифры я ведь указал\\d (похоже понял, потому что текст указан а не цифры)?
                }


        System.out.println("Всего слов: ");
        System.out.println(fragmentsCount);
        System.out.println();


        for( int i = 0; i < fragmentsCount; i++)
        {

            System.out.println (fragments[i]);
        }
    }
}
