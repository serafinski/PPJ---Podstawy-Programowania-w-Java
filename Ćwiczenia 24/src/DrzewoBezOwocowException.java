public
    class DrzewoBezOwocowException
    extends Exception {

    public DrzewoBezOwocowException() {
        // w przypadku wyjątku — zwróć, że drzewo jest bez owoców
        super("Drzewo bez owoców!");
    }
}
