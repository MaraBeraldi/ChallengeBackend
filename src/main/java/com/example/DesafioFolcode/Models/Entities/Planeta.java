package com.example.DesafioFolcode.Models.Entities;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;
@RequiredArgsConstructor
@Getter
@Setter
public class Planeta {
    String name = "";
    Integer rotation_period = 0;
    Integer orbital_period = 0;
    Integer diameter = 0;
    String climate = "";
    String gravity = "";
    String terrain = "";
    String surface_water = "";
    String population = "";
    ArrayList<String> residents = new ArrayList<String>() {};
    ArrayList<String> films = new ArrayList<>(){};
    Date created;
    Date edited;
    String url;
}
