public class Task {
    private int number; // private - инкапсулируем данные внутри класса (защищаем)
    private String title;
    private String description;

    public Task(int number, String title, String description) {
        this.number = number;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%02d. %s [%s]", number, title, description);
    }

    public int getNumber() {
        return number;
    }
}
