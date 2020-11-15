package model;

public class Subject {
    private String subId;
    private String subName;
    private String subAuthor;

    public Subject(String subId, String subName, String subAuthor) {
        this.subId = subId;
        this.subName = subName;
        this.subAuthor = subAuthor;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubAuthor() {
        return subAuthor;
    }

    public void setSubAuthor(String subAuthor) {
        this.subAuthor = subAuthor;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId='" + subId + '\'' +
                ", subName='" + subName + '\'' +
                ", subAuthor='" + subAuthor + '\'' +
                '}';
    }
}