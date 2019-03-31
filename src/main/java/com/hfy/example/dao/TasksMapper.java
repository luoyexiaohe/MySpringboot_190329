package com.hfy.example.dao;

import com.hfy.example.bean.Tasks;
import com.hfy.example.bean.TasksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TasksMapper {
    int countByExample(TasksExample example);

    int deleteByExample(TasksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tasks record);

    int insertSelective(Tasks record);

    List<Tasks> selectByExample(TasksExample example);

    Tasks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tasks record, @Param("example") TasksExample example);

    int updateByExample(@Param("record") Tasks record, @Param("example") TasksExample example);

    int updateByPrimaryKeySelective(Tasks record);

    int updateByPrimaryKey(Tasks record);
}