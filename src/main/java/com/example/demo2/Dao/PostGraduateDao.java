package com.example.demo2.Dao;

import com.example.demo2.Entity.PostGraduate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostGraduateDao {
    List<PostGraduate> selectAll();

    List<PostGraduate> selectId(@Param("id") int id);
}
