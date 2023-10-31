package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country( country) VALUES('동하나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
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
        entity.setTitle("오늘 Insert배움");
        entity.setCtnts("java를 통해 board테이블에 값 넣어봄");
        entity.setWriter("신난다");
        BoardDao.insBoard(entity);

    }
}