package homework.Task20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;

public class StringProcessor implements Callable<String> {
    private int fileId;
    private Random random = new Random();

    public StringProcessor(int fileId) {

        this.fileId = fileId;
    }

    @Override
    public String call() throws Exception {
        String fileName = "Файл" + fileId + ".txt";
        System.out.println(Thread.currentThread().getName() + " начал создание " + fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                String randomString = generateRandomString();
                writer.write(randomString);
                writer.newLine();
            }

            int sleepTime = random.nextInt(3) + 1;
            Thread.sleep(sleepTime * 1000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " закончил создание " + fileName);
        return fileName;
    }

    private String generateRandomString() {
        int length = random.nextInt(10) + 5;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) (random.nextInt(26) + 'a'));
        }
        return sb.toString();
    }
}
