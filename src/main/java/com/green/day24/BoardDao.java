package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BoardDao {
    public static int insBoard(BoardEntity entity){
        int result = 0;
        String sql = "INSERT INTO board (title,ctnts,writer) " +
                        "VALUES" +
                        "(?,?,?)";

        System.out.println(sql);
        try {
            Connection con = MyConn.getConn();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());

            result = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
        return result;
    }
}
