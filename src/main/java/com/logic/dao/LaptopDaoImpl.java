package com.logic.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("LaptopDaoImpl")
@Scope("singleton")
public class LaptopDaoImpl implements   LaptopDao{
	
	@Autowired
	@Qualifier("mysqldataSource")
	 private DataSource datasource;
   
	 @Override
	public String addLaptop(LaptopEntity entity) {
		 String sql="insert into laptops_tbl(name,ram,color,screen,doe) values(?,?,?,?,?)";
		 Object[] args=new Object[]{entity.getName(),entity.getRam(),entity.getColor(),entity.getScreen(),new Timestamp(new Date().getTime())};
		 JdbcTemplate jdbcTemplate=new JdbcTemplate(datasource);
		 int row=jdbcTemplate.update(sql,args);
		 return row==1?"success":"fail";
	}
	 
	  
		 @Override
		public List<LaptopEntity> getLaptops() {
			 String sql="select lid,name,ram,color,screen,doe from laptops_tbl";
			 JdbcTemplate jdbcTemplate=new JdbcTemplate(datasource);
			 List<LaptopEntity> laptopEntityList=jdbcTemplate.query(sql, new BeanPropertyRowMapper(LaptopEntity.class));
			 return laptopEntityList;
		}
		 
		 @Override
			public int countLaptop() {
				 String sql="select count(*) from laptops_tbl";
				 JdbcTemplate jdbcTemplate=new JdbcTemplate(datasource);
				int rows=jdbcTemplate.queryForObject(sql,Integer.class);
				 return rows;
			}
}
