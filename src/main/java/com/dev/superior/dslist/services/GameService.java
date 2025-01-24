package com.dev.superior.dslist.services;
import com.dev.superior.dslist.dto.GameMiniDTO;
import com.dev.superior.dslist.entities.Game;
import com.dev.superior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMiniDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMiniDTO(x)).toList();
    }
}
