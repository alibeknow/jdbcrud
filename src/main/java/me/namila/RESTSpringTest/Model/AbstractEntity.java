package me.namila.RESTSpringTest.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import me.namila.RESTSpringTest.Constants.ApiConstants;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Service;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class  AbstractEntity implements Serializable {

    @Getter
    @Setter
    @Id
    private long id;

    @Getter
    @Setter
    @JsonIgnore
    @CreatedDate
    @JsonFormat (pattern = ApiConstants.DATE_FORMAT)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INSERTDATE")
    private Date insertdate = new Date();

    @Getter
    @Setter
    @JsonIgnore
    @LastModifiedDate
    @JsonFormat (pattern = ApiConstants.DATE_FORMAT)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "OPERDATE", nullable = true)
    private Date operdate  = new Date();

    @Getter
    @Setter
    @JsonIgnore
    @JsonFormat (pattern = ApiConstants.DATE_FORMAT)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATEFROM", nullable = true)
    private Date datefrom = null;

    @Getter
    @Setter
    @JsonIgnore
    @JsonFormat (pattern = ApiConstants.DATE_FORMAT)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATETO", nullable = true)
    private Date dateto = null;

    @Getter
    @Setter
    @JsonIgnore
    @Column(name = "AUTHOR",nullable = true)
    private  String author;

    @Getter
    @Setter
    @JsonIgnore
    @Column(name = "OPER",nullable = true)
    private  String oper;


}
