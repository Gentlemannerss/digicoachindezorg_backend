package com.digicoachindezorg.digicoachindezorg_backend.dtos.output;

import com.digicoachindezorg.digicoachindezorg_backend.models.StudyGroup;
import com.digicoachindezorg.digicoachindezorg_backend.models.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MessageOutputDto {
    private Long messageId;
    private String messageContent;
    private Boolean isConcept;
    /*private Message parentMessage;*/
    private User user;
    private StudyGroup studyGroup;
    private String receiverEmail;
}
