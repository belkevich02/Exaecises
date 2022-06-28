public class MovieTestDrive extends Movie  {
    public static void main(String[] args){

        Movie one = new Movie();
        one.title = "Как прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в Офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();


        three.title = "Байт-клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
        System.out.println(one.title );
        System.out.println(one.genre);
        System.out.println(one.rating);
        System.out.println(three.title);

    }
}
