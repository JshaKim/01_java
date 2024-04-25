package practice;

public class BorrowDTO {
    private int memberNo;
    private int bookNo;


    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    @Override
    public String toString() {
        return "LibraryDTO{" +
                "memberNo=" + memberNo +
                ", bookNo=" + bookNo +
                '}';
    }
}
