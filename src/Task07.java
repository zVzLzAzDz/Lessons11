// happy - :)
// bad - :(
// neutral - :|
// shouted - :()
// nervous - :\


import java.util.Random;

public class Task07 {
    public static final int MOOD_NUMBERS = 5;

    public static final String HAPPY_MOOD = ":)";
    public static final String BAD_MOOD = ":(";
    public static final String SHOTED_MOOD = ":()";
    public static final String NEUTRAL_MOOD = ":|";
    public static final String NERVOUS_MOOD = ":/";

    public static void main(String[] args) {
        Random random = new Random();

//        int mood = random.nextInt(5);
//        String msg = " ";
//
//        switch (mood){
//            case 0: msg = ":)";break;
//            case 1: msg = ":(";break;
//            case 2: msg = ":()";break;
//            case 3: msg = ":|";break;
//            case 4: msg = ":/";break;
//        }
//        System.out.println(msg);




        int mood = random.nextInt(MOOD_NUMBERS);
        String msg = " ";

        switch (mood){
            case 0: msg = HAPPY_MOOD;break;
            case 1: msg = BAD_MOOD;break;
            case 2: msg = SHOTED_MOOD;break;
            case 3: msg = NERVOUS_MOOD;break;
            case 4: msg = NEUTRAL_MOOD;break;
        }
        System.out.println(msg);
    }
}
