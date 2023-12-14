package com.example.elainaapi.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Id参数封装
 *
 * @author
 * @from
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}