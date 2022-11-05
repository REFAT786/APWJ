package com.repository;

import com.domain.Taxcalculator;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaxcalculatorRepository {

    private DataSource dataSource;
    private static final String ALL = "select id,catagory,zone, salary, rent,medical,conveyance,bonus,total,salarytaxable,renttaxable,medicaltaxable,conveyancetaxable,bonustaxable,totaltaxable from taxcalculatordb";
    private static final String CREATE = "insert into taxcalculatordb (catagory,zone,salary, rent,medical,conveyance,bonus,total, salarytaxable,renttaxable,medicaltaxable,conveyancetaxable,bonustaxable,totaltaxable) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public TaxcalculatorRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Taxcalculator> list() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(ALL);
        return mapper(resultSet);
    }

    public boolean create(@Valid Taxcalculator taxcalculator) throws SQLException {
        Connection connection = dataSource.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(CREATE);
        preparedStatement.setString(1, taxcalculator.getCatagory());
        preparedStatement.setString(2, taxcalculator.getZone());
        preparedStatement.setLong(3, taxcalculator.getSalary());
        preparedStatement.setLong(4, taxcalculator.getRent());
        preparedStatement.setLong(5, taxcalculator.getMedical());
        preparedStatement.setLong(6, taxcalculator.getConveyance());
        preparedStatement.setLong(7, taxcalculator.getBonus());
        preparedStatement.setLong(8, taxcalculator.getTotal());
        preparedStatement.setLong(9, taxcalculator.getSalarytaxable());
        preparedStatement.setLong(10, taxcalculator.getRenttaxable());
        preparedStatement.setLong(11, taxcalculator.getMedicaltaxable());
        preparedStatement.setLong(12, taxcalculator.getConveyancetaxable());
        preparedStatement.setLong(13, taxcalculator.getBonustaxable());
        preparedStatement.setLong(14, taxcalculator.getTotaltaxable());

        return preparedStatement.execute();
    }
    private List<Taxcalculator> mapper(ResultSet resultSet) throws SQLException {
        List<Taxcalculator> taxcalculators = new ArrayList<>();
        while(resultSet.next()) {
            Taxcalculator taxcalculator = new Taxcalculator();
            taxcalculator.setId(resultSet.getLong(1));
            taxcalculator.setCatagory(resultSet.getString(2));
            taxcalculator.setZone(resultSet.getString(3));
            taxcalculator.setSalary(resultSet.getLong(4));
            taxcalculator.setRent(resultSet.getLong(5));
            taxcalculator.setMedical(resultSet.getLong(6));
            taxcalculator.setConveyance(resultSet.getLong(7));
            taxcalculator.setBonus(resultSet.getLong(8));
            taxcalculator.setTotal(resultSet.getLong(9));
            taxcalculator.setSalarytaxable(resultSet.getLong(10));
            taxcalculator.setRenttaxable(resultSet.getLong(11));
            taxcalculator.setMedicaltaxable(resultSet.getLong(12));
            taxcalculator.setConveyancetaxable(resultSet.getLong(13));
            taxcalculator.setBonustaxable(resultSet.getLong(14));
            taxcalculator.setTotaltaxable(resultSet.getLong(15));

            taxcalculators.add(taxcalculator);

        }
        return taxcalculators;
    }


}