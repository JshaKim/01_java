package practice;

public class Member {
    private int memberNo;
    private String memberName;
    private String memberArea;
    private String memberPhone;

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberArea() {
        return memberArea;
    }

    public void setMemberArea(String memberArea) {
        this.memberArea = memberArea;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberArea='" + memberArea + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                '}';
    }
}
