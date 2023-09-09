package com.jbp.animal060707.repository;

import com.jbp.animal060707.entities.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BoardRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public RowMapper<BoardEntity> mapBoardEntitiy() {
        return (resultSet, rowNum) -> {
            BoardEntity board = new BoardEntity();
            board.setIndex(resultSet.getInt("index"));
            board.setWriter(resultSet.getString("writer"));
            board.setTitle(resultSet.getString("title"));
            board.setContent(resultSet.getString("content"));
            board.setScope(resultSet.getString("scope"));
            board.setCreateDate(resultSet.getDate("create_Date"));
            board.setUpdateDate(resultSet.getDate("create_Date"));

            return board;
        };
    }

    public List<BoardEntity> getSearch(String keyword) {
        String query = "SELECT `index`,`writer`,`title`,`content`,`scope`,`create_Date`,`create_Date` From animal_api.board WHERE `index` LIKE ? ORDER BY `index` ASC";
        String searchKeyword = "%" + keyword + "%";
        return jdbcTemplate.query(query, mapBoardEntitiy(), searchKeyword);

    }

    public List<BoardEntity> getFindsCategory(String... categories) {
        StringBuilder query = new StringBuilder("SELECT * FROM `animal_api`.`board` WHERE writer IN (");
        for (int i = 0; i < categories.length; i++) {
            query.append("?");
            if (i < categories.length - 1) {
                query.append(",");
            }
        }

        query.append(") ORDER BY writer ASC;");
        return jdbcTemplate.query(query.toString(), mapBoardEntitiy(), categories);
    }

    public List<BoardEntity> getFindsTitle(String... titles) {
        StringBuilder query = new StringBuilder("SELECT * FROM `animal_api`.`board` WHERE title IN (");
        for (int i = 0; i < titles.length; i++) {
            query.append("?");
            if (i < titles.length - 1) {
                query.append(",");
            }
        }

        query.append(") ORDER BY title ASC");
        return jdbcTemplate.query(query.toString(), mapBoardEntitiy(), titles);
    }
}
