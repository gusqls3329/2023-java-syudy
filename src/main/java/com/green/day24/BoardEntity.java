package com.green.day24;

public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String created_at;
    private String updated_at;

    public int getIboard() {
        return iboard;
    }

    public void setIboard(int iboard) {
        this.iboard = iboard;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCtnts() {
        return ctnts;
    }

    public void setCtnts(String ctnts) {
        this.ctnts = ctnts;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    @Override
    public String toString(){
        return String.format("iboard : %d, title : %s, ctnts : %s, writer : %s, createdAt : %s"
                , iboard, title, ctnts, writer, created_at);

    }
}
