package com.digicoachindezorg.digicoachindezorg_backend.repositories;

import com.digicoachindezorg.digicoachindezorg_backend.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByDate(LocalDate date);
    List<Message> findBySender_Id(Long senderId);
    List<Message> findByStudyGroup_GroupId(Long studyGroupId);
}
