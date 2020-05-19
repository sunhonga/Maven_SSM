package com.sun.utils;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName MyTypeHandler
 * @Description TODO
 * Author sunhong
 * Date 2020-4-1 20:41
 **/
public class MyTypeHandler extends BaseTypeHandler<String> {
    /**
     * 从Java类型到JDBC类型
     * @param ps
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        System.out.println("setNonNullParameter1:"+parameter);
        ps.setString(i,  parameter);
    }

    /**
     * 从JDBC类型到Java类型
     * @param rs
     * @param columnName
     * @return
     * @throws SQLException
     */
    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println("-----getNullableResult:"+columnName);
        return rs.getString(columnName);
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
