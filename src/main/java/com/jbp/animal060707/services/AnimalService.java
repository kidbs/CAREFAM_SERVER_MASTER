//package com.jbp.animal060707.services;
//
//import com.jbp.animal060707.entities.AnimalEntity;
//import com.jbp.animal060707.repository.AnimalRepository;
//import org.springframework.stereotype.Service;
//
//import java.sql.SQLException;
//import java.util.List;
//
//@Service
//public class AnimalService {
//    private final AnimalRepository animalRepository;
//
//    public AnimalService(AnimalRepository animalRepository) {
//        this.animalRepository = animalRepository;
//    }
//
//
//    public List<AnimalEntity> findAll() throws SQLException {
//        return animalRepository.findAll();
//    }
//    public List<AnimalEntity> findCamp() throws SQLException{
//        return animalRepository.findCamp();
//    }
//    public List<AnimalEntity> findTrip() throws SQLException{
//        return animalRepository.findTrip();
//    }
//    public List<AnimalEntity> findFood() throws SQLException{
//        return animalRepository.findFood();
//    }
//    public List<AnimalEntity> findBeauty() throws SQLException{
//        return animalRepository.findBeauty();
//    }
//
//    public List<AnimalEntity> findCulture() throws SQLException{
//        return animalRepository.findCulture();
//    }
//
//    public List<AnimalEntity> findMedical() throws SQLException{
//        return animalRepository.findMedical();
//    }
//
//    public List<AnimalEntity> findSeoul() throws SQLException{
//        return animalRepository.findSeoul();
//    }
//
//    public List<AnimalEntity> findGyeonggi() throws SQLException{
//        return animalRepository.findGyeonggi();
//    }
//
//
//    public List<AnimalEntity> findIncheon() throws SQLException{
//        return animalRepository.findIncheon();
//    }
//
//
//
//    public List<AnimalEntity> findDaegu() throws SQLException{
//        return animalRepository.findDaegu();
//    }
//    public List<AnimalEntity> findSejong() throws SQLException{
//        return animalRepository.findSejong();
//    }
//
//    public List<AnimalEntity> findJeonla() throws SQLException{
//        return animalRepository.findJeonla();
//    }
//
//    public List<AnimalEntity> findGyeongsang() throws SQLException{
//        return animalRepository.findGyeongsang();
//    }
//
//    public List<AnimalEntity> findGangwon() throws SQLException{
//        return animalRepository.findGangwon();
//    }
//
//    public List<AnimalEntity> findBusan() throws SQLException{
//        return animalRepository.findBusan();
//    }
//
//    public List<AnimalEntity> findGwangju() throws SQLException{
//        return animalRepository.findGwangju();
//    }
//
//    public List<AnimalEntity> findDaejeon() throws SQLException{
//        return animalRepository.findDaejeon();
//    }
//
//    public List<AnimalEntity> findChungchung() throws SQLException{
//        return animalRepository.findChungchung();
//    }
//
//    public List<AnimalEntity> findJeju() throws SQLException{
//        return animalRepository.findJeju();
//    }
//
//
//
//    public List<AnimalEntity> findUlsan() throws SQLException{
//        return animalRepository.findUlsan();
//    }
//
//
//    public List<AnimalEntity> searchbar(String keyword) {
//        return animalRepository.search(keyword);
//    }
//}