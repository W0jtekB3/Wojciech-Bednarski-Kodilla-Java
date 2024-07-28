package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlResetBestsellers = "UPDATE BOOKS SET BESTSELLER=false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlResetBestsellers);

        // Add test data if necessary
        // e.g., ensure the BOOKS and RENTS tables have data that can be used to test the procedure

        // When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        // Verify if the BESTSELLER column is updated correctly
        String sqlCheckBestsellers = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=true";
        ResultSet rs = statement.executeQuery(sqlCheckBestsellers);

        // Then
        int bestsellerCount = 0;
        if (rs.next()) {
            bestsellerCount = rs.getInt("HOW_MANY");
        }
        // Replace 3 with the expected number of bestsellers based on your test data
        assertEquals(0, bestsellerCount);

        rs.close();
        statement.close();
    }
}