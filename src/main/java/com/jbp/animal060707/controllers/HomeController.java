//package com.jbp.animal060707.controllers;
//
//import com.jbp.animal060707.dtos.AnimalDto;
//import com.jbp.animal060707.entities.AnimalEntity;
//import com.jbp.animal060707.services.AnimalService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class HomeController {
//
//    private final AnimalService animalService;
//
//    @Autowired
//    public HomeController(AnimalService animalService) {
//        this.animalService = animalService;
//    }
//
//
//    @GetMapping("/animals")
//    public List<AnimalDto> getAllAnimals() throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findAll();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos;
//
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    // 검색 기능
//    @PostMapping("/search")
//    public AnimalDto searchAnimals(@RequestParam("keyword") String keyword,int apiIndex) {
//        List<AnimalEntity> animalEntities = animalService.searchbar(keyword);
//        if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//            AnimalEntity animalEntity = animalEntities.get(apiIndex);
//            AnimalDto animalDto = new AnimalDto(
//                    animalEntity.getCity(),
//                    animalEntity.getMunicipality(),
//                    animalEntity.getFacility(),
//                    animalEntity.getParking(),
//                    animalEntity.getCategory3()
//
//            );
//            return animalDto;
//        } else {
//            // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//            return null;
//        }
//    }
//
//    @GetMapping("/searchIndexLength")
//    public int searchCount(@RequestParam String keyword) {
//        List<AnimalEntity> animalEntities = animalService.searchbar(keyword);
//        List<AnimalDto> animalDtos = new ArrayList<>();
//        for (AnimalEntity animalEntity : animalEntities) {
//            AnimalDto animalDto = new AnimalDto(
//                    animalEntity.getCity(),
//                    animalEntity.getMunicipality(),
//                    animalEntity.getFacility(),
//                    animalEntity.getParking(),
//                    animalEntity.getCategory3()
//            );
//            animalDtos.add(animalDto);
//
//        }
//        return animalDtos.size();
//
//    }
//
//    @PostMapping("/camp")
//    public AnimalDto getFindCamp(@RequestParam int apiIndex) throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findCamp();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/campIndexLength")
//    public int getCampCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findCamp();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @PostMapping("/trip")
//    public AnimalDto getFindTrip(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findTrip();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/tripIndexLength")
//    public int getTripCount() throws SQLException {
//        try {
//
//
//            List<AnimalEntity> animalEntities = animalService.findTrip();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @PostMapping("/food")
//    public AnimalDto getFindFood(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findFood();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/foodIndexLength")
//    public int getFoodCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findFood();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getFacility(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @PostMapping("/beauty")
//    public AnimalDto getFindBeauty(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findBeauty();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/beautyIndexLength")
//    public int getBeautyCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findBeauty();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/culture")
//    public AnimalDto getFindCulture(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findBeauty();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/cultureIndexLength")
//    public int getCultureCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findCulture();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/medical")
//    public AnimalDto getFindMedical(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findMedical();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/medicalIndexLength")
//    public int getMedicalCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findMedical();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/seoul")
//    public AnimalDto getFindSeoul(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findSeoul();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/seoulIndexLength")
//    public int getSeoulCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findMedical();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/gyeongi")
//    public AnimalDto getFindGyeongi(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findGyeongi();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getFacility(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/gyeongiIndexLength")
//    public int getGyeongiCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findGyeongi();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getFacility(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @PostMapping("/jeonla")
//    public AnimalDto getFindJeonla(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findJeonla();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/jeonlaIndexLength")
//    public int getJeonlaCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findJeonla();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/incheon")
//    public AnimalDto getFindIncheon(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findIncheon();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/incheonIndexLength")
//    public int getIncheonCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findIncheon();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getFacility(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/gyeongsang")
//    public AnimalDto getFindGyeongsang(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findGyeongsang();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/gyeongsangIndexLength")
//    public int getGyeonsangCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findGyeongsang();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/daegu")
//    public AnimalDto getFindDaegu(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findDaegu();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/daeguIndexLength")
//    public int getDaeguCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findDaegu();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/sejong")
//    public AnimalDto getFindSejong(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findSejong();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/sejongIndexLength")
//    public int getSejongCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findSejong();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/gangwon")
//    public AnimalDto getFindGangwon(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findGangwon();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/gangwonIndexLength")
//    public int getGangwonCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findGangwon();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getFacility(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @PostMapping("/busan")
//    public AnimalDto getFindBusan(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findBusan();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/busanIndexLength")
//    public int getBusanCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findBusan();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/gwangju")
//    public AnimalDto getFindGwangju(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findGwangju();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/gwangjuIndexLength")
//    public int getGwangjuCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findGwangju();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @PostMapping("/daejeon")
//    public AnimalDto getFindDaejeon(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findDaejeon();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/daejeonIndexLength")
//    public int getDaejeonCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findDaejeon();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @PostMapping("/chungchung")
//    public AnimalDto getFindChungchung(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findChungchung();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/chungchungIndexLength")
//    public int getChungchungCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findChungchung();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @PostMapping("/jeju")
//    public AnimalDto getFindJeju(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findJeju();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/jejuIndexLength")
//    public int getJejuCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findJeju();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @PostMapping("/ulsan")
//    public AnimalDto getFindUlsan(@RequestParam int apiIndex) throws SQLException {
//
//
//        try {
//            List<AnimalEntity> animalEntities = animalService.findUlsan();
//            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
//                AnimalEntity animalEntity = animalEntities.get(apiIndex);
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                return animalDto;
//            } else {
//                // 요청한 인덱스가 범위를 벗어날 경우, null을 반환하거나 예외 처리를 수행할 수 있습니다.
//                return null;
//            }
//        } catch (SQLException e) {
//            // 에러 처리 로직 추가
//            return null;
//        }
//    }
//
//    @GetMapping("/ulsanIndexLength")
//    public int getUlsanCount() throws SQLException {
//        try {
//            List<AnimalEntity> animalEntities = animalService.findUlsan();
//            List<AnimalDto> animalDtos = new ArrayList<>();
//            for (AnimalEntity animalEntity : animalEntities) {
//                AnimalDto animalDto = new AnimalDto(
//                        animalEntity.getCity(),
//                        animalEntity.getMunicipality(),
//                        animalEntity.getFacility(),
//                        animalEntity.getParking(),
//                        animalEntity.getCategory3()
//                );
//                animalDtos.add(animalDto);
//
//            }
//            return animalDtos.size();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//}
