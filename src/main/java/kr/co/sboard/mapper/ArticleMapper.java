package kr.co.sboard.mapper;

import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.dto.PageRequestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {

    // @Param : MyBatis SQL 참조 어노테이션 반드시 참조
    public List<ArticleDTO> selectAll(@Param("pageRequestDTO") PageRequestDTO pageRequestDTO);
    public int selectCountTotal(@Param("pageRequestDTO") PageRequestDTO pageRequestDTO);
}