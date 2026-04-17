class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int availableBooks = 3;

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Books not available");
        }
    }

    public static void main(String[] args) {
        Library l = new Library();

        try {
            l.issueBook(2);
            l.issueBook(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
