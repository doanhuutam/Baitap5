package down;

import model.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Crud {
    static Connection connection = Connect.getConnection();

    public static ArrayList<NhanVien> show() throws Exception {
        String sqlSelect = "select*from nhanvien";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlSelect);
        ArrayList<NhanVien> list = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("idnhanvien");
            String name = resultSet.getString("name");
            String date = resultSet.getString("date");
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");
            int idphongBan = resultSet.getInt("idphongBan");
            list.add(new NhanVien(id, name, date, address, phone, email, idphongBan));

        }
        return list;
    }
    public static void save(NhanVien nhanVien) throws Exception{
        String sqlsave="insert into nhanvien value(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sqlsave);
        preparedStatement.setInt(1,nhanVien.getId());
        preparedStatement.setString(2,nhanVien.getName());
        preparedStatement.setString(3,nhanVien.getDate());
        preparedStatement.setString(4,nhanVien.getAddress());
        preparedStatement.setString(5,nhanVien.getPhone());
        preparedStatement.setString(6,nhanVien.getEmail());
        preparedStatement.setInt(7,nhanVien.getIdphongBan());
        preparedStatement.execute();

    }
    public static void edit(NhanVien nhanVien) throws Exception{
        String sqledit="update nhanvien set name =?,date =?,address=?,phone=?,email=?,idphongban=? where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sqledit);
        preparedStatement.setInt(7,nhanVien.getId());
        preparedStatement.setString(1,nhanVien.getName());
        preparedStatement.setString(2,nhanVien.getDate());
        preparedStatement.setString(3,nhanVien.getAddress());
        preparedStatement.setString(4,nhanVien.getPhone());
        preparedStatement.setString(5,nhanVien.getEmail());
        preparedStatement.setInt(6,nhanVien.getIdphongBan());
        preparedStatement.execute();

    }
    public static void delete(int id) throws Exception{
        String sqldelete="delete table nhanvien where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sqldelete);
        preparedStatement.setInt(1,id);
        preparedStatement.execute();

    }
}
