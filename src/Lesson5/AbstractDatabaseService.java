package Lesson5;

public abstract class AbstractDatabaseService implements DatabaseService {
    @Override
    public void connect(String path) {
        System.out.println("Connect to database by path = " + path);
    }
}
