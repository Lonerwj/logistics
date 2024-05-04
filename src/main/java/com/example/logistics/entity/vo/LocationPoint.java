package com.example.logistics.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationPoint {

    private String lng; //经度
    private String lat; //纬度

}
