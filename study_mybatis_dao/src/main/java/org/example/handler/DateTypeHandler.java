package org.example.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DateTypeHandler extends BaseTypeHandler<Date> {

    // 将java类型转出数据库中需要的类型
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        long time = date.getTime();
        preparedStatement.setLong(i, time);
    }

    // 数据库中类型->java类型
    // String参数  要转换的字段名称
    // ResultSet 查询出的结果集
    @Override
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
        long time = resultSet.getLong(s);
        return new Date(time);
    }

    // 数据库中类型->java类型
    @Override
    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        long time = resultSet.getLong(i);
        return new Date(time);
    }

    // 数据库中类型->java类型
    @Override
    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        long time = callableStatement.getLong(i);
        return new Date(time);
    }
}
