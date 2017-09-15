package Lesson5;

public class MicrosoftDatabaseService extends AbstractDatabaseService implements DatabaseService {
    @Override
    public void addRow() {
        System.out.println("Add row to Microsoft DB");
    }

    @Override
    public void deleteRow(int rowId) {
        System.out.println("Delete row from Microsoft DB");
    }
}
