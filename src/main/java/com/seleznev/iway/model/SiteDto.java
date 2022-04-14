package com.seleznev.iway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SiteDto {
    private int    user_id;                  //Идентификатор пользователя.
    private String start_place_point;        //Координаты места отправления
    private String finish_place_point;       //Координаты места назначения
    private String currency;                 //Код валюты. Возможные значения: EUR, USD, RUB, CNY, GBP, KZT, INR, UAH, CZK
    private String lang;                     //Язык возвращаемых данных. Возможные значения: ru, en, de, zh	Да
}
