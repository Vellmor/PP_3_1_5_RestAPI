package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author KalachikovMP
 * @create 2022-06-26 13:19
 **/
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    int id;
    String name;
    String lastName;
    int age;
}
