package com.example.SpringJdbc;
import com.example.SpringJdbc.Masina;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MasinaMapper implements RowMapper<Masina>{
    @Override
    public Masina mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Masina(rs.getString("Nr_inmatriculare"),
                rs.getString("Marca"),
                rs.getInt("An_fabricatie"),
                rs.getString("Culoare"),
                rs.getInt("Nr_kilometri"));
    }
}
