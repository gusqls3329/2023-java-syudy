package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        Connection con = MyConn.getConn();
        String sql = "INSERT INTO country( country) VALUES('동하나라')";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result: "+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConnTest2{
    public static void main(String[] args) {
        /*
        title: 처음작성
        ctnts: 처음작성하는 내용입니다.
        writer: 홍길동
         */
        BoardEntity entity  = new BoardEntity();
        entity.setTitle("나는");
        entity.setCtnts("지금");
        entity.setWriter("배고프다");
        BoardDao.insBoard(entity);

    }
}

class MyConnTest3{
    public static void main(String[] args) {
        BoardEntity entity  = new BoardEntity();
        entity.setIboard(1);

        int row = BoardDao.delBoard(entity);
        System.out.println("row:" +row);
    }
}

class MyConnTest4{
    public static void main(String[] args) {
        BoardEntity entity  = new BoardEntity();
        entity.setIboard(3);

        entity.setTitle("수정제목");
        entity.setCtnts("수정 내용");
        entity.setWriter("수정자");
        int row = BoardDao.upBoard(entity);
        System.out.println("row:" +row);
    }
}