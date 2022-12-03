package Util;

import java.util.concurrent.ThreadLocalRandom;

public class IntUtils {
    public static int getRandomInt(){
        return ThreadLocalRandom.current().nextInt(1,10);
    }
}
