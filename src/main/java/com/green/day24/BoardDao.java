package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {//Dao : 데이터 엑세스 오브젝트

    public static int insBoard(BoardEntity entity) { //static or singleton둘중 하나를 사용해서 만들어야함.
        int result = 0;
        String sql = "INSERT INTO board (title,ctnts,writer) " +
                "VALUES" +
                "(?,?,?)";

        System.out.println(sql);
        try {
            Connection conn = MyConn.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());

            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }

    public static void close(Connection conn, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
