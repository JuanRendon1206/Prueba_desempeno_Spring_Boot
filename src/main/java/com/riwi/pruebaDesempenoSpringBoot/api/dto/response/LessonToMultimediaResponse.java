package com.riwi.pruebaDesempenoSpringBoot.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class LessonToMultimediaResponse extends LessonBasicResponse{

    private ClassToLessonResponse class_id;
}
