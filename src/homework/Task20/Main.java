
package homework.Task20;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            StringProcessor stringGenerator = new StringProcessor(i + 1);
            executorService.submit(stringGenerator);
        }

        executorService.shutdown();

    }
}
