//package com.jbp.animal060707.repository;
//
//import com.jbp.animal060707.entities.AnimalEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import javax.sql.DataSource;
//import java.util.List;
//
//@Repository
//public class AnimalRepository {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public AnimalRepository(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//    public List<AnimalEntity> search(String keyword){
//        String query = "SELECT city,facility,category3,municipality,parking FROM animal_api.animal WHERE  facility  LIKE ? ORDER BY facility ASC";
//        String searchKeyword = "%" + keyword + "%";
//
//        return jdbcTemplate.query(query, mapAnimalEntity(), searchKeyword);
//    }
//
//    private RowMapper<AnimalEntity> mapAnimalEntity() {
//        return (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//
//            animal.setId(resultSet.getLong("id"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        };
//    }
//
//
//    public List<AnimalEntity> findAll() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//    }
//
//    public List<AnimalEntity> findCamp() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE category3 IN ('펜션','호텔') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//    }
//
//    public List<AnimalEntity> findTrip() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal  WHERE category3 IN ('여행지') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//    }
//
//    public List<AnimalEntity> findFood() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE category3 IN ('카페','식당') ORDER BY category3 ASC";
//
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//    }
//
//    public List<AnimalEntity> findBeauty() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE category3 IN ('미용','반려동물용품','위탁관리') ORDER BY category3 ASC";
//
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//    }
//
//    public List<AnimalEntity> findCulture() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE category3 IN ('문예회관','미술관','박물관') ORDER BY category3 ASC";
//
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//    }
//
//    public List<AnimalEntity> findMedical() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE category3 IN ('동물약국','동물병원') ORDER BY category3 ASC";
//
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//    }
//
//    public List<AnimalEntity> findSeoul() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('서울특별시') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//    }
//
//    public List<AnimalEntity> findIncheon() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('인천광역시') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//
//    public List<AnimalEntity> findGyeonggi() {
//        String query = "SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('경기도') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//    public List<AnimalEntity> findJeonla(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('전라남도','전라북도') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//
//
//    public List<AnimalEntity> findDaegu(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('대구광역시') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//
//
//    }
//    public List<AnimalEntity> findSejong(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('세종특별자치시') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//
//    public List<AnimalEntity> findGyeongsang(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('경상남도','경상북도') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//
//    public List<AnimalEntity> findGangwon(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('강원도') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//    public List<AnimalEntity> findBusan(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('부산광역시') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//    public List<AnimalEntity> findGwangju(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('광주광역시') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//    public List<AnimalEntity> findDaejeon(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('대전광역시') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//    public List<AnimalEntity> findChungchung(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('충청북도','충청남도') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//    public List<AnimalEntity> findJeju(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('제주특별자치도') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//
//    public List<AnimalEntity> findUlsan(){
//        String query="SELECT address, category3, id, facility,city,accompanying,operatingTime,parking,closedDays,municipality FROM animal_api.animal WHERE city IN ('울산광역시') ORDER BY category3 ASC";
//        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
//            AnimalEntity animal = new AnimalEntity();
//            animal.setId(resultSet.getLong("id"));
//            animal.setAccompanying(resultSet.getString("accompanying"));
//            animal.setMunicipality(resultSet.getString("municipality"));
//            animal.setOperatingTime(resultSet.getString("operatingTime"));
//            animal.setParking(resultSet.getString("parking"));
//            animal.setAddress(resultSet.getString("address"));
//            animal.setFacility(resultSet.getString("facility"));
//            animal.setClosedDays(resultSet.getString("closedDays"));
//            animal.setCity(resultSet.getString("city"));
//            animal.setCategory3(resultSet.getString("category3"));
//            return animal;
//        });
//
//
//    }
//
//}