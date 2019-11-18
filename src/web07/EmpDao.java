package web07;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import util.MyDBUtil;

public class EmpDao {
	public Emp findEmpByName(String name) {
		String sql="select*from emp wher name=?";
		Connection connection=MyDBUtil.getConnection();
		QueryRunner runner=new QueryRunner();
		try {
			return runner.query(connection, sql,new BeanHandler<Emp>(Emp.class),name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
