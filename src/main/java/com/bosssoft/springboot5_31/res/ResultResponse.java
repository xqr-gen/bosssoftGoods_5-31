package com.bosssoft.springboot5_31.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xqr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResultResponse implements java.io.Serializable {
    private int code;
    private String message;

    private Object data;
}
