package com.wit.unifesta.data.dto;

import com.wit.unifesta.data.entity.School;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CelebrityDTO implements Serializable {
    private Long id;
    private String singerName; // 가수 이름
    private Long totalLiked; // 좋아요 수
    private String singerImage;
//    private LocalDateTime createdAt;
//    private String createdBy;
//    private LocalDateTime modifiedAt;
//    private String modifiedBy;
}
