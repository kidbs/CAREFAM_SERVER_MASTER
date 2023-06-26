package com.jbp.animal060707.services;

import com.jbp.animal060707.entities.AnimalEntity;
import com.jbp.animal060707.repository.AnimalRepository2;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnimalService2 {

   private final AnimalRepository2 animalRepository2;

    public AnimalService2(AnimalRepository2 animalRepository2) {
        this.animalRepository2 = animalRepository2;
    }

    public List<AnimalEntity> findCamp(){
        return animalRepository2.getFindsCategory("펜션","호텔");
    }

    public List<AnimalEntity> findTrip(){
        return animalRepository2.getFindsCategory("여행지");
    }

    public List<AnimalEntity> findFood(){
        return animalRepository2.getFindsCategory("식당","카페");
    }

    public List<AnimalEntity> findBeauty(){
        return animalRepository2.getFindsCategory("미용","반려동물용품","위탁관리");
    }

    public List<AnimalEntity> findCulture(){
        return animalRepository2.getFindsCategory("문예회관","미술관","박물관");
    }

    public List<AnimalEntity> findMedical(){
        return animalRepository2.getFindsCategory("동물병원","동물약국");
    }

    public List<AnimalEntity> findGyeonggi(){
        return animalRepository2.getFindsCity("경기도");
    }

    public List<AnimalEntity> findSeoul(){
        return animalRepository2.getFindsCity("서울특별시");
    }

    public List<AnimalEntity> findJeonla(){
        return animalRepository2.getFindsCity("전라남도","전라북도");
    }

    public List<AnimalEntity> findIncheon(){
        return animalRepository2.getFindsCity("인천광역시");
    }

    public List<AnimalEntity> findGyeongsang(){
        return animalRepository2.getFindsCity("경상북도","경상남도");
    }

    public List<AnimalEntity> findDaegu(){
        return animalRepository2.getFindsCity("대구광역시");
    }

    public List<AnimalEntity> findSejong(){
        return animalRepository2.getFindsCity("세종특별자치시");
    }

    public List<AnimalEntity> findGangwon(){
        return animalRepository2.getFindsCity("강원도");
    }

    public List<AnimalEntity> findBusan(){
        return animalRepository2.getFindsCity("부산광역시");
    }

    public List<AnimalEntity> findGwangju(){
        return animalRepository2.getFindsCity("광주광역시");
    }

    public List<AnimalEntity> findChungchung(){
        return animalRepository2.getFindsCity("충청북도","충청남도");
    }

    public List<AnimalEntity> findDaejeon(){
        return animalRepository2.getFindsCity("대전광역시");
    }

    public List<AnimalEntity> findJeju(){
        return animalRepository2.getFindsCity("제주특별자치도");
    }

    public List<AnimalEntity> findUlsan(){
        return animalRepository2.getFindsCity("울산광역시");
    }

    public List<AnimalEntity> searchbar(String keyword){
        return animalRepository2.getSearch(keyword);
    }




}
