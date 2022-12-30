package org.example.Models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.annotation.processing.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @LastModifiedDate
    Date ModifiedAt;
    @CreatedDate
    Date CreatedAt;

}
