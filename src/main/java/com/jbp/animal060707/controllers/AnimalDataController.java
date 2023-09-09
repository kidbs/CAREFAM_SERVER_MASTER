package com.jbp.animal060707.controllers;

import com.jbp.animal060707.dtos.AnimalDto;
import com.jbp.animal060707.entities.AnimalEntity;
import com.jbp.animal060707.services.AnimalService2;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AnimalDataController {

    private final AnimalService2 animalService2;

    public AnimalDataController(AnimalService2 animalService2) {
        this.animalService2 = animalService2;
    }

    @PostMapping("/search")
    public AnimalDto getSearch(@RequestParam("keyword") String keyword, int apiIndex) {

            List<AnimalEntity> animalEntities = animalService2.searchbar(keyword);
            if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
                AnimalEntity animalEntity = animalEntities.get(apiIndex);
                AnimalDto animalDto = new AnimalDto(
                        animalEntity.getCity(),
                        animalEntity.getMunicipality(),
                        animalEntity.getFacility(),
                        animalEntity.getParking(),
                        animalEntity.getCategory3(),
                        animalEntity.getAddress(), animalEntity.getHomePage(), animalEntity.getOperatingTime(), animalEntity.getClosedDays(), animalEntity.getPhoneNumber());
                return animalDto;

            } else {
                return null;
            }

    }
    @GetMapping("/searchIndexLength")
    public int searchCount(@RequestParam("keyword") String keyword){
        List<AnimalEntity> animalEntities= animalService2.searchbar(keyword);
        List<AnimalDto>animalDtos=new ArrayList<>();
        for (AnimalEntity animalEntity : animalEntities) {
           AnimalDto animalDto=new AnimalDto(
                   animalEntity.getCity(),
                   animalEntity.getMunicipality(),
                   animalEntity.getFacility(),
                   animalEntity.getParking(),
                   animalEntity.getCategory3(),
                   animalEntity.getAddress(),
                   animalEntity.getHomePage(),
                   animalEntity.getOperatingTime(),
                   animalEntity.getClosedDays(),
                   animalEntity.getPhoneNumber()
           );
           animalDtos.add(animalDto);
        }
        return animalDtos.size();
    }

    @PostMapping("/{category}")
    public AnimalDto getFindAnimal(@PathVariable String category, @RequestParam int apiIndex) throws SQLException {
        List<AnimalEntity> animalEntities = null;

        switch (category) {
            case "camp":
                animalEntities = animalService2.findCamp();
                break;
            case "beauty":
                animalEntities = animalService2.findBeauty();
                break;
            case "culture":
                animalEntities = animalService2.findCulture();
                break;
            case "food":
                animalEntities = animalService2.findFood();
                break;
            case "trip":
                animalEntities = animalService2.findTrip();
                break;
            case "medical":
                animalEntities = animalService2.findMedical();
                break;
            case "gyeonggi":
                animalEntities = animalService2.findGyeonggi();
                break;
            case "seoul":
                animalEntities = animalService2.findSeoul();
                break;
            case "jeonla":
                animalEntities = animalService2.findJeonla();
                break;
            case "incheon":
                animalEntities = animalService2.findIncheon();
                break;
            case "gyeongsang":
                animalEntities = animalService2.findGyeongsang();
                break;
            case "daegu":
                animalEntities = animalService2.findDaegu();
                break;
            case "sejong":
                animalEntities = animalService2.findSejong();
                break;
            case "gangwon":
                animalEntities = animalService2.findGangwon();
                break;
            case "busan":
                animalEntities = animalService2.findBusan();
                break;
            case "gwangju":
                animalEntities = animalService2.findGwangju();
                break;
            case "daejeon":
                animalEntities = animalService2.findDaejeon();
                break;
            case "chungchung":
                animalEntities = animalService2.findChungchung();
                break;
            case "jeju":
                animalEntities = animalService2.findJeju();
                break;
            case "ulsan":
                animalEntities = animalService2.findUlsan();
                break;
            default:
                return null;
        }


        if (apiIndex >= 0 && apiIndex < animalEntities.size()) {
            AnimalEntity animalEntity = animalEntities.get(apiIndex);
            AnimalDto animalDto = new AnimalDto(
                    animalEntity.getCity(),
                    animalEntity.getMunicipality(),
                    animalEntity.getFacility(),
                    animalEntity.getParking(),
                    animalEntity.getCategory3(),
                    animalEntity.getAddress(), animalEntity.getHomePage(), animalEntity.getOperatingTime(), animalEntity.getClosedDays(), animalEntity.getPhoneNumber());
            return animalDto;
        } else {
            //요청한 인덱스가 범위를 벗어날 경우
            return null;

        }


    }

    @GetMapping("/{category}IndexLength")
    public int getAnimalCount(@PathVariable String category) throws SQLException {
        List<AnimalEntity> animalEntities = null;

        switch (category) {
            case "camp":
                animalEntities = animalService2.findCamp();
                break;
            case "beauty":
                animalEntities = animalService2.findBeauty();
                break;
            case "culture":
                animalEntities = animalService2.findCulture();
                break;
            case "food":
                animalEntities = animalService2.findFood();
                break;
            case "trip":
                animalEntities = animalService2.findTrip();
                break;
            case "medical":
                animalEntities = animalService2.findMedical();
                break;
            case "gyeonggi":
                animalEntities = animalService2.findGyeonggi();
                break;
            case "seoul":
                animalEntities = animalService2.findSeoul();
                break;
            case "jeonla":
                animalEntities = animalService2.findJeonla();
                break;
            case "incheon":
                animalEntities = animalService2.findIncheon();
                break;
            case "gyeongsang":
                animalEntities = animalService2.findGyeongsang();
                break;
            case "daegu":
                animalEntities = animalService2.findDaegu();
                break;
            case "sejong":
                animalEntities = animalService2.findSejong();
                break;
            case "gangwon":
                animalEntities = animalService2.findGangwon();
                break;
            case "busan":
                animalEntities = animalService2.findBusan();
                break;
            case "gwangju":
                animalEntities = animalService2.findGwangju();
                break;
            case "daejeon":
                animalEntities = animalService2.findDaejeon();
                break;
            case "chungchung":
                animalEntities = animalService2.findChungchung();
                break;
            case "jeju":
                animalEntities = animalService2.findJeju();
                break;
            case "ulsan":
                animalEntities = animalService2.findUlsan();
                break;
            default:
                // 유효하지 않은 카테고리일 경우, 예외를 던지거나 기본값을 반환할 수 있습니다.
                throw new IllegalArgumentException("Invalid category");


        }
        List<AnimalDto> animalDtos = new ArrayList<>();
        for (AnimalEntity animalEntity : animalEntities) {
            AnimalDto animalDto = new AnimalDto(
                    animalEntity.getCity(),
                    animalEntity.getMunicipality(),
                    animalEntity.getFacility(),
                    animalEntity.getParking(),
                    animalEntity.getCategory3(),
                    animalEntity.getAddress(), animalEntity.getHomePage(), animalEntity.getOperatingTime(), animalEntity.getClosedDays(), animalEntity.getPhoneNumber());
            animalDtos.add(animalDto);

        }
        return animalDtos.size();

    }
}


