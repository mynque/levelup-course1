package ru.levelup.lesson5;

public interface DatabaseService {

    void addRow();

    void deleteRow(int rowId);

    void connect(String path);
}
