package com.dev.superior.dslist.services;
import com.dev.superior.dslist.dto.GameDTO;
import com.dev.superior.dslist.dto.GameMiniDTO;
import com.dev.superior.dslist.entities.Game;
import com.dev.superior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result  = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMiniDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMiniDTO(x)).toList();
    }


}
