package com.mlsolution.sharehometools.manager;

import com.mlsolution.sharehometools.dao.ToolRepo;
import com.mlsolution.sharehometools.dao.entity.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ToolManager {

    private ToolRepo toolRepo;

    @Autowired
    public ToolManager(ToolRepo toolRepo) {
        this.toolRepo = toolRepo;
    }

    public Optional<Tool> findById(Long id){
        return toolRepo.findById(id);
    }

    public Iterable<Tool> findAll(){
        return toolRepo.findAll();
    }

    public Tool save(Tool tool){
        return toolRepo.save(tool);
    }

    public void deleteById(Long id){
            toolRepo.deleteById(id);
}
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Tool(1L,"Kosiarka", LocalDate.of(2000,12,5), 80));
        save(new Tool(2L,"Podkoszarka", LocalDate.of(2011,5,15), 60));
        save(new Tool(3L,"Wiertarka Bosch", LocalDate.of(2017,5,5), 50 ));
    }
}



