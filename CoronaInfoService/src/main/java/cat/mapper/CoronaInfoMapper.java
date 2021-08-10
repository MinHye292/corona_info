package cat.mapper;

import org.apache.ibatis.annotations.Mapper;

import cat.vo.CoronaInfoVO;

@Mapper
public interface CoronaInfoMapper {
    public void insertCoronaInfo(CoronaInfoVO vo);
    public CoronaInfoVO selectCoronaInfoByDate(String date);
}
