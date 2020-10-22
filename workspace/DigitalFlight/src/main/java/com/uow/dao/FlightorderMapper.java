package com.uow.dao;

import com.uow.po.Flightorder;
import com.uow.po.FlightorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightorderMapper {
    int countByExample(FlightorderExample example);

    int deleteByExample(FlightorderExample example);

    int deleteByPrimaryKey(String flightOrder);

    int insert(Flightorder record);

    int insertSelective(Flightorder record);

    List<Flightorder> selectByExample(FlightorderExample example);

    Flightorder selectByPrimaryKey(String flightOrder);

    int updateByExampleSelective(@Param("record") Flightorder record, @Param("example") FlightorderExample example);

    int updateByExample(@Param("record") Flightorder record, @Param("example") FlightorderExample example);

    int updateByPrimaryKeySelective(Flightorder record);

    int updateByPrimaryKey(Flightorder record);
}