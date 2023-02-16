package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.CelebrityDTO;
import com.wit.unifesta.data.dto.FestivalCalendarDTO;
import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.entity.Celebrity;
import com.wit.unifesta.data.entity.FestivalCalendar;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.entity.SchoolCelebrity;
import com.wit.unifesta.data.repository.SchoolCelebrityRepository;
import com.wit.unifesta.data.repository.SchoolRepository;
import com.wit.unifesta.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private final SchoolCelebrityRepository schoolCelebrityRepository;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schoolRepository, SchoolCelebrityRepository schoolCelebrityRepository) {
        this.schoolRepository = schoolRepository;
        this.schoolCelebrityRepository = schoolCelebrityRepository;
    }

    @Override
    public List<SchoolDTO> getAllSchool() {
        List<School> schools = schoolRepository.findAll();
        List<SchoolDTO> schoolDTOS = new ArrayList<>();
        for (int i = 0; i < schools.size(); i++) {
            SchoolDTO schoolDTO = new SchoolDTO(schools.get(i).getId(), schools.get(i).getSchoolName(), schools.get(i).getFestivalDescription());
            schoolDTOS.add(schoolDTO);
        }
        return schoolDTOS;
    }

    @Override
    public SchoolDTO getSchool(Long id) {
        School school = schoolRepository.getReferenceById(id);

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(school.getId());
        schoolDTO.setSchoolName(school.getSchoolName());
        schoolDTO.setFestivalPoster(school.getFestivalPoster());
        schoolDTO.setFestivalDescription(school.getFestivalDescription());
        return schoolDTO;
    }

    @Override
    public SchoolDTO getSchoolBySchoolName(String schoolName) {
        School school = schoolRepository.findBySchoolName(schoolName).orElseThrow();

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(school.getId());
        schoolDTO.setSchoolName(school.getSchoolName());
        schoolDTO.setFestivalPoster(school.getFestivalPoster());
        schoolDTO.setFestivalDescription(school.getFestivalDescription());
        return schoolDTO;
    }

    @Override
    public FestivalCalendarDTO getSchoolFestivalCalendar(String schoolName) {
        School school = schoolRepository.findBySchoolName(schoolName).orElseThrow();
        FestivalCalendar festivalCalendar = school.getFestivalCalendar();
        FestivalCalendarDTO festivalCalendarDTO = new FestivalCalendarDTO();
        festivalCalendarDTO.setMorningTime(festivalCalendar.getMorningTime());
        festivalCalendarDTO.setEveningTime(festivalCalendar.getEveningTime());
        festivalCalendarDTO.setAddress(festivalCalendar.getAddressName());
        festivalCalendarDTO.setSubway(festivalCalendar.getSubway());
        festivalCalendarDTO.setTotalDate(festivalCalendar.getTotalDate());
        festivalCalendarDTO.setPerformanceTime(festivalCalendar.getPerformanceTime());
        return festivalCalendarDTO;
    }

    @Override
    @Transactional
    public SchoolDTO saveSchool(SchoolDTO schoolDTO) {
        School school = new School();
        school.setSchoolName(schoolDTO.getSchoolName());
        school.setFestivalDescription(schoolDTO.getFestivalDescription());

        School savedSchool = schoolRepository.save(school);
        SchoolDTO schoolDTO1 = new SchoolDTO();
        schoolDTO1.setId(savedSchool.getId());
        schoolDTO1.setSchoolName(savedSchool.getSchoolName());
        schoolDTO1.setFestivalPoster(savedSchool.getFestivalPoster());
        schoolDTO1.setFestivalDescription(savedSchool.getFestivalDescription());

        return schoolDTO1;
    }

    @Override
    @Transactional
    public SchoolDTO changeSchoolName(Long id, String schoolName) throws Exception {
        School school = schoolRepository.getReferenceById(id);

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(school.getId());
        schoolDTO.setSchoolName(school.getSchoolName());

        return schoolDTO;
    }

    @Override
    @Transactional
    public SchoolDTO changeFestivalDescription(Long id, String festivalDescription) throws Exception {
        School school = schoolRepository.getReferenceById(id);

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(schoolDTO.getId());
        schoolDTO.setSchoolName(schoolDTO.getSchoolName());

        return schoolDTO;
    }

    @Override
    @Transactional
    public List<CelebrityDTO> getAllSchoolCelebrities(String schoolName) {
        Long findId = schoolRepository.findBySchoolName(schoolName).get().getId();
        List<SchoolCelebrity> celebrities = schoolCelebrityRepository.findBySchool_Id(findId);
        List<CelebrityDTO> celebrityDTOS = new ArrayList<>();
        for (int i = 0; i < celebrities.size(); i++) {
            Celebrity celebrity = celebrities.get(i).getCelebrity();
            CelebrityDTO celebrityDTO = new CelebrityDTO(celebrity.getId(), celebrity.getSingerName(), celebrity.getTotalLiked(), celebrity.getSingerImage());
            celebrityDTOS.add(celebrityDTO);
        }
        return celebrityDTOS;
    }

    @Override
    @Transactional
    public void deleteSchool(Long id) throws Exception {
        School school = schoolRepository.getReferenceById(id);
        schoolRepository.delete(school);

    }
}
