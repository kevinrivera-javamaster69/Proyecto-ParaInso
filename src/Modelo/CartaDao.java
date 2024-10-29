package Modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartaDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean Registrar(Carta car) {
        String sql = "INSERT INTO carta (nombre, precio, fecha, stock, tipo, presentacion) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, car.getNombre());
            ps.setDouble(2, car.getPrecio());
            ps.setString(3, car.getFecha());
            ps.setInt(4, car.getStock());
            ps.setString(5, car.getTipo());
            ps.setString(6, car.getPresentacion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

public List<Carta> Listar(String valor, String fechaFormato) {
    List<Carta> Lista = new ArrayList<>();
    String sql = "SELECT * FROM carta WHERE nombre LIKE '%" + valor + "%'";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Carta car = new Carta();
            car.setId(rs.getInt("id"));
            car.setNombre(rs.getString("nombre"));
            car.setPrecio(rs.getDouble("precio"));
            car.setStock(rs.getInt("stock"));
            car.setTipo(rs.getString("tipo"));
            car.setPresentacion(rs.getString("presentacion"));
            Lista.add(car);
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    }
    return Lista;
}

    public boolean Eliminar(int id) {
        String sql = "DELETE FROM carta WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public boolean Modificar(Carta car) {
        String sql = "UPDATE carta SET nombre=?, precio=?, stock=? WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, car.getNombre());
            ps.setDouble(2, car.getPrecio());
            ps.setInt(4, car.getStock());
            ps.setInt(3, car.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

}
