package com.mlsolution.sharehometools.api;

import com.mlsolution.sharehometools.dao.entity.Tool;
import com.mlsolution.sharehometools.manager.ToolManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/tools")
public class ToolApi {

    private ToolManager tools;

    @Autowired
    public ToolApi(ToolManager tools) {
        this.tools = tools;
    }
    // private List<Tool> tools;
//    public ToolApi() {
//        tools = new ArrayList<>();
//        tools.add(new Tool(1L,"Kosiarka", LocalDate.of(2000,12,5), 80));
//        tools.add(new Tool(2L,"Podkoszarka", LocalDate.of(2011,5,15), 60));
//        tools.add(new Tool(3L,"Wiertarka Bosch", LocalDate.of(2017,5,5), 50 ));
//    }
    @GetMapping("/all")
    public Iterable<Tool> getAll(){
        return tools.findAll();
    }

    @GetMapping
    public Optional<Tool> getById(@RequestParam Long index){
        return tools.findById(index);
    }
    @PostMapping
    public Tool addTool(@RequestBody Tool tool){
        return tools.save(tool);
    }
    @PutMapping
    public Tool updateTool(@RequestBody Tool tool){
        return tools.save(tool);
    }
    @DeleteMapping
    public void deleteTool(@RequestParam Long index){
        tools.deleteById(index);
    }
}

