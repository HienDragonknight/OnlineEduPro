package com.Server.order;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
public class OrderCourseDTO {
    private Long courseId;
    private Long userId;
    private Long categoryId;
    private String courseName;
    private String description;
    private String videoLink;
    private String imgLink;
    private Timestamp updateDate;
    private String status;
    private BigDecimal price;

    // Constructor
    public OrderCourseDTO(Long courseId, Long userId, Long categoryId, String courseName, String description,
                             String videoLink, String imgLink, Timestamp updateDate, String status, BigDecimal price) {
        this.courseId = courseId;
        this.userId = userId;
        this.categoryId = categoryId;
        this.courseName = courseName;
        this.description = description;
        this.videoLink = videoLink;
        this.imgLink = imgLink;
        this.updateDate = updateDate;
        this.status = status;
        this.price = price;
    }
}
