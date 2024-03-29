package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {//Dao : 데이터 엑세스 오브젝트

    public static int insBoard(BoardEntity entity) { //static or singleton둘중 하나를 사용해서 만들어야함.
        int result = 0;
       /* String sql = "INSERT INTO board (title,ctnts,writer) " + "VALUES" + "(?,?,?)";*/
        String sql = "INSERT INTO board " +
                     "SET title = ?"+
                     ", ctnts = ?"+
                     ", writer = ?";

        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());

            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM board WHERE iboard = ? ";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static int upBoard(BoardEntity entity) {
        int result = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE board " +
                "Set title = ?, ctnts = ?, writer = ?" +
                ",updated_at = now()" +
                "WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps);
        }
        return result;
    }

    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_at FROM board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String Created_at = rs.getString("created_at");

                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreated_at(Created_at);

                list.add(entity);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }
    public static BoardEntity selBoardById(int k){

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        BoardEntity entity =  new BoardEntity();
        String sql = " SELECT iboard, title, writer, ctnts, created_at, updated_at FROM board WHERE iboard = ?";
        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, k);
            rs = ps.executeQuery();

            if (rs.next()){ //레코드가 있는 수만큼 반복됨

                entity.setIboard(k);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreated_at(rs.getString("created_at"));
                entity.setUpdated_at(rs.getString("updated_at"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyConn.close(conn, ps,rs);
        }
        return entity;
    }

}
