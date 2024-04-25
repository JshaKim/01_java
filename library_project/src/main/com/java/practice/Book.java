package practice;

public class Book {
        private String bookTitle;
        private String bookAuthor;
        private String bookGenre;
        private String bookSearch;

    public String getBookSearch() {
        return bookSearch;
    }

    public void setBookSearch(String bookSearch) {
        this.bookSearch = bookSearch;

    }

    public String getBookTitle() {
            return bookTitle;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public String getBookAuthor() {
            return bookAuthor;
        }

        public void setBookAuthor(String bookAuthor) {
            this.bookAuthor = bookAuthor;
        }

        public String getBookGenre() {
            return bookGenre;
        }

        public void setBookGenre(String bookGenre) {
            this.bookGenre = bookGenre;
        }

    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                ", bookSearch='" + bookSearch + '\'' +
                '}';
    }
}


