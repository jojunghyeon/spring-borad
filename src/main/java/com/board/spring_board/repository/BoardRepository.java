package com.board.spring_board.repository;

import com.board.spring_board.domain.Board;
import java.util.List;
import java.util.Optional;

public interface BoardRepository {

    Board save(Board board);
    Optional<Board> findById(Long id);
    Optional<Board> findByName(String title);
    List<Board> findAll();

}
