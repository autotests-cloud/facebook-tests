package docs;

import org.junit.jupiter.api.Test;

import static utils.RandomUtils.*;


public class RandomExamples {

    @Test
    void randomExample() {
// getRandomString
        String randomString = getRandomString(22);
        //        $("#id").setValue(randomString); - использование полученной рандомной строки
        // System.out.println(text) - Это тупо вывести что-то в консоль.лог
        System.out.println(randomString);
//        System.out.println(getRandomString(22)); // тоже самое, что и в предыдущей строке

// getRandomMessage
        String randomMessage = getRandomMessage(22, 100);
        System.out.println(randomMessage);


// getRandomInt
        int randomInt = getRandomInt(223333, 100000000);
        System.out.println(randomInt + "");

// getRandomPhone
        String randomPhone = getRandomPhone();
        System.out.println(randomPhone);


        // getRandomPhone
        String randomEmail = getRandomEmail();
        System.out.println(randomEmail);

    }
}
