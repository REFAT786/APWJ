package com.repository;

import com.domain.Grosscalculate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GrosscalculateRepository {

    private static DataSource dataSource;

    private static final String ALL="select id,gross,salary,rent,medical,conveyance,other from grosscalculates";

    private static final String CREATE= "insert into grosscalculates (gross,salary,rent,medical,conveyance,other) values (?, ?, ?, ?, ?, ?)";


    public GrosscalculateRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public List<Grosscalculate>grossList() throws SQLException {
        Connection connection=dataSource.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(ALL);
        return mapper(resultSet);

    }


    public  boolean grosscreate(@Valid Grosscalculate grosscalculate) throws SQLException {

        Connection connection=dataSource.getConnection();

        PreparedStatement preparedStatement=connection.prepareStatement(CREATE);

        preparedStatement.setLong(1,grosscalculate.getGross());

        preparedStatement.setLong(2, (long) grosscalculate.getSalary());
        preparedStatement.setLong(3, (long) grosscalculate.getRent());
        preparedStatement.setLong(4, (long) grosscalculate.getMedical());
        preparedStatement.setLong(5, (long) grosscalculate.getConveyance());
        preparedStatement.setLong(6, (long) grosscalculate.getOther());

        return preparedStatement.execute();


    }
    private List<Grosscalculate> mapper(ResultSet resultSet) throws SQLException {

        List<Grosscalculate>grosscalculates=new ArrayList<>();
        while (resultSet.next()){
            Grosscalculate grosscalculate=new Grosscalculate();
            grosscalculate.setId(resultSet.getLong(1));
            grosscalculate.setGross(resultSet.getLong(2));
            grosscalculate.setSalary(resultSet.getLong(3));
            grosscalculate.setRent(resultSet.getLong(4));
            grosscalculate.setMedical(resultSet.getLong(5));
            grosscalculate.setConveyance(resultSet.getLong(6));
            grosscalculate.setOther(resultSet.getLong(7));

            grosscalculates.add(grosscalculate);

        }
        return grosscalculates;

    }
}
