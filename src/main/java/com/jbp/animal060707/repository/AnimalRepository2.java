package com.jbp.animal060707.repository;

import com.jbp.animal060707.entities.AnimalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class AnimalRepository2 {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AnimalRepository2(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public RowMapper<AnimalEntity> mapAnimalEntity() {
        return (resultSet, rowNum) -> {
            AnimalEntity animal = new AnimalEntity();
            animal.setCity(resultSet.getString("city"));
            animal.setMunicipality(resultSet.getString("municipality"));
            animal.setFacility(resultSet.getString("facility"));
            animal.setParking(resultSet.getString("parking"));
            animal.setCategory3(resultSet.getString("category3"));
            animal.setAccompanying(resultSet.getString("accompanying"));
            animal.setClosedDays(resultSet.getString("closedDays"));
            return animal;


        };
    }
    public List<AnimalEntity> getSearch(String keyword){
        String query= "SELECT city,municipality,facility,parking,category3,accompanying,closedDays FROM animal_api.animal WHERE facility LIKE ? ORDER BY facility ASC";
        String searchKeyword = "%"+keyword+"%";
        return jdbcTemplate.query(query,mapAnimalEntity(),searchKeyword);
    }

    public List<AnimalEntity> getFindsCategory(String...categories) {
        StringBuilder query = new StringBuilder("SELECT city,municipality,facility,parking,category3,accompanying,closedDays FROM animal_api.animal WHERE category3 IN (");
        for (int i = 0; i < categories.length; i++) {
            query.append("?");
            if(i < categories.length-1){
                query.append(",");

        }


        }
        query.append(") ORDER BY category3 ASC;");
        return jdbcTemplate.query(query.toString(),mapAnimalEntity(),categories);
    }

    public List<AnimalEntity> getFindsCity(String...cities){
        StringBuilder query= new StringBuilder("SELECT city,municipality,facility,parking,accompanying,category3,closedDays FROM animal_api.animal WHERE city IN (");

        for (int i = 0; i < cities.length; i++) {
            query.append("?");
            if(i< cities.length-1){
                query.append(",");

            }


        }
        query.append(") ORDER BY city ASC;");
        return jdbcTemplate.query(query.toString(),mapAnimalEntity(),cities);
    }
}
