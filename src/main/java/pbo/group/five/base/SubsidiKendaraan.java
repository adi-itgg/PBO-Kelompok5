package pbo.group.five.base;

import java.util.Random;

public class SubsidiKendaraan implements Kendaraan {

    @Override
    public String nama() {
        return "Subsidi Kendaraan";
    }

    public String randomAlphabetic(int limit) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(limit)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public String randomNumeric(int limit) {
        int leftLimit = 48; // letter '0'
        int rightLimit = 57; // letter '9'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(limit)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


    @Override
    public String nomorPolisi() {
        return randomAlphabetic(1) + " " + randomNumeric(4) + " " + randomAlphabetic(3);
    }

    @Override
    public String kodeModel() {
        return randomAlphabetic(3) + randomNumeric(10);
    }

}
